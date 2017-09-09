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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author MrNet
 * @see Customer
 * @generated
 */
public class CustomerWrapper implements Customer, ModelWrapper<Customer> {
	public CustomerWrapper(Customer customer) {
		_customer = customer;
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

	/**
	* Returns the primary key of this customer.
	*
	* @return the primary key of this customer
	*/
	@Override
	public long getPrimaryKey() {
		return _customer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer.
	*
	* @param primaryKey the primary key of this customer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the customer ID of this customer.
	*
	* @return the customer ID of this customer
	*/
	@Override
	public long getCustomerId() {
		return _customer.getCustomerId();
	}

	/**
	* Sets the customer ID of this customer.
	*
	* @param customerId the customer ID of this customer
	*/
	@Override
	public void setCustomerId(long customerId) {
		_customer.setCustomerId(customerId);
	}

	/**
	* Returns the customer group of this customer.
	*
	* @return the customer group of this customer
	*/
	@Override
	public long getCustomerGroup() {
		return _customer.getCustomerGroup();
	}

	/**
	* Sets the customer group of this customer.
	*
	* @param customerGroup the customer group of this customer
	*/
	@Override
	public void setCustomerGroup(long customerGroup) {
		_customer.setCustomerGroup(customerGroup);
	}

	/**
	* Returns the customer type of this customer.
	*
	* @return the customer type of this customer
	*/
	@Override
	public long getCustomerType() {
		return _customer.getCustomerType();
	}

	/**
	* Sets the customer type of this customer.
	*
	* @param customerType the customer type of this customer
	*/
	@Override
	public void setCustomerType(long customerType) {
		_customer.setCustomerType(customerType);
	}

	/**
	* Returns the full name of this customer.
	*
	* @return the full name of this customer
	*/
	@Override
	public java.lang.String getFullName() {
		return _customer.getFullName();
	}

	/**
	* Sets the full name of this customer.
	*
	* @param fullName the full name of this customer
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_customer.setFullName(fullName);
	}

	/**
	* Returns the birthday of this customer.
	*
	* @return the birthday of this customer
	*/
	@Override
	public java.util.Date getBirthday() {
		return _customer.getBirthday();
	}

	/**
	* Sets the birthday of this customer.
	*
	* @param birthday the birthday of this customer
	*/
	@Override
	public void setBirthday(java.util.Date birthday) {
		_customer.setBirthday(birthday);
	}

	/**
	* Returns the sex of this customer.
	*
	* @return the sex of this customer
	*/
	@Override
	public long getSex() {
		return _customer.getSex();
	}

	/**
	* Sets the sex of this customer.
	*
	* @param sex the sex of this customer
	*/
	@Override
	public void setSex(long sex) {
		_customer.setSex(sex);
	}

	/**
	* Returns the national ID of this customer.
	*
	* @return the national ID of this customer
	*/
	@Override
	public long getNationalId() {
		return _customer.getNationalId();
	}

	/**
	* Sets the national ID of this customer.
	*
	* @param nationalId the national ID of this customer
	*/
	@Override
	public void setNationalId(long nationalId) {
		_customer.setNationalId(nationalId);
	}

	/**
	* Returns the address of this customer.
	*
	* @return the address of this customer
	*/
	@Override
	public java.lang.String getAddress() {
		return _customer.getAddress();
	}

	/**
	* Sets the address of this customer.
	*
	* @param address the address of this customer
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_customer.setAddress(address);
	}

	/**
	* Returns the description of this customer.
	*
	* @return the description of this customer
	*/
	@Override
	public java.lang.String getDescription() {
		return _customer.getDescription();
	}

	/**
	* Sets the description of this customer.
	*
	* @param description the description of this customer
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_customer.setDescription(description);
	}

	/**
	* Returns the identify no of this customer.
	*
	* @return the identify no of this customer
	*/
	@Override
	public java.lang.String getIdentifyNo() {
		return _customer.getIdentifyNo();
	}

	/**
	* Sets the identify no of this customer.
	*
	* @param identifyNo the identify no of this customer
	*/
	@Override
	public void setIdentifyNo(java.lang.String identifyNo) {
		_customer.setIdentifyNo(identifyNo);
	}

	/**
	* Returns the issue date of this customer.
	*
	* @return the issue date of this customer
	*/
	@Override
	public java.util.Date getIssueDate() {
		return _customer.getIssueDate();
	}

	/**
	* Sets the issue date of this customer.
	*
	* @param issueDate the issue date of this customer
	*/
	@Override
	public void setIssueDate(java.util.Date issueDate) {
		_customer.setIssueDate(issueDate);
	}

	/**
	* Returns the issue place of this customer.
	*
	* @return the issue place of this customer
	*/
	@Override
	public java.lang.String getIssuePlace() {
		return _customer.getIssuePlace();
	}

	/**
	* Sets the issue place of this customer.
	*
	* @param issuePlace the issue place of this customer
	*/
	@Override
	public void setIssuePlace(java.lang.String issuePlace) {
		_customer.setIssuePlace(issuePlace);
	}

	@Override
	public boolean isNew() {
		return _customer.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customer.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customer.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customer.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customer.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customer.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customer.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerWrapper((Customer)_customer.clone());
	}

	@Override
	public int compareTo(com.vt.portlet.camera.model.Customer customer) {
		return _customer.compareTo(customer);
	}

	@Override
	public int hashCode() {
		return _customer.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vt.portlet.camera.model.Customer> toCacheModel() {
		return _customer.toCacheModel();
	}

	@Override
	public com.vt.portlet.camera.model.Customer toEscapedModel() {
		return new CustomerWrapper(_customer.toEscapedModel());
	}

	@Override
	public com.vt.portlet.camera.model.Customer toUnescapedModel() {
		return new CustomerWrapper(_customer.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customer.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customer.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerWrapper)) {
			return false;
		}

		CustomerWrapper customerWrapper = (CustomerWrapper)obj;

		if (Validator.equals(_customer, customerWrapper._customer)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Customer getWrappedCustomer() {
		return _customer;
	}

	@Override
	public Customer getWrappedModel() {
		return _customer;
	}

	@Override
	public void resetOriginalValues() {
		_customer.resetOriginalValues();
	}

	private Customer _customer;
}