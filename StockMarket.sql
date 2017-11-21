DROP TABLE CUSTOMER;
DROP TABLE SHARES;
DROP TABLE STOCK;

CREATE TABLE CUSTOMER (
	SSN CHAR(15) NOT NULL,
	CUST_NAME CHAR(40),
	ADDRESS CHAR(100),
	PRIMARY KEY(SSN)
);

CREATE TABLE SHARES (
	ID INT NOT NULL,
	SSN CHAR(15) NOT NULL,
	SYMBOL CHAR(8) NOT NULL,
	QUANTITY INT,
	PRIMARY KEY(ID)
);

CREATE TABLE STOCK (
	SYMBOL CHAR(15) NOT NULL,
	PRICE real,
	PRIMARY KEY(SYMBOL)
);


INSERT INTO CUSTOMER VALUES ('111-11-1111', 'Test Customer', '2222 Easy Street, West Beach AZ');
INSERT INTO CUSTOMER VALUES ('123-45-6789', 'Matthieu Heimer', '221B Baker Street, Houston TX');
INSERT INTO CUSTOMER VALUES ('999-45-9034', 'Asok Perumainar', '1444 England Lane, Broomfield CO');
INSERT INTO CUSTOMER VALUES ('999-78-9012', 'Anthony Orapallo', '123 Tea Street, Columbia MD');
INSERT INTO CUSTOMER VALUES ('999-90-9009', 'Terri Cubeta', '636 Somewhere Rd, Rosslyn VA');
INSERT INTO CUSTOMER VALUES ('999-90-8765', 'Bryan Basham', '3290 Course Way, Broomfield CO');
INSERT INTO CUSTOMER VALUES ('999-33-4444', 'Georgianna DG Meagher', '1000 Mother Court, Columbia MD');
INSERT INTO CUSTOMER VALUES ('999-44-5555', 'Tom McGinn', '1525 Educator Drive, Burlington MA');

INSERT INTO SHARES VALUES (1, '999-45-9034', 'ORCL', 200);
INSERT INTO SHARES VALUES (2, '999-45-9034', 'DUKE', 1200);
INSERT INTO SHARES VALUES (3, '123-45-6789', 'JDK', 1);
INSERT INTO SHARES VALUES (4, '999-78-9012', 'JSVCo', 120);
INSERT INTO SHARES VALUES (5, '999-90-9009', 'BWInc', 35);
INSERT INTO SHARES VALUES (6, '999-90-8765', 'GMEnt', 200);
INSERT INTO SHARES VALUES (7, '999-90-8765', 'PMLtd', 109);
INSERT INTO SHARES VALUES (8, '999-44-5555', 'TMAs', 135);

INSERT INTO STOCK VALUES ('ORCL', 135.0);
INSERT INTO STOCK VALUES ('CyAs', 34.0);
INSERT INTO STOCK VALUES ('DUKE', 12.75);
INSERT INTO STOCK VALUES ('ABStk', 20.75);
INSERT INTO STOCK VALUES ('JSVCo', 24.00);
INSERT INTO STOCK VALUES ('TMAs', 80.25);
INSERT INTO STOCK VALUES ('BWInc', 6.25);
INSERT INTO STOCK VALUES ('GMEnt', 52.50);
INSERT INTO STOCK VALUES ('PMLtd', 201.75);
INSERT INTO STOCK VALUES ('JDK', 13.50);

