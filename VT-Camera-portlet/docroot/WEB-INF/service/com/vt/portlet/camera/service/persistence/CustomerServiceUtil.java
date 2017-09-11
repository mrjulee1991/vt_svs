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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vt.portlet.camera.model.CustomerService;

import java.util.List;

/**
 * The persistence utility for the customer service service. This utility wraps {@link CustomerServicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see CustomerServicePersistence
 * @see CustomerServicePersistenceImpl
 * @generated
 */
public class CustomerServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CustomerService customerService) {
		getPersistence().clearCache(customerService);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CustomerService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomerService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomerService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CustomerService update(CustomerService customerService)
		throws SystemException {
		return getPersistence().update(customerService);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CustomerService update(CustomerService customerService,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(customerService, serviceContext);
	}

	/**
	* Returns all the customer services where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the matching customer services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycustomerId(customerId);
	}

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
	public static java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycustomerId(customerId, start, end);
	}

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
	public static java.util.List<com.vt.portlet.camera.model.CustomerService> findBycustomerId(
		long customerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycustomerId(customerId, start, end, orderByComparator);
	}

	/**
	* Returns the first customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService findBycustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException {
		return getPersistence()
				   .findBycustomerId_First(customerId, orderByComparator);
	}

	/**
	* Returns the first customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer service, or <code>null</code> if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService fetchBycustomerId_First(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycustomerId_First(customerId, orderByComparator);
	}

	/**
	* Returns the last customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService findBycustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException {
		return getPersistence()
				   .findBycustomerId_Last(customerId, orderByComparator);
	}

	/**
	* Returns the last customer service in the ordered set where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer service, or <code>null</code> if a matching customer service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService fetchBycustomerId_Last(
		long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycustomerId_Last(customerId, orderByComparator);
	}

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
	public static com.vt.portlet.camera.model.CustomerService[] findBycustomerId_PrevAndNext(
		long customerServiceId, long customerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException {
		return getPersistence()
				   .findBycustomerId_PrevAndNext(customerServiceId, customerId,
			orderByComparator);
	}

	/**
	* Removes all the customer services where customerId = &#63; from the database.
	*
	* @param customerId the customer ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycustomerId(customerId);
	}

	/**
	* Returns the number of customer services where customerId = &#63;.
	*
	* @param customerId the customer ID
	* @return the number of matching customer services
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycustomerId(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycustomerId(customerId);
	}

	/**
	* Caches the customer service in the entity cache if it is enabled.
	*
	* @param customerService the customer service
	*/
	public static void cacheResult(
		com.vt.portlet.camera.model.CustomerService customerService) {
		getPersistence().cacheResult(customerService);
	}

	/**
	* Caches the customer services in the entity cache if it is enabled.
	*
	* @param customerServices the customer services
	*/
	public static void cacheResult(
		java.util.List<com.vt.portlet.camera.model.CustomerService> customerServices) {
		getPersistence().cacheResult(customerServices);
	}

	/**
	* Creates a new customer service with the primary key. Does not add the customer service to the database.
	*
	* @param customerServiceId the primary key for the new customer service
	* @return the new customer service
	*/
	public static com.vt.portlet.camera.model.CustomerService create(
		long customerServiceId) {
		return getPersistence().create(customerServiceId);
	}

	/**
	* Removes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service that was removed
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService remove(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException {
		return getPersistence().remove(customerServiceId);
	}

	public static com.vt.portlet.camera.model.CustomerService updateImpl(
		com.vt.portlet.camera.model.CustomerService customerService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customerService);
	}

	/**
	* Returns the customer service with the primary key or throws a {@link com.vt.portlet.camera.NoSuchCustomerServiceException} if it could not be found.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service
	* @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService findByPrimaryKey(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerServiceException {
		return getPersistence().findByPrimaryKey(customerServiceId);
	}

	/**
	* Returns the customer service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param customerServiceId the primary key of the customer service
	* @return the customer service, or <code>null</code> if a customer service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.CustomerService fetchByPrimaryKey(
		long customerServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(customerServiceId);
	}

	/**
	* Returns all the customer services.
	*
	* @return the customer services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.CustomerService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.vt.portlet.camera.model.CustomerService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vt.portlet.camera.model.CustomerService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customer services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customer services.
	*
	* @return the number of customer services
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CustomerServicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CustomerServicePersistence)PortletBeanLocatorUtil.locate(com.vt.portlet.camera.service.ClpSerializer.getServletContextName(),
					CustomerServicePersistence.class.getName());

			ReferenceRegistry.registerReference(CustomerServiceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CustomerServicePersistence persistence) {
	}

	private static CustomerServicePersistence _persistence;
}