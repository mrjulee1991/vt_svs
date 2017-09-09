package com.vt.portlet.camera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class CameraController {

	@RenderMapping
	public String renderHomePage() {
		System.out.println("renderHomePage come on baby");
		return "view";
	}

}
