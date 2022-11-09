package com.prob.SpringProb.controller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prob.SpringProb.controller.service.ProbService;


@RestController
@RequestMapping("/api/")
public class ProbController {



@Autowired ProbService obj;

@Value("${data}")
private String data;

@RequestMapping(value = "testAPI", method = RequestMethod.GET)
public ResponseEntity<?> testApi(@RequestParam Map<String, String> map)throws Exception {

	System.out.println("i/p"+map);
	int ans = 0;
	
	try {
      
     String s=map.get("op").toString();

int a=Integer.parseInt(map.get("n1").toString());
int b=Integer.parseInt(map.get("n2").toString());
switch (s) {
case "add":
ans = obj.add(a, b);
break;
case "sub":
ans = obj.sub(a, b);
break;
case "multiply":
ans = obj.mul(a, b);
break;
case "division":

ans = obj.div(a, b);
break;
}
   map.put("status ","success ");
	}
catch(Exception e) {
   
	map.put("status ","fail");
	System.out.println("o/p"+e);
      }
	map.put("ans", Integer.toString(ans));
    return new ResponseEntity<>(map, HttpStatus.OK);
}
@RequestMapping(value = "Load", method = RequestMethod.GET)
public ResponseEntity<?> loadProperty(@RequestParam Map<String, String> requestParam) throws Exception {

Properties prop = new Properties();

prop.put("Id:","102");
prop.put("Name:",  "Sowmi");
prop.put("Designation:","FullStackDeveloper");

FileOutputStream out = new FileOutputStream("D:\\FileProb\\File.properties");
prop.store(out,"Details of Hari_Employee   :");

try {

FileInputStream fin = new FileInputStream("data");
prop.load(fin);

} catch (Exception e) {
System.out.println((e));
}

return new ResponseEntity<>(prop , HttpStatus.OK);
}


}
