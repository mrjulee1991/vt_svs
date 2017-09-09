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

import com.vt.portlet.camera.model.Customer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author MrNet
 * @see Customer
 * @generated
 */
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{customerId=");
		sb.append(customerId);
		sb.append(", customerGroup=");
		sb.append(customerGroup);
		sb.append(", customerType=");
		sb.append(customerType);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", nationalId=");
		sb.append(nationalId);
		sb.append(", address=");
		sb.append(address);
		sb.append(", description=");
		sb.append(description);
		sb.append(", identifyNo=");
		sb.append(identifyNo);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", issuePlace=");
		sb.append(issuePlace);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setCustomerId(customerId);
		customerImpl.setCustomerGroup(customerGroup);
		customerImpl.setCustomerType(customerType);

		if (fullName == null) {
			customerImpl.setFullName(StringPool.BLANK);
		}
		else {
			customerImpl.setFullName(fullName);
		}

		if (birthday == Long.MIN_VALUE) {
			customerImpl.setBirthday(null);
		}
		else {
			customerImpl.setBirthday(new Date(birthday));
		}

		customerImpl.setSex(sex);
		customerImpl.setNationalId(nationalId);

		if (address == null) {
			customerImpl.setAddress(StringPool.BLANK);
		}
		else {
			customerImpl.setAddress(address);
		}

		if (description == null) {
			customerImpl.setDescription(StringPool.BLANK);
		}
		else {
			customerImpl.setDescription(description);
		}

		if (identifyNo == null) {
			customerImpl.setIdentifyNo(StringPool.BLANK);
		}
		else {
			customerImpl.setIdentifyNo(identifyNo);
		}

		if (issueDate == Long.MIN_VALUE) {
			customerImpl.setIssueDate(null);
		}
		else {
			customerImpl.setIssueDate(new Date(issueDate));
		}

		if (issuePlace == null) {
			customerImpl.setIssuePlace(StringPool.BLANK);
		}
		else {
			customerImpl.setIssuePlace(issuePlace);
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		customerId = objectInput.readLong();
		customerGroup = objectInput.readLong();
		customerType = objectInput.readLong();
		fullName = objectInput.readUTF();
		birthday = objectInput.readLong();
		sex = objectInput.readLong();
		nationalId = objectInput.readLong();
		address = objectInput.readUTF();
		description = objectInput.readUTF();
		identifyNo = objectInput.readUTF();
		issueDate = objectInput.readLong();
		issuePlace = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(customerId);
		objectOutput.writeLong(customerGroup);
		objectOutput.writeLong(customerType);

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeLong(birthday);
		objectOutput.writeLong(sex);
		objectOutput.writeLong(nationalId);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (identifyNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(identifyNo);
		}

		objectOutput.writeLong(issueDate);

		if (issuePlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuePlace);
		}
	}

	public long customerId;
	public long customerGroup;
	public long customerType;
	public String fullName;
	public long birthday;
	public long sex;
	public long nationalId;
	public String address;
	public String description;
	public String identifyNo;
	public long issueDate;
	public String issuePlace;
}