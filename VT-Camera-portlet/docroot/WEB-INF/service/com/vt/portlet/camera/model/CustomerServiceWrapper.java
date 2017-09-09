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
 * This class is a wrapper for {@link CustomerService}.
 * </p>
 *
 * @author MrNet
 * @see CustomerService
 * @generated
 */
public class CustomerServiceWrapper implements CustomerService,
	ModelWrapper<CustomerService> {
	public CustomerServiceWrapper(CustomerService customerService) {
		_customerService = customerService;
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

	/**
	* Returns the primary key of this customer service.
	*
	* @return the primary key of this customer service
	*/
	@Override
	public long getPrimaryKey() {
		return _customerService.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer service.
	*
	* @param primaryKey the primary key of this customer service
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customerService.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the customer service ID of this customer service.
	*
	* @return the customer service ID of this customer service
	*/
	@Override
	public long getCustomerServiceId() {
		return _customerService.getCustomerServiceId();
	}

	/**
	* Sets the customer service ID of this customer service.
	*
	* @param customerServiceId the customer service ID of this customer service
	*/
	@Override
	public void setCustomerServiceId(long customerServiceId) {
		_customerService.setCustomerServiceId(customerServiceId);
	}

	/**
	* Returns the customer ID of this customer service.
	*
	* @return the customer ID of this customer service
	*/
	@Override
	public long getCustomerId() {
		return _customerService.getCustomerId();
	}

	/**
	* Sets the customer ID of this customer service.
	*
	* @param customerId the customer ID of this customer service
	*/
	@Override
	public void setCustomerId(long customerId) {
		_customerService.setCustomerId(customerId);
	}

	/**
	* Returns the deploy name of this customer service.
	*
	* @return the deploy name of this customer service
	*/
	@Override
	public java.lang.String getDeployName() {
		return _customerService.getDeployName();
	}

	/**
	* Sets the deploy name of this customer service.
	*
	* @param deployName the deploy name of this customer service
	*/
	@Override
	public void setDeployName(java.lang.String deployName) {
		_customerService.setDeployName(deployName);
	}

	/**
	* Returns the appoint date of this customer service.
	*
	* @return the appoint date of this customer service
	*/
	@Override
	public java.util.Date getAppointDate() {
		return _customerService.getAppointDate();
	}

	/**
	* Sets the appoint date of this customer service.
	*
	* @param appointDate the appoint date of this customer service
	*/
	@Override
	public void setAppointDate(java.util.Date appointDate) {
		_customerService.setAppointDate(appointDate);
	}

	/**
	* Returns the service type of this customer service.
	*
	* @return the service type of this customer service
	*/
	@Override
	public long getServiceType() {
		return _customerService.getServiceType();
	}

	/**
	* Sets the service type of this customer service.
	*
	* @param serviceType the service type of this customer service
	*/
	@Override
	public void setServiceType(long serviceType) {
		_customerService.setServiceType(serviceType);
	}

	/**
	* Returns the address of this customer service.
	*
	* @return the address of this customer service
	*/
	@Override
	public java.lang.String getAddress() {
		return _customerService.getAddress();
	}

	/**
	* Sets the address of this customer service.
	*
	* @param address the address of this customer service
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_customerService.setAddress(address);
	}

	/**
	* Returns the deploy type of this customer service.
	*
	* @return the deploy type of this customer service
	*/
	@Override
	public long getDeployType() {
		return _customerService.getDeployType();
	}

	/**
	* Sets the deploy type of this customer service.
	*
	* @param deployType the deploy type of this customer service
	*/
	@Override
	public void setDeployType(long deployType) {
		_customerService.setDeployType(deployType);
	}

	/**
	* Returns the package type of this customer service.
	*
	* @return the package type of this customer service
	*/
	@Override
	public java.lang.String getPackageType() {
		return _customerService.getPackageType();
	}

	/**
	* Sets the package type of this customer service.
	*
	* @param packageType the package type of this customer service
	*/
	@Override
	public void setPackageType(java.lang.String packageType) {
		_customerService.setPackageType(packageType);
	}

	/**
	* Returns the isdn no of this customer service.
	*
	* @return the isdn no of this customer service
	*/
	@Override
	public java.lang.String getIsdnNo() {
		return _customerService.getIsdnNo();
	}

	/**
	* Sets the isdn no of this customer service.
	*
	* @param isdnNo the isdn no of this customer service
	*/
	@Override
	public void setIsdnNo(java.lang.String isdnNo) {
		_customerService.setIsdnNo(isdnNo);
	}

	/**
	* Returns the account type of this customer service.
	*
	* @return the account type of this customer service
	*/
	@Override
	public long getAccountType() {
		return _customerService.getAccountType();
	}

	/**
	* Sets the account type of this customer service.
	*
	* @param accountType the account type of this customer service
	*/
	@Override
	public void setAccountType(long accountType) {
		_customerService.setAccountType(accountType);
	}

	@Override
	public boolean isNew() {
		return _customerService.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerService.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerService.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerService.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerService.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerService.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerService.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerService.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerService.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerService.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerService.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerServiceWrapper((CustomerService)_customerService.clone());
	}

	@Override
	public int compareTo(
		com.vt.portlet.camera.model.CustomerService customerService) {
		return _customerService.compareTo(customerService);
	}

	@Override
	public int hashCode() {
		return _customerService.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vt.portlet.camera.model.CustomerService> toCacheModel() {
		return _customerService.toCacheModel();
	}

	@Override
	public com.vt.portlet.camera.model.CustomerService toEscapedModel() {
		return new CustomerServiceWrapper(_customerService.toEscapedModel());
	}

	@Override
	public com.vt.portlet.camera.model.CustomerService toUnescapedModel() {
		return new CustomerServiceWrapper(_customerService.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerService.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerService.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerService.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerServiceWrapper)) {
			return false;
		}

		CustomerServiceWrapper customerServiceWrapper = (CustomerServiceWrapper)obj;

		if (Validator.equals(_customerService,
					customerServiceWrapper._customerService)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomerService getWrappedCustomerService() {
		return _customerService;
	}

	@Override
	public CustomerService getWrappedModel() {
		return _customerService;
	}

	@Override
	public void resetOriginalValues() {
		_customerService.resetOriginalValues();
	}

	private CustomerService _customerService;
}