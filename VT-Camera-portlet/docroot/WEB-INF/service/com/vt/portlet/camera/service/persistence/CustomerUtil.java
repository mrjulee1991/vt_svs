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

import com.vt.portlet.camera.model.Customer;

import java.util.List;

/**
 * The persistence utility for the customer service. This utility wraps {@link CustomerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see CustomerPersistence
 * @see CustomerPersistenceImpl
 * @generated
 */
public class CustomerUtil {
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
	public static void clearCache(Customer customer) {
		getPersistence().clearCache(customer);
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
	public static List<Customer> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Customer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Customer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Customer update(Customer customer) throws SystemException {
		return getPersistence().update(customer);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Customer update(Customer customer,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(customer, serviceContext);
	}

	/**
	* Returns all the customers where fullName = &#63;.
	*
	* @param fullName the full name
	* @return the matching customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.Customer> findByfullName(
		java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfullName(fullName);
	}

	/**
	* Returns a range of all the customers where fullName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fullName the full name
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @return the range of matching customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.Customer> findByfullName(
		java.lang.String fullName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfullName(fullName, start, end);
	}

	/**
	* Returns an ordered range of all the customers where fullName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fullName the full name
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.Customer> findByfullName(
		java.lang.String fullName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfullName(fullName, start, end, orderByComparator);
	}

	/**
	* Returns the first customer in the ordered set where fullName = &#63;.
	*
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer
	* @throws com.vt.portlet.camera.NoSuchCustomerException if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer findByfullName_First(
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerException {
		return getPersistence().findByfullName_First(fullName, orderByComparator);
	}

	/**
	* Returns the first customer in the ordered set where fullName = &#63;.
	*
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer, or <code>null</code> if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer fetchByfullName_First(
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfullName_First(fullName, orderByComparator);
	}

	/**
	* Returns the last customer in the ordered set where fullName = &#63;.
	*
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer
	* @throws com.vt.portlet.camera.NoSuchCustomerException if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer findByfullName_Last(
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerException {
		return getPersistence().findByfullName_Last(fullName, orderByComparator);
	}

	/**
	* Returns the last customer in the ordered set where fullName = &#63;.
	*
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer, or <code>null</code> if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer fetchByfullName_Last(
		java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByfullName_Last(fullName, orderByComparator);
	}

	/**
	* Returns the customers before and after the current customer in the ordered set where fullName = &#63;.
	*
	* @param customerId the primary key of the current customer
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next customer
	* @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer[] findByfullName_PrevAndNext(
		long customerId, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerException {
		return getPersistence()
				   .findByfullName_PrevAndNext(customerId, fullName,
			orderByComparator);
	}

	/**
	* Removes all the customers where fullName = &#63; from the database.
	*
	* @param fullName the full name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfullName(java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfullName(fullName);
	}

	/**
	* Returns the number of customers where fullName = &#63;.
	*
	* @param fullName the full name
	* @return the number of matching customers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfullName(java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfullName(fullName);
	}

	/**
	* Caches the customer in the entity cache if it is enabled.
	*
	* @param customer the customer
	*/
	public static void cacheResult(
		com.vt.portlet.camera.model.Customer customer) {
		getPersistence().cacheResult(customer);
	}

	/**
	* Caches the customers in the entity cache if it is enabled.
	*
	* @param customers the customers
	*/
	public static void cacheResult(
		java.util.List<com.vt.portlet.camera.model.Customer> customers) {
		getPersistence().cacheResult(customers);
	}

	/**
	* Creates a new customer with the primary key. Does not add the customer to the database.
	*
	* @param customerId the primary key for the new customer
	* @return the new customer
	*/
	public static com.vt.portlet.camera.model.Customer create(long customerId) {
		return getPersistence().create(customerId);
	}

	/**
	* Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerId the primary key of the customer
	* @return the customer that was removed
	* @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer remove(long customerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerException {
		return getPersistence().remove(customerId);
	}

	public static com.vt.portlet.camera.model.Customer updateImpl(
		com.vt.portlet.camera.model.Customer customer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customer);
	}

	/**
	* Returns the customer with the primary key or throws a {@link com.vt.portlet.camera.NoSuchCustomerException} if it could not be found.
	*
	* @param customerId the primary key of the customer
	* @return the customer
	* @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer findByPrimaryKey(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vt.portlet.camera.NoSuchCustomerException {
		return getPersistence().findByPrimaryKey(customerId);
	}

	/**
	* Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param customerId the primary key of the customer
	* @return the customer, or <code>null</code> if a customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vt.portlet.camera.model.Customer fetchByPrimaryKey(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(customerId);
	}

	/**
	* Returns all the customers.
	*
	* @return the customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.Customer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @return the range of customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.Customer> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vt.portlet.camera.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vt.portlet.camera.model.Customer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customers.
	*
	* @return the number of customers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CustomerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CustomerPersistence)PortletBeanLocatorUtil.locate(com.vt.portlet.camera.service.ClpSerializer.getServletContextName(),
					CustomerPersistence.class.getName());

			ReferenceRegistry.registerReference(CustomerUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CustomerPersistence persistence) {
	}

	private static CustomerPersistence _persistence;
}