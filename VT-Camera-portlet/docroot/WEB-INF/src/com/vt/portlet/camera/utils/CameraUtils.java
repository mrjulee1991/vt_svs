package com.vt.portlet.camera.utils;

import java.util.List;

import com.liferay.portal.kernel.util.StringUtil;

public class CameraUtils {
	public static String ActivePortletTempUtil(List<String> portletActiveTemps ,String activePortletItem) {
		portletActiveTemps.add(activePortletItem);
		return StringUtil.merge(portletActiveTemps);
	}
}
