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

package com.vt.portlet.camera.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.vt.portlet.camera.model.CustomerService;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomerService in entity cache.
 *
 * @author MrNet
 * @see CustomerService
 * @generated
 */
public class CustomerServiceCacheModel implements CacheModel<CustomerService>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{customerServiceId=");
		sb.append(customerServiceId);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", deployName=");
		sb.append(deployName);
		sb.append(", appointDate=");
		sb.append(appointDate);
		sb.append(", serviceType=");
		sb.append(serviceType);
		sb.append(", address=");
		sb.append(address);
		sb.append(", deployType=");
		sb.append(deployType);
		sb.append(", packageType=");
		sb.append(packageType);
		sb.append(", isdnNo=");
		sb.append(isdnNo);
		sb.append(", accountType=");
		sb.append(accountType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerService toEntityModel() {
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

		customerServiceImpl.setCustomerServiceId(customerServiceId);
		customerServiceImpl.setCustomerId(customerId);

		if (deployName == null) {
			customerServiceImpl.setDeployName(StringPool.BLANK);
		}
		else {
			customerServiceImpl.setDeployName(deployName);
		}

		if (appointDate == Long.MIN_VALUE) {
			customerServiceImpl.setAppointDate(null);
		}
		else {
			customerServiceImpl.setAppointDate(new Date(appointDate));
		}

		customerServiceImpl.setServiceType(serviceType);

		if (address == null) {
			customerServiceImpl.setAddress(StringPool.BLANK);
		}
		else {
			customerServiceImpl.setAddress(address);
		}

		customerServiceImpl.setDeployType(deployType);

		if (packageType == null) {
			customerServiceImpl.setPackageType(StringPool.BLANK);
		}
		else {
			customerServiceImpl.setPackageType(packageType);
		}

		if (isdnNo == null) {
			customerServiceImpl.setIsdnNo(StringPool.BLANK);
		}
		else {
			customerServiceImpl.setIsdnNo(isdnNo);
		}

		customerServiceImpl.setAccountType(accountType);

		customerServiceImpl.resetOriginalValues();

		return customerServiceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		customerServiceId = objectInput.readLong();
		customerId = objectInput.readLong();
		deployName = objectInput.readUTF();
		appointDate = objectInput.readLong();
		serviceType = objectInput.readLong();
		address = objectInput.readUTF();
		deployType = objectInput.readLong();
		packageType = objectInput.readUTF();
		isdnNo = objectInput.readUTF();
		accountType = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(customerServiceId);
		objectOutput.writeLong(customerId);

		if (deployName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deployName);
		}

		objectOutput.writeLong(appointDate);
		objectOutput.writeLong(serviceType);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(deployType);

		if (packageType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(packageType);
		}

		if (isdnNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(isdnNo);
		}

		objectOutput.writeLong(accountType);
	}

	public long customerServiceId;
	public long customerId;
	public String deployName;
	public long appointDate;
	public long serviceType;
	public String address;
	public long deployType;
	public String packageType;
	public String isdnNo;
	public long accountType;
}