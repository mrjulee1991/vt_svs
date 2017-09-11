<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.model.Portlet"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.model.LayoutTypePortlet"%>
<%@ include file="init.jsp" %>


<liferay-portlet:actionURL var="configurationURL" portletConfiguration="true" />

<%
	List<String> actualPortletList = layoutTypePortlet.getPortletIds();
	layoutTypePortlet.getPortlets().get(0).getPortletName();
	
	List<Portlet> portlets = layoutTypePortlet.getPortlets();
%>
<aui:form action="<%= configurationURL %>" method="post" name="configurationForm">
	<aui:select name="portletActives" multiple="true">
		<%
			for(Portlet portlet : portlets) {
				%>
					<aui:option 
						value='<%=StringPool.UNDERLINE + portlet.getPortletId()  + StringPool.UNDERLINE%>' 
						selected='<%=ArrayUtil.contains(portletActives, (StringPool.UNDERLINE + portlet.getPortletId() + StringPool.UNDERLINE)) %>' 
					>
							<%= HtmlUtil.escape(portlet.getPortletName()) %>
							
					</aui:option>
				<%
			}
		%>
	</aui:select>
	
	<aui:button type="submit" value="submit"/>

</aui:form>
