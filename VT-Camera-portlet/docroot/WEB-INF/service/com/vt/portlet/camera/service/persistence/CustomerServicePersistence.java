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

package com.vt.portlet.camera.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vt.portlet.camera.model.CustomerService;

/**
 * The persistence interface for the customer service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see CustomerServicePersistenceImpl
 * @see CustomerServiceUtil
 * @generated
 */
public interface CustomerServicePersistence extends BasePersistence<CustomerService> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomerServiceUtil} to access the customer service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the customer services where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching customer services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the customer services where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of customer services
	* @param end the upper bound of the range of customer services (not inclusive)
	* @return the range of matching customer services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customer services where customerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param customerId the customer ID
	* @param start the lower bound of the range of customer services
	* @param end the upper bound of the range of customer services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching customer services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService findBycustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException;

	/**
	* Returns the first customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer service, or <code>null</code> if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService fetchBycustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService findBycustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException;

	/**
	* Returns the last customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer service, or <code>null</code> if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService fetchBycustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer services before and after the current customer service in the ordered set where customerId = &#63;.
	*
	* @param customerServiceId the primary key of the current customer service
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService[] findBycustomerId_PrevAndNext(
		long customerServiceId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException;

	/**
	* Removes all the customer services where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customer services where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching customer services
	* @throws SystemException if a system exception occurred
	*/
	public int countBycustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the customer service in the entity cache if it is enabled.
	*
	* @param customerService the customer service
	*/
	public void cacheResult(
		com.vt.portlet.camera.model.CustomerService customerService);

	/**
	* Caches the customer services in the entity cache if it is enabled.
	*
	* @param customerServices the customer services
	*/
	public void cacheResult(
		java.util.List<com.vt.portlet.camera.model.CustomerService> customerServices);

	/**
	* Creates a new customer service with the primary key. Does not add the customer service to the database.
	*
	* @param customerServiceId the primary key for the new customer service
	* @return the new customer service
	*/
	public com.vt.portlet.camera.model.CustomerService create(
		long customerServiceId);

	/**
	* Removes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service that was removed
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService remove(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException;

	public com.vt.portlet.camera.model.CustomerService updateImpl(
		com.vt.portlet.camera.model.CustomerService customerService)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer service with the primary key or throws a {@link com.vt.portlet.camera.NoSuchCustomerServiceException} if it could not be found.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService findByPrimaryKey(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException;

	/**
	* Returns the customer service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service, or <code>null</code> if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vt.portlet.camera.model.CustomerService fetchByPrimaryKey(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the customer services.
	*
	* @return the customer services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customer services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer services
	* @param end the upper bound of the range of customer services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vt.portlet.camera.model.CustomerService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the customer services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customer services.
	*
	* @return the number of customer services
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}