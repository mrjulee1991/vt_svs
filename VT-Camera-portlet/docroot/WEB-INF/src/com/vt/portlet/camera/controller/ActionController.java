package com.vt.portlet.camera.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.vt.portlet.camera.model.Customer;
import com.vt.portlet.camera.model.CustomerService;
import com.vt.portlet.camera.model.impl.CustomerImpl;
import com.vt.portlet.camera.model.impl.CustomerServiceImpl;
import com.vt.portlet.camera.service.CustomerLocalServiceUtil;
import com.vt.portlet.camera.service.CustomerServiceLocalServiceUtil;

@Controller
@RequestMapping("VIEW")
public class ActionController {

	private static final Log _log = LogFactoryUtil.getLog(ActionController.class);

	@RenderMapping
	public String renderHomePage(RenderRequest renderRequest,
			RenderResponse renderResponse) {
		System.out.println("view default page");
		
		return "view";
	}
	
	@RequestMapping(params="action=defaultView")
	public String defaultViewPage(RenderRequest renderRequest,
			RenderResponse renderResponse) {
		System.out.println("defaultViewPage");
		
		SessionErrors.add(renderRequest, "action-error");
		return "view";
	}
	
	@RequestMapping(params="action=viewAction")
	public String viewPage(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		
		SessionMessages.add(renderRequest, "add-success");
		System.out.println("viewActionPage:");
		
		return "view";
	}

	@ActionMapping(params="action=submitForm")
	public void update (ActionRequest actionRequest,
			ActionResponse actionResponse) throws JSONException, SystemException {

		System.out.println("submitForm ...");

		// Customer
		String customer_namespace = ParamUtil.get(actionRequest, "customer_namespace", "");
		String customer_form = ParamUtil.get(actionRequest, "customer_form", "");

		JSONObject jsonCustomer = JSONFactoryUtil.createJSONObject(customer_form.toString());
		String identifyNo = jsonCustomer.getString(customer_namespace+"identifyNo");
		String issuePlace = jsonCustomer.getString(customer_namespace+"issuePlace");
		String fullName = jsonCustomer.getString(customer_namespace+"fullName");
		System.out.println("customer cmt :"+identifyNo);

		Customer customer = new CustomerImpl();
		customer.setIdentifyNo(identifyNo);
		customer.setIssuePlace(issuePlace);
		customer.setFullName(fullName);

		CustomerLocalServiceUtil.addCustomer(customer);

		// Service
		String service_namespace = ParamUtil.get(actionRequest, "service_namespace", "");
		String service_form = ParamUtil.get(actionRequest, "service_form", "");

		JSONObject jsonService = JSONFactoryUtil.createJSONObject(service_form.toString());
		String deployName = jsonService.getString(service_namespace+"deployName");
		String serviceType = jsonService.getString(service_namespace+"serviceType");
		String address = jsonService.getString(service_namespace+"address");
		System.out.println("service deployName :"+deployName);

		CustomerService customerService = new CustomerServiceImpl();
		customerService.setDeployName(deployName);
		if(serviceType != null && !"".equals(serviceType)) {
			customerService.setServiceType(Long.valueOf(serviceType));
		}
		customerService.setAddress(address);
		customerService.setCustomerId(customer.getCustomerId());

		CustomerServiceLocalServiceUtil.addCustomerService(customerService);

		SessionMessages.add(actionRequest, "add-success");
		SessionErrors.add(actionRequest, "action-error");
		actionResponse.setRenderParameter("action", "defaultView");
	}
}
