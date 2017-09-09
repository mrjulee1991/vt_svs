create table VT_Customer (
	customerId LONG not null primary key,
	customerGroup LONG,
	customerType LONG,
	fullName VARCHAR(75) null,
	birthday DATE null,
	sex INTEGER,
	nationalId LONG,
	address VARCHAR(75) null,
	description VARCHAR(75) null,
	identifyNo VARCHAR(75) null,
	issueDate DATE null,
	issuePlace VARCHAR(75) null
);