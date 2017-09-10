<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../init.jsp" %>


<aui:form action="" method="post" name="fm">

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

		if(validator1.hasErrors()){
			event.halt();
		}
		else {
		 	var data = $('#<portlet:namespace/>fm').serializeArray().reduce(function(obj, item) {
		 	    obj[item.name] = item.value;
		 	    return obj;
		 	}, {});

			Liferay.fire('_callBackAction', {
	 			customer_form : data,
	 			customer_namespace : '<portlet:namespace/>'
	 		});
		}

	});

});

</aui:script>