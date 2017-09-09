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
public class CustomerSoap implements Serializable {
	public static CustomerSoap toSoapModel(Customer model) {
		CustomerSoap soapModel = new CustomerSoap();

		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setCustomerGroup(model.getCustomerGroup());
		soapModel.setCustomerType(model.getCustomerType());
		soapModel.setFullName(model.getFullName());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setSex(model.getSex());
		soapModel.setNationalId(model.getNationalId());
		soapModel.setAddress(model.getAddress());
		soapModel.setDescription(model.getDescription());
		soapModel.setIdentifyNo(model.getIdentifyNo());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setIssuePlace(model.getIssuePlace());

		return soapModel;
	}

	public static CustomerSoap[] toSoapModels(Customer[] models) {
		CustomerSoap[] soapModels = new CustomerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomerSoap[][] toSoapModels(Customer[][] models) {
		CustomerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomerSoap[] toSoapModels(List<Customer> models) {
		List<CustomerSoap> soapModels = new ArrayList<CustomerSoap>(models.size());

		for (Customer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomerSoap[soapModels.size()]);
	}

	public CustomerSoap() {
	}

	public long getPrimaryKey() {
		return _customerId;
	}

	public void setPrimaryKey(long pk) {
		setCustomerId(pk);
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public long getCustomerGroup() {
		return _customerGroup;
	}

	public void setCustomerGroup(long customerGroup) {
		_customerGroup = customerGroup;
	}

	public long getCustomerType() {
		return _customerType;
	}

	public void setCustomerType(long customerType) {
		_customerType = customerType;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public long getSex() {
		return _sex;
	}

	public void setSex(long sex) {
		_sex = sex;
	}

	public long getNationalId() {
		return _nationalId;
	}

	public void setNationalId(long nationalId) {
		_nationalId = nationalId;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getIdentifyNo() {
		return _identifyNo;
	}

	public void setIdentifyNo(String identifyNo) {
		_identifyNo = identifyNo;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public String getIssuePlace() {
		return _issuePlace;
	}

	public void setIssuePlace(String issuePlace) {
		_issuePlace = issuePlace;
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
}