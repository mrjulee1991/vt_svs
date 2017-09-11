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

package com.vt.portlet.camera.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomerServiceLocalService}.
 *
 * @author MrNet
 * @see CustomerServiceLocalService
 * @generated
 */
public class CustomerServiceLocalServiceWrapper
	implements CustomerServiceLocalService,
		ServiceWrapper<CustomerServiceLocalService> {
	public CustomerServiceLocalServiceWrapper(
		CustomerServiceLocalService customerServiceLocalService) {
		_customerServiceLocalService = customerServiceLocalService;
	}

	/**
	* Adds the customer service to the database. Also notifies the appropriate model listeners.
	*
	* @param customerService the customer service
	* @return the customer service that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vt.portlet.camera.model.CustomerService addCustomerService(
		com.vt.portlet.camera.model.CustomerService customerService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.addCustomerService(customerService);
	}

	/**
	* Creates a new customer service with the primary key. Does not add the customer service to the database.
	*
	* @param customerServiceId the primary key for the new customer service
	* @return the new customer service
	*/
	@Override
	public com.vt.portlet.camera.model.CustomerService createCustomerService(
		long customerServiceId) {
		return _customerServiceLocalService.createCustomerService(customerServiceId);
	}

	/**
	* Deletes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service that was removed
	* @throws PortalException if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vt.portlet.camera.model.CustomerService deleteCustomerService(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.deleteCustomerService(customerServiceId);
	}

	/**
	* Deletes the customer service from the database. Also notifies the appropriate model listeners.
	*
	* @param customerService the customer service
	* @return the customer service that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vt.portlet.camera.model.CustomerService deleteCustomerService(
		com.vt.portlet.camera.model.CustomerService customerService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.deleteCustomerService(customerService);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _customerServiceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vt.portlet.camera.model.CustomerService fetchCustomerService(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.fetchCustomerService(customerServiceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the customer services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer services
	* @param end the upper bound of the range of customer services (not inclusive)
	* @return the range of customer services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vt.portlet.camera.model.CustomerService> getCustomerServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.getCustomerServices(start, end);
	}

	/**
	* Returns the number of customer services.
	*
	* @return the number of customer services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCustomerServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.getCustomerServicesCount();
	}

	/**
	* Updates the customer service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customerService the customer service
	* @return the customer service that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vt.portlet.camera.model.CustomerService updateCustomerService(
		com.vt.portlet.camera.model.CustomerService customerService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.updateCustomerService(customerService);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _customerServiceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_customerServiceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _customerServiceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerServiceLocalService.findBycustomerId(customerId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CustomerServiceLocalService getWrappedCustomerServiceLocalService() {
		return _customerServiceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCustomerServiceLocalService(
		CustomerServiceLocalService customerServiceLocalService) {
		_customerServiceLocalService = customerServiceLocalService;
	}

	@Override
	public CustomerServiceLocalService getWrappedService() {
		return _customerServiceLocalService;
	}

	@Override
	public void setWrappedService(
		CustomerServiceLocalService customerServiceLocalService) {
		_customerServiceLocalService = customerServiceLocalService;
	}

	private CustomerServiceLocalService _customerServiceLocalService;
}