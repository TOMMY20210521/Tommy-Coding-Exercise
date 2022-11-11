/*
  table: LOCATIONS
  location_id  street_address        postal_code  city        state_province  country_id
  -----------  --------------------  -----------  ----------  --------------  ----------
  1000         1297 Via Cola di Rie  989          Roma                        IT
  1100         93091 Calle della Te  10934        Venice                      IT
  1200         2017 Shinjuku-ku      1689         Tokyo       Tokyo Prefectu  JP
  1400         2014 Jabberwocky Rd   26192        Southlake   Texas           US

  table: COUNTRIES
  country_id  country_name  region_id
  ----------  ------------  ----------
  DE          Germany       1
  IT          Italy         1
  JP          Japan         3
  US          United State  2

  table: DEPARTMENTS
  +---------------+----------------------+------------+-------------+
  | DEPARTMENT_ID | DEPARTMENT_NAME      | MANAGER_ID | LOCATION_ID |
  +---------------+----------------------+------------+-------------+
  |            10 | Administration       |        200 |        1100 |
  |            20 | Marketing            |        201 |        1200 |
  |            30 | Purchasing           |        202 |        1400 |

  table: EMPLOYEES
  +-------------+-------------+-------------+----------+--------------------+------------+------------+----------+----------------+------------+---------------+
  | EMPLOYEE_ID | FIRST_NAME  | LAST_NAME   | EMAIL    | PHONE_NUMBER       | HIRE_DATE  | JOB_ID     | SALARY   | COMMISSION_PCT | MANAGER_ID | DEPARTMENT_ID |
  +-------------+-------------+-------------+----------+--------------------+------------+------------+----------+----------------+------------+---------------+
  |         100 | Steven      | King        | SKING    | 515-1234567        | 1987-06-17 | ST_CLERK   | 24000.00 |           0.00 |        109 |            10 |
  |         101 | Neena       | Kochhar     | NKOCHHAR | 515-1234568        | 1987-06-18 | MK_REP     | 17000.00 |           0.00 |        103 |            20 |
  |         102 | Lex         | De Haan     | LDEHAAN  | 515-1234569        | 1987-06-19 | AC_ACCOUNT | 17000.00 |           0.00 |        108 |            30 |
  |         103 | Alexander   | Hunold      | AHUNOLD  | 590-4234567        | 1987-06-20 | MK_REP     |  9000.00 |           0.00 |        105 |            20 |

  table: JOB_HISTORY
  employee_id  start_date  end_date    job_id      department_id
  -----------  ----------  ----------  ----------  -------------
  102          1993-01-13  1998-07-24  IT_PROG     20
  101          1989-09-21  1993-10-27  AC_ACCOUNT  10
  101          1993-10-28  1997-03-15  AC_MGR      30
  100          1996-02-17  1999-12-19  MK_REP      30
  103          1998-03-24  1999-12-31  ST_CLERK    20

  1. Create all the above tables, with the provided structures and PK/ FK if required.
  2. Insert some data, you can add your own data.
  3. Write a query to find the location_id, street_address, city, state_province, country_name of locations
  4. Write a query to find the first_name, last name, department ID of all the employees.
  5. Write a query to find the first_name, last_name, job_id, department ID of the employees who works in Japan.
  6. Write a query to find the employee id, last_name along with their manager_id and last_name.
  7. Write a query to find the first_name, last_name and hire date of the employees who was hired after 'Lex De Haan'.
  8. Write a query to get the department name and number of employees for each the department.
  9. Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department 30.
  10. Write a query to display all department name, manager name, and city.
  12. Create table JOBS
  13. Write a query to display the average salary of each department.
*/

-- 1.
-- DROP TABLE IF EXISTS JOBS;
-- DROP TABLE IF EXISTS JOB_HISTORY;
-- ALTER TABLE IF EXISTS EMPLOYEES DROP FOREIGN KEY EMPLOYEES_IBFK_1;
-- ALTER TABLE DEPARTMENTS DROP FOREIGN KEY DEPARTMENTS_IBFK_2;
-- DROP TABLE IF EXISTS EMPLOYEES;
-- DROP TABLE IF EXISTS DEPARTMENTS;
-- DROP TABLE IF EXISTS LOCATIONS;
-- DROP TABLE IF EXISTS COUNTRIES;

CREATE TABLE COUNTRIES (
	COUNTRY_ID		VARCHAR(2),
	COUNTRY_NAME	VARCHAR(20) NOT NULL,
	REGION_ID		NUMERIC(1) 	NOT NULL,
	PRIMARY KEY(COUNTRY_ID)
);

CREATE TABLE LOCATIONS (
	LOCATION_ID		NUMERIC(4),
	STREET_ADDRESS	VARCHAR(30) NOT NULL,
	POSTAL_CODE		NUMERIC(5) 	NOT NULL,
	CITY			VARCHAR(20) NOT NULL,
	STATE_PROVINCE	VARCHAR(20),
	COUNTRY_ID		VARCHAR(2) 	NOT NULL,
	PRIMARY KEY(LOCATION_ID),
	FOREIGN KEY(COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);

CREATE TABLE DEPARTMENTS (
	DEPARTMENT_ID	NUMERIC(2),
	DEPARTMENT_NAME VARCHAR(20) NOT NULL,
	MANAGER_ID		NUMERIC(3) 	NOT NULL,
	LOCATION_ID		NUMERIC(4) 	NOT NULL,
	PRIMARY KEY(DEPARTMENT_ID),
	FOREIGN KEY(LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);

CREATE TABLE EMPLOYEES (
	EMPLOYEE_ID		NUMERIC(3),
	FIRST_NAME		VARCHAR(20) 	NOT NULL,
	LAST_NAME		VARCHAR(20)		NOT NULL,
	EMAIL			VARCHAR(20),
	PHONE_NUMBER	VARCHAR(20)		NOT NULL,
	HIRE_DATE		DATE			NOT NULL,
	JOB_ID			VARCHAR(20) 	NOT NULL,
	SALARY			NUMERIC(8,2)	NOT NULL,
	COMMISSION_PCT	NUMERIC(8,2)	NOT NULL,
	MANAGER_ID		NUMERIC(3),
	DEPARTMENT_ID	NUMERIC(2) 		NOT NULL,
	PRIMARY KEY(EMPLOYEE_ID, HIRE_DATE),
	FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
	FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID)
);

CREATE TABLE JOB_HISTORY (
	EMPLOYEE_ID		NUMERIC(3),
	START_DATE		DATE,
	END_DATE		DATE,
	JOB_ID			VARCHAR(20) NOT NULL,
	DEPARTMENT_ID	NUMERIC(2) 	NOT NULL,
	CONSTRAINT PK_EMPLOYEE_HISTORY PRIMARY KEY (EMPLOYEE_ID, START_DATE),
	FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);


-- 2.

INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES
	('DE', 'GERMANY', 1),
	('IT', 'ITALY', 1),
	('JP', 'JAPAN', 1),
	('US', 'UNITED STATES', 1);
	
INSERT INTO LOCATIONS (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID)
VALUES
	(1000, 'DUMMY ADDRESS 1', 123, 'ROMA', NULL, 'IT'),
	(1100, 'DUMMY ADDRESS 2', 123, 'VENICE', NULL, 'IT'),
	(1200, 'DUMMY ADDRESS 3', 123, 'TOKYO', 'TOKYO PREFECTU', 'JP'),
	(1400, 'DUMMY ADDRESS 4', 123, 'SOUTHLAKE', 'TEXAS', 'US');
	
INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES
	(10, 'ADMINISTRATION', 105, 1100),
	(20, 'MARKETING', 109, 1200),
	(30, 'PURCHASING', 108, 1400);

INSERT INTO EMPLOYEES (
	EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
VALUES
	(105, 'WONG',  'TOM' , 'WONGTOM'  , '590-12553513', '1987-06-20', 'CK_MAN'     ,  30000.00, 0.00, NULL, 20),
	(103, 'ALEXANDER',  'HUNOLD' , 'AHUNOLD'  , '590-1231467', '1987-06-20', 'MK_REP'     ,  9000.00, 0.00, 105, 20),
	(109, 'PETER',     'PAUL'   , 'PETERPAUL'    , '515-1234567', '1987-06-17', 'ST_CLERK'   , 24000.00, 0.00, NULL, 10),
	(100, 'STEVEN',     'KING'   , 'SKING'    , '515-1234567', '1987-06-17', 'ST_CLERK'   , 24000.00, 0.00, 109, 10),
	(101, 'NEENA',      'KOCHHAR', 'NKOCHHAR' , '515-1234568', '1987-06-18', 'MK_REP'     , 17000.00, 0.00, 103, 20),
	(108, 'LOU SAH',        'ALEF', 'ALELOUSAH'  , '515-3534529', '1987-06-19', 'AC_MAN' , 70000.00, 0.00, NULL, 30),
	(102, 'LEX',        'DE HAAN', 'LDEHAAN'  , '515-1234569', '1987-06-19', 'AC_ACCOUNT' , 17000.00, 0.00, 108, 30);

ALTER TABLE DEPARTMENTS
ADD FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID);

INSERT INTO JOB_HISTORY (EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID)
VALUES
	(102, '1993-01-13', '1998-07-24', 'IT_PROG'    , 20),
	(101, '1989-09-21', '1993-10-27', 'AC_ACCOUNT' , 10),
	(101, '1993-10-28', '1997-03-15', 'AC_MGR'     , 30),
	(100, '1996-02-17', '1999-12-19', 'MK_REP'     , 30),
	(103, '1998-03-24', '1999-12-31', 'ST_CLERK'   , 20);


-- 3.

SELECT L.LOCATION_ID, L.STREET_ADDRESS, L.CITY, L.STATE_PROVINCE, C.COUNTRY_NAME
FROM LOCATIONS L, COUNTRIES C
WHERE L.COUNTRY_ID = C.COUNTRY_ID;

-- 4.

SELECT E.FIRST_NAME, E.LAST_NAME, E.DEPARTMENT_ID
FROM EMPLOYEES E;

-- 5.

SELECT E.FIRST_NAME, E.LAST_NAME, E.DEPARTMENT_ID
FROM EMPLOYEES E
WHERE EXISTS (
	SELECT 1 FROM DEPARTMENTS D
	WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID
	AND EXISTS (
		SELECT 1 FROM LOCATIONS L
		WHERE D.LOCATION_ID = L.LOCATION_ID
		AND L.COUNTRY_ID IN ('JP')
	)
);

-- 6.

SELECT E1.EMPLOYEE_ID, E1.LAST_NAME, E2.EMPLOYEE_ID MANAGER_ID, E2.LAST_NAME
FROM EMPLOYEES E1, EMPLOYEES E2
WHERE E1.MANAGER_ID = E2.EMPLOYEE_ID;

-- 7. 

SELECT E.FIRST_NAME, E.LAST_NAME, E.HIRE_DATE
FROM EMPLOYEES E
WHERE E.HIRE_DATE > (
	SELECT F.HIRE_DATE
	FROM EMPLOYEES F
	WHERE CONCAT(F.FIRST_NAME,' ',F.LAST_NAME) = 'LEX DE HAAN');
	
-- 8.

SELECT D.DEPARTMENT_NAME, (
	SELECT COUNT(1)
	FROM EMPLOYEES E
	WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID
) NO_OF_EMPLOYEES
FROM DEPARTMENTS D;

-- 9.

SELECT J.EMPLOYEE_ID, DATEDIFF(J.END_DATE, J.START_DATE)
FROM JOB_HISTORY J;

-- 10.

SELECT D.DEPARTMENT_NAME, CONCAT(E.FIRST_NAME, ' ', E.LAST_NAME) MANAGER_NAME, L.CITY
FROM DEPARTMENTS D, EMPLOYEES E, LOCATIONS L
WHERE D.MANAGER_ID = E.EMPLOYEE_ID
	AND D.LOCATION_ID = L.LOCATION_ID;
	
-- 12.

CREATE TABLE JOBS (
	JOB_ID	VARCHAR(20),
	JOB_NAME VARCHAR(20),
	PRIMARY KEY(JOB_ID)
);

-- 13.

SELECT D.DEPARTMENT_NAME, (
	SELECT AVG(E.SALARY)
	FROM EMPLOYEES E
	WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
) AVERAGE_SALARY
FROM DEPARTMENTS D;
