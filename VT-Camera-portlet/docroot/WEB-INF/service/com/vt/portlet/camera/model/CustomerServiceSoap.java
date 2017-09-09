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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author MrNet
 * @generated
 */
public class CustomerServiceSoap implements Serializable {
	public static CustomerServiceSoap toSoapModel(CustomerService model) {
		CustomerServiceSoap soapModel = new CustomerServiceSoap();

		soapModel.setCustomerServiceId(model.getCustomerServiceId());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setDeployName(model.getDeployName());
		soapModel.setAppointDate(model.getAppointDate());
		soapModel.setServiceType(model.getServiceType());
		soapModel.setAddress(model.getAddress());
		soapModel.setDeployType(model.getDeployType());
		soapModel.setPackageType(model.getPackageType());
		soapModel.setIsdnNo(model.getIsdnNo());
		soapModel.setAccountType(model.getAccountType());

		return soapModel;
	}

	public static CustomerServiceSoap[] toSoapModels(CustomerService[] models) {
		CustomerServiceSoap[] soapModels = new CustomerServiceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomerServiceSoap[][] toSoapModels(
		CustomerService[][] models) {
		CustomerServiceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomerServiceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomerServiceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomerServiceSoap[] toSoapModels(
		List<CustomerService> models) {
		List<CustomerServiceSoap> soapModels = new ArrayList<CustomerServiceSoap>(models.size());

		for (CustomerService model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomerServiceSoap[soapModels.size()]);
	}

	public CustomerServiceSoap() {
	}

	public long getPrimaryKey() {
		return _customerServiceId;
	}

	public void setPrimaryKey(long pk) {
		setCustomerServiceId(pk);
	}

	public long getCustomerServiceId() {
		return _customerServiceId;
	}

	public void setCustomerServiceId(long customerServiceId) {
		_customerServiceId = customerServiceId;
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public String getDeployName() {
		return _deployName;
	}

	public void setDeployName(String deployName) {
		_deployName = deployName;
	}

	public Date getAppointDate() {
		return _appointDate;
	}

	public void setAppointDate(Date appointDate) {
		_appointDate = appointDate;
	}

	public long getServiceType() {
		return _serviceType;
	}

	public void setServiceType(long serviceType) {
		_serviceType = serviceType;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public long getDeployType() {
		return _deployType;
	}

	public void setDeployType(long deployType) {
		_deployType = deployType;
	}

	public String getPackageType() {
		return _packageType;
	}

	public void setPackageType(String packageType) {
		_packageType = packageType;
	}

	public String getIsdnNo() {
		return _isdnNo;
	}

	public void setIsdnNo(String isdnNo) {
		_isdnNo = isdnNo;
	}

	public long getAccountType() {
		return _accountType;
	}

	public void setAccountType(long accountType) {
		_accountType = accountType;
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
}