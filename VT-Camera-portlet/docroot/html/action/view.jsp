<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../init.jsp" %>
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

	function <portlet:namespace />processAction() {

		Liferay.fire('_submitAction', {});

		//reset parameter value
	 	customer_form = "";
		customer_namespace = "";
		service_form = "";
		service_namespace = "";

	}

	Liferay.on('_callBackAction',function(event) {
		console.log("Gọi hàm callBackAction")
		// get data from customer form
		if(customer_namespace == 'undefined' || customer_namespace == null || customer_namespace == "") {
			customer_form = event.customer_form;
			customer_namespace = event.customer_namespace;
		}

		// get data from service form
		if(service_namespace == 'undefined' || service_namespace == null || service_namespace == "") {
			service_form = event.service_form;
			service_namespace = event.service_namespace;
		}

		if(customer_namespace != 'undefined' && customer_namespace != null && customer_namespace != "") {

			$.ajax({
			   url: '<%= updateURL.toString() %>',
			   data: {
				   <portlet:namespace />customer_namespace : customer_namespace,
			       <portlet:namespace />customer_form : JSON.stringify(customer_form),
				   <portlet:namespace />service_namespace : service_namespace,
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
		}
	});



</aui:script>