package com.vt.portlet.camera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping(value="VIEW", params="controller=service")
public class ServiceController {

	@RenderMapping
	public String renderHomePage() {
		System.out.println("renderServicePage come on baby");
		return "view";
	}

}
