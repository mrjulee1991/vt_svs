package com.vt.portlet.action.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

@Controller
@RequestMapping("VIEW")
public class ActionController {

	private static final Log _log = LogFactoryUtil.getLog(ActionController.class);

	@RenderMapping
	public String renderHomePage() {
		return "view";
	}
	
	@ActionMapping(params="action=submitForm")
	public void update (ActionRequest actionRequest, ActionResponse actionResponse) throws JSONException {
		
		System.out.println("submitForm ...");
		
		String data = ParamUtil.get(actionRequest, "user_form", "");
		
		System.out.println("user_form :"+data.toString());
		
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(data.toString());
		
		System.out.println("jsonObject.Email " + jsonObject.getString("_vnptuser_WAR_vnptuserportlet_emailAddress"));
	}
}
