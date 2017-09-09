<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>

<portlet:actionURL var="updateURL" >
	<portlet:param name="action" value="submitForm"/>
</portlet:actionURL>

<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "processAction();" %>' type="submit" />
</aui:button-row>


 <aui:script>

	function <portlet:namespace />processAction() {

		Liferay.fire('_submitAction', {});

	}

	var arr = "";

	Liferay.on('_callBackAction',function(event) {

		alert("callBackAction");

		var user_form = event.user_form;
		var user_namespace = event.user_namespace;

		var rss_form = event.rss_form;

		if(user_form != 'undefined' && user_form != null && user_form != "") {
			var emailAddress = user_form._vnptuser_WAR_vnptuserportlet_emailAddress;
			console.log("emailAddress =  " + emailAddress);
			console.log("user_namespace :" + user_namespace);

			$.ajax({
				   url: '<%= updateURL.toString() %>',
				   data: {
					   <portlet:namespace />namespace : user_namespace,
				       <portlet:namespace />user_form : JSON.stringify(user_form)
				   },
				   error: function() {
				     // $('#info').html('<p>An error has occurred</p>');
				   },
				   dataType: 'jsonp',
				   success: function(data) {
				     console.log("success");
				   },
				   type: 'POST'
				});
		}
	});



</aui:script>