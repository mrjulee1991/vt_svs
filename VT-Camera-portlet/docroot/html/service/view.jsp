<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp" %>

<%
Calendar appointDate = CalendarFactoryUtil.getCalendar(timeZone,
		locale);
%>
<portlet:renderURL var="defaultServiceURL">
     <param value="controller" name="service">
</portlet:renderURL>
 
<aui:form action="<%= defaultServiceURL %>" method="post" name="fm">

	<aui:row>
		<aui:col span="8">
			<aui:input name="deployName" label="NV phát triển" />
		</aui:col>
		<aui:col span="4">
			<aui:field-wrapper label="Ngày hẹn lắp đặt">
				<liferay-ui:input-date name="appointDate"
					dayParam="appointDateDay" dayValue="<%=appointDate.get(Calendar.DATE)%>"
					monthParam="appointDateMonth" monthValue="<%=appointDate.get(Calendar.MONTH)%>"
					yearParam="appointDateYear" yearValue="<%=appointDate.get(Calendar.YEAR)%>"
					firstDayOfWeek="<%=appointDate.getFirstDayOfWeek() - 1%>"
				/>
			</aui:field-wrapper>
		</aui:col>

	</aui:row>

	<aui:row>
		<aui:col span="8">
			<aui:field-wrapper label="Dịch vụ">
				<aui:row>
					<aui:col span="4">
						<aui:input inlineLabel="right" name="serviceType" type="radio" value="1" label="Camera" />
					</aui:col>
					<aui:col span="4">
						<aui:input inlineLabel="right" name="serviceType" type="radio" value="2" label="Công nghệ"  />
					</aui:col>
					<aui:col span="4">
						<aui:input inlineLabel="right" name="serviceType" type="radio" value="3" label="Quang GPON"  />
					</aui:col>
				</aui:row>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="4">
			<aui:input name="address" label="Địa chỉ" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="duongDay" label="Đường dây" />
		</aui:col>
		<aui:col span="4">
			<aui:select name="customerGroup" label="Hình thức TK" >
				<aui:option label="Viettel triển khai" value="1" />
				<aui:option label="Thuê đối tác" value="2" />
			</aui:select>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="4">
			<aui:input name="packageType" label="Gói cước" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="isdnNo" label="ISDN/Account" />
		</aui:col>
		<aui:col span="4">
			<aui:select name="accountType" label="Loại TB" >
				<aui:option label="Cáp đồng" value="1" />
				<aui:option label="Cáp quang" value="2" />
			</aui:select>
		</aui:col>
	</aui:row>

</aui:form>


<aui:script>

Liferay.on('_submitAction',function(event) {

	AUI().ready('aui-form-validator', 'aui-overlay-context-panel', function(A) {

		var validator1 = new A.FormValidator({

			boundingBox: '#<portlet:namespace />fm',
			validateOnBlur: true,
			selectText: true,

			rules: {
				<portlet:namespace />deployName: {
					required: true
				},
				<portlet:namespace />address: {
					required: true
				}
			},

			fieldStrings: {
				<portlet:namespace />deployName: {
					required: 'Bạn phải nhập tên nhân viên triển khai'
				},
				<portlet:namespace />address: {
					required: 'Bạn phải nhập địa chỉ triển khai'
				}
			}

		});

 		validator1.validate();
 		
 		var formObj = $('#<portlet:namespace/>fm');
 		
 		if(validator1.hasErrors()){
			event.halt();
		}
		else {
			<portlet:namespace />checkValidate(formObj);
		}
	});

});

function <portlet:namespace />checkValidate(formObj) {
	var data = formObj.serializeArray().reduce(function(obj, item) {
 	    obj[item.name] = item.value;
 	    return obj;
 	}, {});
	
	var responsedata = {};
	
	responsedata.formData = data;
	responsedata.namespace = '<portlet:namespace/>';
	Liferay.fire('_callBackAction', {
			serviceData : responsedata
	});
}
Liferay.on('setCustomerService',function(event) {
	console.log("on setCustomerService");
	var obj = event.jsonCustomerService;
	if(obj != 'undefined' && obj != null && obj != "") {
		console.log("deployName :"+obj.deployName);		
		document.<portlet:namespace />fm.<portlet:namespace />deployName.value = obj.deployName ;
		document.<portlet:namespace />fm.<portlet:namespace />address.value = obj.address ;
	}
});

</aui:script>