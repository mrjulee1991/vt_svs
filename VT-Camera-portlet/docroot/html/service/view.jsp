<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp" %>

<aui:form action="" method="post" name="fm">

	<aui:row>
		<aui:col span="8">
			<aui:input name="deployName" label="NV phát triển" />
		</aui:col>
		<aui:col span="4">
			<aui:field-wrapper label="Ngày hẹn lắp đặt">
				<liferay-ui:input-date name="appointDate" >
				</liferay-ui:input-date>
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
				<portlet:namespace />address: {
					required: true
				},
				<portlet:namespace />customerGroup: {
					required: true
				},
				<portlet:namespace />packageType: {
					required: true
				}
			},

			fieldStrings: {
				<portlet:namespace />address: {
					required: 'Bạn phải nhập địa chỉ triển khai'
				},
				<portlet:namespace />customerGroup: {
					required: 'Bạn phải chọn hình thức triển khai'
				},
				<portlet:namespace />packageType: {
					required: 'Bạn phải nhập gói cước'
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

// 		if(validator1.hasErrors()){
// 			event.halt();
// 		}
// 		else {
// 		 	var data = $('#<portlet:namespace/>fm').serializeArray().reduce(function(obj, item) {
// 		 	    obj[item.name] = item.value;
// 		 	    return obj;
// 		 	}, {});

// 			Liferay.fire('_callBackAction', {
// 	 			service_form : data,
// 	 			service_namespace : '<portlet:namespace/>'
// 	 		});
// 		}

	});

});

function <portlet:namespace />checkValidate(formObj) {
	var data = formObj.serializeArray().reduce(function(obj, item) {
 	    obj[item.name] = item.value;
 	    return obj;
 	}, {});
	
	var responsedata = {};
	
	responsedata.data = data;
	responsedata.namespace = '<portlet:namespace/>';
	Liferay.fire('_callBackAction', {
			serviceData : responsedata
	});

}

</aui:script>