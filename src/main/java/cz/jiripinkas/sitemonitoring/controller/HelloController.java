package cz.jiripinkas.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import cz.jiripinkas.sitemonitoring.service.HelloSpringService;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@ManagedBean
public class HelloController {
	
	
	@ManagedProperty("#{helloSpringService}")
	private HelloSpringService helloSpringService;
	
	
	public String showHello(){
		return helloSpringService.sayHello();
	}



}
