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
import com.vt.portlet.camera.service.CustomerServiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class CustomerServiceClp extends BaseModelImpl<CustomerService>
	implements CustomerService {
	public CustomerServiceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerService.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerService.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _customerServiceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomerServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customerServiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("customerServiceId", getCustomerServiceId());
		attributes.put("customerId", getCustomerId());
		attributes.put("deployName", getDeployName());
		attributes.put("appointDate", getAppointDate());
		attributes.put("serviceType", getServiceType());
		attributes.put("address", getAddress());
		attributes.put("deployType", getDeployType());
		attributes.put("packageType", getPackageType());
		attributes.put("isdnNo", getIsdnNo());
		attributes.put("accountType", getAccountType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long customerServiceId = (Long)attributes.get("customerServiceId");

		if (customerServiceId != null) {
			setCustomerServiceId(customerServiceId);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String deployName = (String)attributes.get("deployName");

		if (deployName != null) {
			setDeployName(deployName);
		}

		Date appointDate = (Date)attributes.get("appointDate");

		if (appointDate != null) {
			setAppointDate(appointDate);
		}

		Long serviceType = (Long)attributes.get("serviceType");

		if (serviceType != null) {
			setServiceType(serviceType);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long deployType = (Long)attributes.get("deployType");

		if (deployType != null) {
			setDeployType(deployType);
		}

		String packageType = (String)attributes.get("packageType");

		if (packageType != null) {
			setPackageType(packageType);
		}

		String isdnNo = (String)attributes.get("isdnNo");

		if (isdnNo != null) {
			setIsdnNo(isdnNo);
		}

		Long accountType = (Long)attributes.get("accountType");

		if (accountType != null) {
			setAccountType(accountType);
		}
	}

	@Override
	public long getCustomerServiceId() {
		return _customerServiceId;
	}

	@Override
	public void setCustomerServiceId(long customerServiceId) {
		_customerServiceId = customerServiceId;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerServiceId",
						long.class);

				method.invoke(_customerServiceRemoteModel, customerServiceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomerId() {
		return _customerId;
	}

	@Override
	public void setCustomerId(long customerId) {
		_customerId = customerId;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerId", long.class);

				method.invoke(_customerServiceRemoteModel, customerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDeployName() {
		return _deployName;
	}

	@Override
	public void setDeployName(String deployName) {
		_deployName = deployName;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setDeployName", String.class);

				method.invoke(_customerServiceRemoteModel, deployName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAppointDate() {
		return _appointDate;
	}

	@Override
	public void setAppointDate(Date appointDate) {
		_appointDate = appointDate;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setAppointDate", Date.class);

				method.invoke(_customerServiceRemoteModel, appointDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getServiceType() {
		return _serviceType;
	}

	@Override
	public void setServiceType(long serviceType) {
		_serviceType = serviceType;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceType", long.class);

				method.invoke(_customerServiceRemoteModel, serviceType);
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

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_customerServiceRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDeployType() {
		return _deployType;
	}

	@Override
	public void setDeployType(long deployType) {
		_deployType = deployType;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setDeployType", long.class);

				method.invoke(_customerServiceRemoteModel, deployType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPackageType() {
		return _packageType;
	}

	@Override
	public void setPackageType(String packageType) {
		_packageType = packageType;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setPackageType", String.class);

				method.invoke(_customerServiceRemoteModel, packageType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIsdnNo() {
		return _isdnNo;
	}

	@Override
	public void setIsdnNo(String isdnNo) {
		_isdnNo = isdnNo;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setIsdnNo", String.class);

				method.invoke(_customerServiceRemoteModel, isdnNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAccountType() {
		return _accountType;
	}

	@Override
	public void setAccountType(long accountType) {
		_accountType = accountType;

		if (_customerServiceRemoteModel != null) {
			try {
				Class<?> clazz = _customerServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountType", long.class);

				method.invoke(_customerServiceRemoteModel, accountType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomerServiceRemoteModel() {
		return _customerServiceRemoteModel;
	}

	public void setCustomerServiceRemoteModel(
		BaseModel<?> customerServiceRemoteModel) {
		_customerServiceRemoteModel = customerServiceRemoteModel;
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

		Class<?> remoteModelClass = _customerServiceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerServiceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerServiceLocalServiceUtil.addCustomerService(this);
		}
		else {
			CustomerServiceLocalServiceUtil.updateCustomerService(this);
		}
	}

	@Override
	public CustomerService toEscapedModel() {
		return (CustomerService)ProxyUtil.newProxyInstance(CustomerService.class.getClassLoader(),
			new Class[] { CustomerService.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerServiceClp clone = new CustomerServiceClp();

		clone.setCustomerServiceId(getCustomerServiceId());
		clone.setCustomerId(getCustomerId());
		clone.setDeployName(getDeployName());
		clone.setAppointDate(getAppointDate());
		clone.setServiceType(getServiceType());
		clone.setAddress(getAddress());
		clone.setDeployType(getDeployType());
		clone.setPackageType(getPackageType());
		clone.setIsdnNo(getIsdnNo());
		clone.setAccountType(getAccountType());

		return clone;
	}

	@Override
	public int compareTo(CustomerService customerService) {
		long primaryKey = customerService.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerServiceClp)) {
			return false;
		}

		CustomerServiceClp customerService = (CustomerServiceClp)obj;

		long primaryKey = customerService.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{customerServiceId=");
		sb.append(getCustomerServiceId());
		sb.append(", customerId=");
		sb.append(getCustomerId());
		sb.append(", deployName=");
		sb.append(getDeployName());
		sb.append(", appointDate=");
		sb.append(getAppointDate());
		sb.append(", serviceType=");
		sb.append(getServiceType());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", deployType=");
		sb.append(getDeployType());
		sb.append(", packageType=");
		sb.append(getPackageType());
		sb.append(", isdnNo=");
		sb.append(getIsdnNo());
		sb.append(", accountType=");
		sb.append(getAccountType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.vt.portlet.camera.model.CustomerService");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>customerServiceId</column-name><column-value><![CDATA[");
		sb.append(getCustomerServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deployName</column-name><column-value><![CDATA[");
		sb.append(getDeployName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appointDate</column-name><column-value><![CDATA[");
		sb.append(getAppointDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceType</column-name><column-value><![CDATA[");
		sb.append(getServiceType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deployType</column-name><column-value><![CDATA[");
		sb.append(getDeployType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageType</column-name><column-value><![CDATA[");
		sb.append(getPackageType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isdnNo</column-name><column-value><![CDATA[");
		sb.append(getIsdnNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountType</column-name><column-value><![CDATA[");
		sb.append(getAccountType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _customerServiceId;
	private long _customerId;
	private String _deployName;
	private Date _appointDate;
	private long _serviceType;
	private String _address;
	private long _deployType;
	private String _packageType;
	private String _isdnNo;
	private long _accountType;
	private BaseModel<?> _customerServiceRemoteModel;
	private Class<?> _clpSerializerClass = com.vt.portlet.camera.service.ClpSerializer.class;
}