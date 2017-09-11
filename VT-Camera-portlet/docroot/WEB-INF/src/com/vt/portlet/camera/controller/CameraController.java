package com.vt.portlet.camera.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.vt.portlet.camera.model.CustomerService;
import com.vt.portlet.camera.model.impl.CustomerServiceImpl;
import com.vt.portlet.camera.service.CustomerLocalServiceUtil;
import com.vt.portlet.camera.service.CustomerServiceLocalServiceUtil;

@Controller
@RequestMapping("VIEW")
public class CameraController {

	@RenderMapping
	public String renderHomePage() {
		System.out.println("renderHomePage come on baby");
		return "view";
	}

	
	@ResourceMapping("getSelectedCustomer")
	public void getSelectedCustomer(ResourceRequest resourceRequest,
			ResourceResponse response) throws IOException, PortalException,
			SystemException {
		System.out.println("getSelectedCustomer ");
		
		Long customerId = ParamUtil.getLong(resourceRequest,"customerId", 0L);
		
		System.out.println("customerId :"+customerId);
		
		List<CustomerService> lstService = CustomerServiceLocalServiceUtil.findBycustomerId(customerId);
		for (CustomerService customerService : lstService) {
			System.out.println("customerService :"+customerService.getDeployName());
		}
		
		CustomerService obj = null;
		if(!lstService.isEmpty()) {
			obj = lstService.get(0);
		}
		
		JSONObject jsonCar = JSONFactoryUtil.createJSONObject();
		
		if(obj != null) {
			jsonCar.put("deployName", obj.getDeployName());
			jsonCar.put("address",obj.getAddress());			
		}
		
		PrintWriter writer = response.getWriter();
		writer.println(jsonCar);
	}
	
}
