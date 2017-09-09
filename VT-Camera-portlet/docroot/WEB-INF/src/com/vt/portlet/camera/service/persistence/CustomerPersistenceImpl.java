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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vt.portlet.camera.NoSuchCustomerException;
import com.vt.portlet.camera.model.Customer;
import com.vt.portlet.camera.model.impl.CustomerImpl;
import com.vt.portlet.camera.model.impl.CustomerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see CustomerPersistence
 * @see CustomerUtil
 * @generated
 */
public class CustomerPersistenceImpl extends BasePersistenceImpl<Customer>
	implements CustomerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerUtil} to access the customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FULLNAME = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfullName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FULLNAME =
		new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, CustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfullName",
			new String[] { String.class.getName() },
			CustomerModelImpl.FULLNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FULLNAME = new FinderPath(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfullName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the customers where fullName = &#63;.
	 *
	 * @param fullName the full name
	 * @return the matching customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Customer> findByfullName(String fullName)
		throws SystemException {
		return findByfullName(fullName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Customer> findByfullName(String fullName, int start, int end)
		throws SystemException {
		return findByfullName(fullName, start, end, null);
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
	@Override
	public List<Customer> findByfullName(String fullName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FULLNAME;
			finderArgs = new Object[] { fullName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FULLNAME;
			finderArgs = new Object[] { fullName, start, end, orderByComparator };
		}

		List<Customer> list = (List<Customer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Customer customer : list) {
				if (!Validator.equals(fullName, customer.getFullName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CUSTOMER_WHERE);

			boolean bindFullName = false;

			if (fullName == null) {
				query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_1);
			}
			else if (fullName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_3);
			}
			else {
				bindFullName = true;

				query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CustomerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFullName) {
					qPos.add(fullName);
				}

				if (!pagination) {
					list = (List<Customer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Customer>(list);
				}
				else {
					list = (List<Customer>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Customer findByfullName_First(String fullName,
		OrderByComparator orderByComparator)
		throws NoSuchCustomerException, SystemException {
		Customer customer = fetchByfullName_First(fullName, orderByComparator);

		if (customer != null) {
			return customer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fullName=");
		msg.append(fullName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCustomerException(msg.toString());
	}

	/**
	 * Returns the first customer in the ordered set where fullName = &#63;.
	 *
	 * @param fullName the full name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching customer, or <code>null</code> if a matching customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer fetchByfullName_First(String fullName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Customer> list = findByfullName(fullName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Customer findByfullName_Last(String fullName,
		OrderByComparator orderByComparator)
		throws NoSuchCustomerException, SystemException {
		Customer customer = fetchByfullName_Last(fullName, orderByComparator);

		if (customer != null) {
			return customer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fullName=");
		msg.append(fullName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCustomerException(msg.toString());
	}

	/**
	 * Returns the last customer in the ordered set where fullName = &#63;.
	 *
	 * @param fullName the full name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching customer, or <code>null</code> if a matching customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer fetchByfullName_Last(String fullName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByfullName(fullName);

		if (count == 0) {
			return null;
		}

		List<Customer> list = findByfullName(fullName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Customer[] findByfullName_PrevAndNext(long customerId,
		String fullName, OrderByComparator orderByComparator)
		throws NoSuchCustomerException, SystemException {
		Customer customer = findByPrimaryKey(customerId);

		Session session = null;

		try {
			session = openSession();

			Customer[] array = new CustomerImpl[3];

			array[0] = getByfullName_PrevAndNext(session, customer, fullName,
					orderByComparator, true);

			array[1] = customer;

			array[2] = getByfullName_PrevAndNext(session, customer, fullName,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Customer getByfullName_PrevAndNext(Session session,
		Customer customer, String fullName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CUSTOMER_WHERE);

		boolean bindFullName = false;

		if (fullName == null) {
			query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_1);
		}
		else if (fullName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_3);
		}
		else {
			bindFullName = true;

			query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CustomerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFullName) {
			qPos.add(fullName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(customer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Customer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the customers where fullName = &#63; from the database.
	 *
	 * @param fullName the full name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByfullName(String fullName) throws SystemException {
		for (Customer customer : findByfullName(fullName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(customer);
		}
	}

	/**
	 * Returns the number of customers where fullName = &#63;.
	 *
	 * @param fullName the full name
	 * @return the number of matching customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByfullName(String fullName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FULLNAME;

		Object[] finderArgs = new Object[] { fullName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CUSTOMER_WHERE);

			boolean bindFullName = false;

			if (fullName == null) {
				query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_1);
			}
			else if (fullName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_3);
			}
			else {
				bindFullName = true;

				query.append(_FINDER_COLUMN_FULLNAME_FULLNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFullName) {
					qPos.add(fullName);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FULLNAME_FULLNAME_1 = "customer.fullName IS NULL";
	private static final String _FINDER_COLUMN_FULLNAME_FULLNAME_2 = "customer.fullName = ?";
	private static final String _FINDER_COLUMN_FULLNAME_FULLNAME_3 = "(customer.fullName IS NULL OR customer.fullName = '')";

	public CustomerPersistenceImpl() {
		setModelClass(Customer.class);
	}

	/**
	 * Caches the customer in the entity cache if it is enabled.
	 *
	 * @param customer the customer
	 */
	@Override
	public void cacheResult(Customer customer) {
		EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerImpl.class, customer.getPrimaryKey(), customer);

		customer.resetOriginalValues();
	}

	/**
	 * Caches the customers in the entity cache if it is enabled.
	 *
	 * @param customers the customers
	 */
	@Override
	public void cacheResult(List<Customer> customers) {
		for (Customer customer : customers) {
			if (EntityCacheUtil.getResult(
						CustomerModelImpl.ENTITY_CACHE_ENABLED,
						CustomerImpl.class, customer.getPrimaryKey()) == null) {
				cacheResult(customer);
			}
			else {
				customer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Customer customer) {
		EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerImpl.class, customer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Customer> customers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Customer customer : customers) {
			EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
				CustomerImpl.class, customer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer with the primary key. Does not add the customer to the database.
	 *
	 * @param customerId the primary key for the new customer
	 * @return the new customer
	 */
	@Override
	public Customer create(long customerId) {
		Customer customer = new CustomerImpl();

		customer.setNew(true);
		customer.setPrimaryKey(customerId);

		return customer;
	}

	/**
	 * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customerId the primary key of the customer
	 * @return the customer that was removed
	 * @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer remove(long customerId)
		throws NoSuchCustomerException, SystemException {
		return remove((Serializable)customerId);
	}

	/**
	 * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer
	 * @return the customer that was removed
	 * @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer remove(Serializable primaryKey)
		throws NoSuchCustomerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Customer customer = (Customer)session.get(CustomerImpl.class,
					primaryKey);

			if (customer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customer);
		}
		catch (NoSuchCustomerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Customer removeImpl(Customer customer) throws SystemException {
		customer = toUnwrappedModel(customer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customer)) {
				customer = (Customer)session.get(CustomerImpl.class,
						customer.getPrimaryKeyObj());
			}

			if (customer != null) {
				session.delete(customer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customer != null) {
			clearCache(customer);
		}

		return customer;
	}

	@Override
	public Customer updateImpl(com.vt.portlet.camera.model.Customer customer)
		throws SystemException {
		customer = toUnwrappedModel(customer);

		boolean isNew = customer.isNew();

		CustomerModelImpl customerModelImpl = (CustomerModelImpl)customer;

		Session session = null;

		try {
			session = openSession();

			if (customer.isNew()) {
				session.save(customer);

				customer.setNew(false);
			}
			else {
				session.merge(customer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CustomerModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((customerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FULLNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						customerModelImpl.getOriginalFullName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FULLNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FULLNAME,
					args);

				args = new Object[] { customerModelImpl.getFullName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FULLNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FULLNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
			CustomerImpl.class, customer.getPrimaryKey(), customer);

		return customer;
	}

	protected Customer toUnwrappedModel(Customer customer) {
		if (customer instanceof CustomerImpl) {
			return customer;
		}

		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setNew(customer.isNew());
		customerImpl.setPrimaryKey(customer.getPrimaryKey());

		customerImpl.setCustomerId(customer.getCustomerId());
		customerImpl.setCustomerGroup(customer.getCustomerGroup());
		customerImpl.setCustomerType(customer.getCustomerType());
		customerImpl.setFullName(customer.getFullName());
		customerImpl.setBirthday(customer.getBirthday());
		customerImpl.setSex(customer.getSex());
		customerImpl.setNationalId(customer.getNationalId());
		customerImpl.setAddress(customer.getAddress());
		customerImpl.setDescription(customer.getDescription());
		customerImpl.setIdentifyNo(customer.getIdentifyNo());
		customerImpl.setIssueDate(customer.getIssueDate());
		customerImpl.setIssuePlace(customer.getIssuePlace());

		return customerImpl;
	}

	/**
	 * Returns the customer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer
	 * @return the customer
	 * @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerException, SystemException {
		Customer customer = fetchByPrimaryKey(primaryKey);

		if (customer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customer;
	}

	/**
	 * Returns the customer with the primary key or throws a {@link com.vt.portlet.camera.NoSuchCustomerException} if it could not be found.
	 *
	 * @param customerId the primary key of the customer
	 * @return the customer
	 * @throws com.vt.portlet.camera.NoSuchCustomerException if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer findByPrimaryKey(long customerId)
		throws NoSuchCustomerException, SystemException {
		return findByPrimaryKey((Serializable)customerId);
	}

	/**
	 * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer
	 * @return the customer, or <code>null</code> if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Customer customer = (Customer)EntityCacheUtil.getResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
				CustomerImpl.class, primaryKey);

		if (customer == _nullCustomer) {
			return null;
		}

		if (customer == null) {
			Session session = null;

			try {
				session = openSession();

				customer = (Customer)session.get(CustomerImpl.class, primaryKey);

				if (customer != null) {
					cacheResult(customer);
				}
				else {
					EntityCacheUtil.putResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
						CustomerImpl.class, primaryKey, _nullCustomer);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerModelImpl.ENTITY_CACHE_ENABLED,
					CustomerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customer;
	}

	/**
	 * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customerId the primary key of the customer
	 * @return the customer, or <code>null</code> if a customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Customer fetchByPrimaryKey(long customerId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)customerId);
	}

	/**
	 * Returns all the customers.
	 *
	 * @return the customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Customer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Customer> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Customer> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Customer> list = (List<Customer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMER;

				if (pagination) {
					sql = sql.concat(CustomerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Customer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Customer>(list);
				}
				else {
					list = (List<Customer>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the customers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Customer customer : findAll()) {
			remove(customer);
		}
	}

	/**
	 * Returns the number of customers.
	 *
	 * @return the number of customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CUSTOMER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the customer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vt.portlet.camera.model.Customer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Customer>> listenersList = new ArrayList<ModelListener<Customer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Customer>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CustomerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMER = "SELECT customer FROM Customer customer";
	private static final String _SQL_SELECT_CUSTOMER_WHERE = "SELECT customer FROM Customer customer WHERE ";
	private static final String _SQL_COUNT_CUSTOMER = "SELECT COUNT(customer) FROM Customer customer";
	private static final String _SQL_COUNT_CUSTOMER_WHERE = "SELECT COUNT(customer) FROM Customer customer WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Customer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Customer exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerPersistenceImpl.class);
	private static Customer _nullCustomer = new CustomerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Customer> toCacheModel() {
				return _nullCustomerCacheModel;
			}
		};

	private static CacheModel<Customer> _nullCustomerCacheModel = new CacheModel<Customer>() {
			@Override
			public Customer toEntityModel() {
				return _nullCustomer;
			}
		};
}