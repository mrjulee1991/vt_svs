<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.vt.portlet.camera.service.CustomerLocalServiceUtil"%>
<%@page import="com.vt.portlet.camera.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../init.jsp" %>

<%
List<Customer> lstCustomer = CustomerLocalServiceUtil.getCustomers(-1, -1);
System.out.println("lst size :"+lstCustomer.size());

Calendar issueDate = CalendarFactoryUtil.getCalendar(timeZone,
		locale);

%>

<portlet:resourceURL id="getSelectedCustomer" var="getSelectedCustomerURL">
</portlet:resourceURL>
<aui:form action="" method="post" name="fm">

	<aui:row>
		<aui:col span="8">
			<aui:select name="customerService" label="Chọn khách hàng" onChange="getCustomerService()">
				<%
					for(Customer customer : lstCustomer) {
				%>
						<aui:option label="<%= customer.getFullName() %>" value="<%= customer.getCustomerId() %>" />
				<%						
					}
				%>
			</aui:select>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col span="4">
			<aui:select name="customerGroup" label="Nhóm loại khách hàng" >
				<aui:option label="Cá nhân trong nước" value="1" />
				<aui:option label="Doanh nghiệp" value="2" />
			</aui:select>
		</aui:col>
		<aui:col span="4">
			<aui:select name="customerType" label="Loại khách hàng" >
				<aui:option label="VIE - Tư nhân trong nước" value="1" />
				<aui:option label="Doanh nghiệp" value="2" />
			</aui:select>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="4">
			<aui:input name="identifyNo" label="CMT">
			</aui:input>
		</aui:col>
		<aui:col span="4">
			<aui:input name="issuePlace" label="Nơi cấp" />
		</aui:col>
		<aui:col span="4">
			<aui:field-wrapper label="Ngày cấp">
				<liferay-ui:input-date name="issueDate"
					dayParam="issueDateDay" dayValue="<%=issueDate.get(Calendar.DATE)%>"
					monthParam="issueDateMonth" monthValue="<%=issueDate.get(Calendar.MONTH)%>"
					yearParam="issueDateYear" yearValue="<%=issueDate.get(Calendar.YEAR)%>"
					firstDayOfWeek="<%=issueDate.getFirstDayOfWeek() - 1%>"
				/>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="4">
			<aui:input name="fullName" label="Tên khách hàng" />
		</aui:col>
		<aui:col span="4">
			<aui:field-wrapper label="Ngày sinh">
				<liferay-ui:input-date name="birthday"
					dayParam="issueDateDay" dayValue="<%=issueDate.get(Calendar.DATE)%>"
					monthParam="issueDateMonth" monthValue="<%=issueDate.get(Calendar.MONTH)%>"
					yearParam="issueDateYear" yearValue="<%=issueDate.get(Calendar.YEAR)%>"
					firstDayOfWeek="<%=issueDate.getFirstDayOfWeek() - 1%>"
				/>
			</aui:field-wrapper>
		</aui:col>
		<aui:col span="4">
			<aui:select name="sex" label="Giới tính" >
				<aui:option label="Nam" value="1" />
				<aui:option label="Nữ" value="2" />
			</aui:select>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="4">
			<aui:input name="nationalId" label="Quốc tịch" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="address" label="Địa chỉ" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="description" label="Ghi chú" />
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
				<portlet:namespace />identifyNo: {
					required: true,
					number: true
				}
// 				<portlet:namespace />issuePlace: {
// 					required: true
// 				},
// 				<portlet:namespace />issueDate: {
// 					required: true
// 				}
			},

			fieldStrings: {
				<portlet:namespace />identifyNo: {
					required: 'Bạn phải nhập số CMT',
					number: 'Chỉ dc nhập số'
				}
// 				<portlet:namespace />issuePlace: {
// 					required: 'Bạn phải nhập nơi cấp CMT'
// 				},
// 				<portlet:namespace />issueDate: {
// 					required: 'Bạn phải nhập ngày cấp CMT'
// 				}
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
	responsedata.data = data;
	responsedata.namespace = '<portlet:namespace />';
	Liferay.fire('_callBackAction', {
			customerData : responsedata
	});
function getCustomerService() {
	var sel = document.getElementById("<portlet:namespace/>customerService");
   	var customerId = sel.options[sel.selectedIndex].value;
   	console.log("customerId :"+customerId);
   	
   	$.ajax({
		url:'<%= getSelectedCustomerURL %>',
		dataType: "json",
		data:{
			<portlet:namespace />customerId: customerId
		},
		type: "get",
		success: function(data){
			//Firing the event.
			Liferay.fire('setCustomerService', {jsonCustomerService:data});
		}
	});
	   
}
</aui:script>