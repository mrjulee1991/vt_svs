/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vt.portlet.camera.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vt.portlet.camera.service.ClpSerializer;
import com.vt.portlet.camera.service.CustomerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class CustomerClp extends BaseModelImpl<Customer> implements Customer {
	public CustomerClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Customer.class;
	}

	@Override
	public String getModelClassName() {
		return Customer.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _customerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("customerId", getCustomerId());
		attributes.put("customerGroup", getCustomerGroup());
		attributes.put("customerType", getCustomerType());
		attributes.put("fullName", getFullName());
		attributes.put("birthday", getBirthday());
		attributes.put("sex", getSex());
		attributes.put("nationalId", getNationalId());
		attributes.put("address", getAddress());
		attributes.put("description", getDescription());
		attributes.put("identifyNo", getIdentifyNo());
		attributes.put("issueDate", getIssueDate());
		attributes.put("issuePlace", getIssuePlace());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		Long customerGroup = (Long)attributes.get("customerGroup");

		if (customerGroup != null) {
			setCustomerGroup(customerGroup);
		}

		Long customerType = (Long)attributes.get("customerType");

		if (customerType != null) {
			setCustomerType(customerType);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		Long sex = (Long)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		Long nationalId = (Long)attributes.get("nationalId");

		if (nationalId != null) {
			setNationalId(nationalId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String identifyNo = (String)attributes.get("identifyNo");

		if (identifyNo != null) {
			setIdentifyNo(identifyNo);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		String issuePlace = (String)attributes.get("issuePlace");

		if (issuePlace != null) {
			setIssuePlace(issuePlace);
		}
	}

	@Override
	public long getCustomerId() {
		return _customerId;
	}

	@Override
	public void setCustomerId(long customerId) {
		_customerId = customerId;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerId", long.class);

				method.invoke(_customerRemoteModel, customerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomerGroup() {
		return _customerGroup;
	}

	@Override
	public void setCustomerGroup(long customerGroup) {
		_customerGroup = customerGroup;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerGroup", long.class);

				method.invoke(_customerRemoteModel, customerGroup);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomerType() {
		return _customerType;
	}

	@Override
	public void setCustomerType(long customerType) {
		_customerType = customerType;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerType", long.class);

				method.invoke(_customerRemoteModel, customerType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_customerRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthday() {
		return _birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		_birthday = birthday;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthday", Date.class);

				method.invoke(_customerRemoteModel, birthday);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSex() {
		return _sex;
	}

	@Override
	public void setSex(long sex) {
		_sex = sex;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setSex", long.class);

				method.invoke(_customerRemoteModel, sex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNationalId() {
		return _nationalId;
	}

	@Override
	public void setNationalId(long nationalId) {
		_nationalId = nationalId;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setNationalId", long.class);

				method.invoke(_customerRemoteModel, nationalId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_customerRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_customerRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIdentifyNo() {
		return _identifyNo;
	}

	@Override
	public void setIdentifyNo(String identifyNo) {
		_identifyNo = identifyNo;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setIdentifyNo", String.class);

				method.invoke(_customerRemoteModel, identifyNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueDate", Date.class);

				method.invoke(_customerRemoteModel, issueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuePlace() {
		return _issuePlace;
	}

	@Override
	public void setIssuePlace(String issuePlace) {
		_issuePlace = issuePlace;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuePlace", String.class);

				method.invoke(_customerRemoteModel, issuePlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomerRemoteModel() {
		return _customerRemoteModel;
	}

	public void setCustomerRemoteModel(BaseModel<?> customerRemoteModel) {
		_customerRemoteModel = customerRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _customerRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_customerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerLocalServiceUtil.addCustomer(this);
		}
		else {
			CustomerLocalServiceUtil.updateCustomer(this);
		}
	}

	@Override
	public Customer toEscapedModel() {
		return (Customer)ProxyUtil.newProxyInstance(Customer.class.getClassLoader(),
			new Class[] { Customer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerClp clone = new CustomerClp();

		clone.setCustomerId(getCustomerId());
		clone.setCustomerGroup(getCustomerGroup());
		clone.setCustomerType(getCustomerType());
		clone.setFullName(getFullName());
		clone.setBirthday(getBirthday());
		clone.setSex(getSex());
		clone.setNationalId(getNationalId());
		clone.setAddress(getAddress());
		clone.setDescription(getDescription());
		clone.setIdentifyNo(getIdentifyNo());
		clone.setIssueDate(getIssueDate());
		clone.setIssuePlace(getIssuePlace());

		return clone;
	}

	@Override
	public int compareTo(Customer customer) {
		int value = 0;

		value = getFullName().compareTo(customer.getFullName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerClp)) {
			return false;
		}

		CustomerClp customer = (CustomerClp)obj;

		long primaryKey = customer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{customerId=");
		sb.append(getCustomerId());
		sb.append(", customerGroup=");
		sb.append(getCustomerGroup());
		sb.append(", customerType=");
		sb.append(getCustomerType());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", nationalId=");
		sb.append(getNationalId());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", identifyNo=");
		sb.append(getIdentifyNo());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", issuePlace=");
		sb.append(getIssuePlace());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.vt.portlet.camera.model.Customer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerGroup</column-name><column-value><![CDATA[");
		sb.append(getCustomerGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerType</column-name><column-value><![CDATA[");
		sb.append(getCustomerType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationalId</column-name><column-value><![CDATA[");
		sb.append(getNationalId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>identifyNo</column-name><column-value><![CDATA[");
		sb.append(getIdentifyNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuePlace</column-name><column-value><![CDATA[");
		sb.append(getIssuePlace());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _customerId;
	private long _customerGroup;
	private long _customerType;
	private String _fullName;
	private Date _birthday;
	private long _sex;
	private long _nationalId;
	private String _address;
	private String _description;
	private String _identifyNo;
	private Date _issueDate;
	private String _issuePlace;
	private BaseModel<?> _customerRemoteModel;
	private Class<?> _clpSerializerClass = com.vt.portlet.camera.service.ClpSerializer.class;
}