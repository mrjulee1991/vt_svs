<%@page import="com.vt.portlet.camera.utils.CameraUtils"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<portlet:actionURL var="updateURL" >
	<portlet:param name="action" value="submitForm"/>
</portlet:actionURL>

<liferay-ui:success key="add-success" message="add-successfull"/>

<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "processAction();" %>' type="submit" />
</aui:button-row>


 <aui:script>

 	var customer_form;
	var customer_namespace;
	var service_form;
	var service_namespace;
	
	var portletActivesTemp = [];
	
	function <portlet:namespace />processAction() {

		Liferay.fire('_submitAction', {});
		
		//reset parameter value
		 portletActivesTemp = [];
// 		 customer_flag = 'false';
// 		 service_flag = 'false';
		
		
	 	customer_form = "";
		customer_namespace = "";
		service_form = "";
		service_namespace = "";

	}

	Liferay.on('_callBackAction',function(event) {
		console.log("Gọi hàm callBackAction")
		// get data from customer form
		
		
		var customerData = event.customerData;
		var serviceData = event.serviceData;
		
		if(customerData) {
			portletActivesTemp.push(customerData.namespace);
		}
		
		if(serviceData) {
			portletActivesTemp.push(serviceData.namespace);
		}
		
		
		var plActive = <portlet:namespace/>compareArr(portletActivesTemp.join(","), '<%=StringUtil.merge(portletActives)%>');
		console.log("plActive   " + plActive);
		if(plActive == 'true') {
				$.ajax({
		 			   url: '<%= updateURL.toString() %>',
		 			   data: {
		 			       <portlet:namespace />customer_form : JSON.stringify(customer_form),
		 			       <portlet:namespace />service_form : JSON.stringify(service_form)
		 			   },
		 			   error: function() {
		 			   		console.log("Có lỗi khi gọi hàm ajax");
		 			   },
		 			   dataType: 'jsonp',
		 			   success: function(data) {
		 			     	console.log("success");
		 			     	alert("Submit ajax thành công");
		 			   },
		 			   type: 'POST'
		 			});
				// reset temp
				 portletActivesTemp = [];
		}
// 		if(customer_namespace == 'undefined' || customer_namespace == null || customer_namespace == "") {
// 			customer_form = event.customer_form;
// 			customer_namespace = event.customer_namespace;
// 		}

// 		// get data from service form
// 		if(service_namespace == 'undefined' || service_namespace == null || service_namespace == "") {
// 			service_form = event.service_form;
// 			service_namespace = event.service_namespace;
// 		}

// 		if(customer_namespace != 'undefined' && customer_namespace != null && customer_namespace != "") {

// 			$.ajax({
// 			   url: '<%= updateURL.toString() %>',
// 			   data: {
// 				   <portlet:namespace />customer_namespace : customer_namespace,
// 			       <portlet:namespace />customer_form : JSON.stringify(customer_form),
// 				   <portlet:namespace />service_namespace : service_namespace,
// 			       <portlet:namespace />service_form : JSON.stringify(service_form)
// 			   },
// 			   error: function() {
// 			   		console.log("Có lỗi khi gọi hàm ajax");
// 			   },
// 			   dataType: 'jsonp',
// 			   success: function(data) {
// 			     	console.log("success");
// 			     	alert("Submit ajax thành công");
// 			   },
// 			   type: 'POST'
// 			});
// 		}
	});

	/* function <portlet:namespace/>validateActionCheck(responseData) {
		var flag = 'false';
		if(responseData) {
			if(responseData.hasError == 'true') {
				flag = 'true';
			}
		}
		return flag;
	} */
	
	function <portlet:namespace/>compareArr(strArr1, strArr2) {
		var arrTmp1 = strArr1.split(",");
		arrTmp1 = arrTmp1.sort();
		
		var arrTmp2 =  strArr2.split(",");
		arrTmp2 = arrTmp2.sort();
		
		console.log("arrTmp1  " + arrTmp1.join(","));
		console.log("arrTmp2  " + arrTmp2.join(","));
		
		if(arrTmp1.join(",") == arrTmp2.join(",")) {
			return 'true';
		} else {
			return 'false';
		}
	}

</aui:script>