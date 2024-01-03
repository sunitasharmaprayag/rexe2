package com.example.demo11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {
@GetMapping("/h")
public String gotoIndex()
{
	return "index";
}
}

