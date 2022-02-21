package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String hello(@RequestParam(value = "name",required = false) String name,
						@RequestParam(value = "lastName",required = false) String lastName,
						@RequestParam(value = "times",required = false) Integer times) {
		
		String hello = "hello ";
		if (name == null) {
			return hello + "human";	
		} else if (lastName==null) {
			return hello + name;
		}else if (times == null) {
			return hello + name + " "+lastName;
		}else {
			return "<div>"+(hello + name + " "+lastName+"<br>").repeat(3)+"</div>";
			}
		}
}
