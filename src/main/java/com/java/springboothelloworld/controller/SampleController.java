package com.java.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class SampleController   
{  
@RequestMapping("/")  
public String hello()   
{  
return "Hello javaTpoint";  
}  
}  