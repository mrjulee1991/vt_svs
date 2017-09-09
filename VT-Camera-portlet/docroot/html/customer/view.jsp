<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../init.jsp" %>


<aui:form action="" method="post" name="fm">

	<aui:row>
		<aui:col span="4">
			<aui:select name="customerGroup" label="Nhóm loại khách hàng" >
				<aui:option label="CMT" value="1" />
				<aui:option label="Hộ chiếu" value="2" />
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
			<aui:input name="identifyNo" label="CMT" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="issuePlace" label="Nơi cấp" />
		</aui:col>
		<aui:col span="4">
			<aui:field-wrapper label="Ngày cấp">
				<liferay-ui:input-date name="issueDate" >
				</liferay-ui:input-date>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="4">
			<aui:input name="fullName" label="Tên khách hàng" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="birthday" label="Ngày sinh" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="sex" label="Giới tính" />
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