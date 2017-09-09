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
			<aui:field-wrapper name="serviceField">
				<aui:input inlineLabel="right" name="serviceType" type="radio" value="1" label="Camera" />
				<aui:input inlineLabel="right" name="serviceType" type="radio" value="2" label="Công nghệ"  />
				<aui:input inlineLabel="right" name="serviceType" type="radio" value="3" label="Quang GPON"  />
			</aui:field-wrapper>
		</aui:col>
		<aui:col span="4">
			<aui:input name="duongDay" label="Đường dây" />
		</aui:col>
	</aui:row>

	<aui:row>
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