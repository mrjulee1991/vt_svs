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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vt.portlet.camera.NoSuchCustomerServiceException;
import com.vt.portlet.camera.model.CustomerService;
import com.vt.portlet.camera.model.impl.CustomerServiceImpl;
import com.vt.portlet.camera.model.impl.CustomerServiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the customer service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see CustomerServicePersistence
 * @see CustomerServiceUtil
 * @generated
 */
public class CustomerServicePersistenceImpl extends BasePersistenceImpl<CustomerService>
	implements CustomerServicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerServiceUtil} to access the customer service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerServiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
			CustomerServiceModelImpl.FINDER_CACHE_ENABLED,
			CustomerServiceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
			CustomerServiceModelImpl.FINDER_CACHE_ENABLED,
			CustomerServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
			CustomerServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerServicePersistenceImpl() {
		setModelClass(CustomerService.class);
	}

	/**
	 * Caches the customer service in the entity cache if it is enabled.
	 *
	 * @param customerService the customer service
	 */
	@Override
	public void cacheResult(CustomerService customerService) {
		EntityCacheUtil.putResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
			CustomerServiceImpl.class, customerService.getPrimaryKey(),
			customerService);

		customerService.resetOriginalValues();
	}

	/**
	 * Caches the customer services in the entity cache if it is enabled.
	 *
	 * @param customerServices the customer services
	 */
	@Override
	public void cacheResult(List<CustomerService> customerServices) {
		for (CustomerService customerService : customerServices) {
			if (EntityCacheUtil.getResult(
						CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
						CustomerServiceImpl.class,
						customerService.getPrimaryKey()) == null) {
				cacheResult(customerService);
			}
			else {
				customerService.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerServiceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerServiceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer service.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomerService customerService) {
		EntityCacheUtil.removeResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
			CustomerServiceImpl.class, customerService.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomerService> customerServices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomerService customerService : customerServices) {
			EntityCacheUtil.removeResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
				CustomerServiceImpl.class, customerService.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer service with the primary key. Does not add the customer service to the database.
	 *
	 * @param customerServiceId the primary key for the new customer service
	 * @return the new customer service
	 */
	@Override
	public CustomerService create(long customerServiceId) {
		CustomerService customerService = new CustomerServiceImpl();

		customerService.setNew(true);
		customerService.setPrimaryKey(customerServiceId);

		return customerService;
	}

	/**
	 * Removes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customerServiceId the primary key of the customer service
	 * @return the customer service that was removed
	 * @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerService remove(long customerServiceId)
		throws NoSuchCustomerServiceException, SystemException {
		return remove((Serializable)customerServiceId);
	}

	/**
	 * Removes the customer service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer service
	 * @return the customer service that was removed
	 * @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerService remove(Serializable primaryKey)
		throws NoSuchCustomerServiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomerService customerService = (CustomerService)session.get(CustomerServiceImpl.class,
					primaryKey);

			if (customerService == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerService);
		}
		catch (NoSuchCustomerServiceException nsee) {
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
	protected CustomerService removeImpl(CustomerService customerService)
		throws SystemException {
		customerService = toUnwrappedModel(customerService);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerService)) {
				customerService = (CustomerService)session.get(CustomerServiceImpl.class,
						customerService.getPrimaryKeyObj());
			}

			if (customerService != null) {
				session.delete(customerService);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerService != null) {
			clearCache(customerService);
		}

		return customerService;
	}

	@Override
	public CustomerService updateImpl(
		com.vt.portlet.camera.model.CustomerService customerService)
		throws SystemException {
		customerService = toUnwrappedModel(customerService);

		boolean isNew = customerService.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerService.isNew()) {
				session.save(customerService);

				customerService.setNew(false);
			}
			else {
				session.merge(customerService);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
			CustomerServiceImpl.class, customerService.getPrimaryKey(),
			customerService);

		return customerService;
	}

	protected CustomerService toUnwrappedModel(CustomerService customerService) {
		if (customerService instanceof CustomerServiceImpl) {
			return customerService;
		}

		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

		customerServiceImpl.setNew(customerService.isNew());
		customerServiceImpl.setPrimaryKey(customerService.getPrimaryKey());

		customerServiceImpl.setCustomerServiceId(customerService.getCustomerServiceId());
		customerServiceImpl.setCustomerId(customerService.getCustomerId());
		customerServiceImpl.setDeployName(customerService.getDeployName());
		customerServiceImpl.setAppointDate(customerService.getAppointDate());
		customerServiceImpl.setServiceType(customerService.getServiceType());
		customerServiceImpl.setAddress(customerService.getAddress());
		customerServiceImpl.setDeployType(customerService.getDeployType());
		customerServiceImpl.setPackageType(customerService.getPackageType());
		customerServiceImpl.setIsdnNo(customerService.getIsdnNo());
		customerServiceImpl.setAccountType(customerService.getAccountType());

		return customerServiceImpl;
	}

	/**
	 * Returns the customer service with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer service
	 * @return the customer service
	 * @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerService findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerServiceException, SystemException {
		CustomerService customerService = fetchByPrimaryKey(primaryKey);

		if (customerService == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerService;
	}

	/**
	 * Returns the customer service with the primary key or throws a {@link com.vt.portlet.camera.NoSuchCustomerServiceException} if it could not be found.
	 *
	 * @param customerServiceId the primary key of the customer service
	 * @return the customer service
	 * @throws com.vt.portlet.camera.NoSuchCustomerServiceException if a customer service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerService findByPrimaryKey(long customerServiceId)
		throws NoSuchCustomerServiceException, SystemException {
		return findByPrimaryKey((Serializable)customerServiceId);
	}

	/**
	 * Returns the customer service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer service
	 * @return the customer service, or <code>null</code> if a customer service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerService fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomerService customerService = (CustomerService)EntityCacheUtil.getResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
				CustomerServiceImpl.class, primaryKey);

		if (customerService == _nullCustomerService) {
			return null;
		}

		if (customerService == null) {
			Session session = null;

			try {
				session = openSession();

				customerService = (CustomerService)session.get(CustomerServiceImpl.class,
						primaryKey);

				if (customerService != null) {
					cacheResult(customerService);
				}
				else {
					EntityCacheUtil.putResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
						CustomerServiceImpl.class, primaryKey,
						_nullCustomerService);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerServiceModelImpl.ENTITY_CACHE_ENABLED,
					CustomerServiceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerService;
	}

	/**
	 * Returns the customer service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customerServiceId the primary key of the customer service
	 * @return the customer service, or <code>null</code> if a customer service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerService fetchByPrimaryKey(long customerServiceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)customerServiceId);
	}

	/**
	 * Returns all the customer services.
	 *
	 * @return the customer services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerService> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<CustomerService> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<CustomerService> findAll(int start, int end,
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

		List<CustomerService> list = (List<CustomerService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERSERVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERSERVICE;

				if (pagination) {
					sql = sql.concat(CustomerServiceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomerService>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomerService>(list);
				}
				else {
					list = (List<CustomerService>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the customer services from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomerService customerService : findAll()) {
			remove(customerService);
		}
	}

	/**
	 * Returns the number of customer services.
	 *
	 * @return the number of customer services
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERSERVICE);

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
	 * Initializes the customer service persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vt.portlet.camera.model.CustomerService")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomerService>> listenersList = new ArrayList<ModelListener<CustomerService>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomerService>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerServiceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERSERVICE = "SELECT customerService FROM CustomerService customerService";
	private static final String _SQL_COUNT_CUSTOMERSERVICE = "SELECT COUNT(customerService) FROM CustomerService customerService";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerService.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerService exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerServicePersistenceImpl.class);
	private static CustomerService _nullCustomerService = new CustomerServiceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomerService> toCacheModel() {
				return _nullCustomerServiceCacheModel;
			}
		};

	private static CacheModel<CustomerService> _nullCustomerServiceCacheModel = new CacheModel<CustomerService>() {
			@Override
			public CustomerService toEntityModel() {
				return _nullCustomerService;
			}
		};
}