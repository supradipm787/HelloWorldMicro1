package com.test.helloworld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author manoj.bardhan
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
  
@RequestMapping("/")
@ResponseBody
public String sayHello() {
return "Hello World Developers - Welcome To DevOps!!!";
}
  
@RequestMapping("/trainingScrumMaster")
@ResponseBody
public String sayAgileDevOps() {
return "Hello ScrumMasters - Welcome To DevOps!!!";
}
  
}
