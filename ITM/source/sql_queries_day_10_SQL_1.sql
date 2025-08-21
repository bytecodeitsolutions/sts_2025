
SQL*Plus: Release 10.2.0.1.0 - Production on Wed Aug 20 12:06:17 2025

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

SQL> connect itmuser/itmpass
Connected.
SQL> select * from emp;

no rows selected

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7369 SMITH      CLERK           7902 17-DEC-80        800
        20

      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300
        30

      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7566 JONES      MANAGER         7839 02-APR-81       2975
        20

      7698 BLAKE      MANAGER         7839 01-MAY-81       2850
        30

      7782 CLARK      MANAGER         7839 09-JUN-81       2450
        10


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000
        20

      7839 KING       PRESIDENT            17-NOV-81       5000
        10

      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7900 JAMES      CLERK           7698 03-DEC-81        950
        30

      7902 FORD       ANALYST         7566 03-DEC-81       3000
        20

      7934 MILLER     CLERK           7782 23-JAN-82       1300
        10


12 rows selected.

SQL> set line 200;
SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> set pagesize 40;
SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select * from emp where deptno=10;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select ename,sal,deptno from emp;

ENAME             SAL     DEPTNO
---------- ---------- ----------
SMITH             800         20
ALLEN            1600         30
WARD             1250         30
JONES            2975         20
BLAKE            2850         30
CLARK            2450         10
SCOTT            3000         20
KING             5000         10
TURNER           1500         30
JAMES             950         30
FORD             3000         20
MILLER           1300         10

12 rows selected.

SQL> select ename,sal,deptno from emp where deptno=20;;
select ename,sal,deptno from emp where deptno=20;
                                                *
ERROR at line 1:
ORA-00911: invalid character


SQL> select ename,sal,deptno from emp where deptno=20;

ENAME             SAL     DEPTNO
---------- ---------- ----------
SMITH             800         20
JONES            2975         20
SCOTT            3000         20
FORD             3000         20

SQL> select ename , sal , sal*12 from emp;

ENAME             SAL     SAL*12
---------- ---------- ----------
SMITH             800       9600
ALLEN            1600      19200
WARD             1250      15000
JONES            2975      35700
BLAKE            2850      34200
CLARK            2450      29400
SCOTT            3000      36000
KING             5000      60000
TURNER           1500      18000
JAMES             950      11400
FORD             3000      36000
MILLER           1300      15600

12 rows selected.

SQL> select ename , sal , sal*12 annsal from emp;

ENAME             SAL     ANNSAL
---------- ---------- ----------
SMITH             800       9600
ALLEN            1600      19200
WARD             1250      15000
JONES            2975      35700
BLAKE            2850      34200
CLARK            2450      29400
SCOTT            3000      36000
KING             5000      60000
TURNER           1500      18000
JAMES             950      11400
FORD             3000      36000
MILLER           1300      15600

12 rows selected.

SQL> select ename , sal , sal*12 annsal,job from emp where job!='CLERK';

ENAME             SAL     ANNSAL JOB
---------- ---------- ---------- ---------
ALLEN            1600      19200 SALESMAN
WARD             1250      15000 SALESMAN
JONES            2975      35700 MANAGER
BLAKE            2850      34200 MANAGER
CLARK            2450      29400 MANAGER
SCOTT            3000      36000 ANALYST
KING             5000      60000 PRESIDENT
TURNER           1500      18000 SALESMAN
FORD             3000      36000 ANALYST

9 rows selected.

SQL> select ename , sal , sal*12 annsal,job from emp where job!='CLERk';

ENAME             SAL     ANNSAL JOB
---------- ---------- ---------- ---------
SMITH             800       9600 CLERK
ALLEN            1600      19200 SALESMAN
WARD             1250      15000 SALESMAN
JONES            2975      35700 MANAGER
BLAKE            2850      34200 MANAGER
CLARK            2450      29400 MANAGER
SCOTT            3000      36000 ANALYST
KING             5000      60000 PRESIDENT
TURNER           1500      18000 SALESMAN
JAMES             950      11400 CLERK
FORD             3000      36000 ANALYST
MILLER           1300      15600 CLERK

12 rows selected.

SQL> select ename , sal , sal*12 annsal,job from emp where job!='CLERK';

ENAME             SAL     ANNSAL JOB
---------- ---------- ---------- ---------
ALLEN            1600      19200 SALESMAN
WARD             1250      15000 SALESMAN
JONES            2975      35700 MANAGER
BLAKE            2850      34200 MANAGER
CLARK            2450      29400 MANAGER
SCOTT            3000      36000 ANALYST
KING             5000      60000 PRESIDENT
TURNER           1500      18000 SALESMAN
FORD             3000      36000 ANALYST

9 rows selected.

SQL> select * from emp where job = ‘clerk’ and sal > 2000;

no rows selected

SQL> select * from emp where job = ‘clerk’ and sal > 1000;

no rows selected

SQL> select * from emp where job = ‘CLERK’ and sal > 1000;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select * from emp where job = ‘CLERK’ or sal > 1000;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select * from emp where job = ‘CLERK’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select * from emp where deptno = 20 or deptno = 30 or deptno = 50
  2  or deptno = 70 or deptno =
  3  80;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

9 rows selected.



=================================================================

SQL*Plus: Release 10.2.0.1.0 - Production on Wed Aug 20 10:44:04 2025

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

SQL> conn sys as sysdba;
Enter password:
Connected.
SQL> create user itmuser identified by itmpass;

User created.

SQL> show user;
USER is "SYS"
SQL> grant dba to itmuser;

Grant succeeded.

SQL> connect itmuser/itmpass;
Connected.
SQL> conn
Enter user-name: itmuser
Enter password:
Connected.
SQL> connect itmuser
Enter password:
Connected.
SQL> show user;
USER is "ITMUSER"
SQL> select * from tab;

no rows selected

SQL> create table test(col1 number(5),col2 number(7,2));

Table created.

SQL> desc test;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 COL1                                               NUMBER(5)
 COL2                                               NUMBER(7,2)

SQL> insert into test values(12345,98765.65443);

1 row created.

SQL> select * from test;

      COL1       COL2
---------- ----------
     12345   98765.65

SQL> insert into test values(12345,987653.63);
insert into test values(12345,987653.63)
                              *
ERROR at line 1:
ORA-01438: value larger than specified precision allowed for this column


SQL> insert into test values(12,99999.67);

1 row created.

SQL> select * from test;

      COL1       COL2
---------- ----------
     12345   98765.65
        12   99999.67

SQL> create table test2(name varchar(20));

Table created.

SQL> desc test2;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 NAME                                               VARCHAR2(20)

SQL> insert into test2 values('itm college');

1 row created.

SQL> select * from test2;

NAME
--------------------
itm college

SQL> select sysdate from dual;

SYSDATE
---------
20-AUG-25

SQL> select * from dual;

D
-
X

SQL> create table emp(empno number(5),ename varchar2(20),sal number(7,2),address varchar2(25));

Table created.

SQL> desc emp;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(5)
 ENAME                                              VARCHAR2(20)
 SAL                                                NUMBER(7,2)
 ADDRESS                                            VARCHAR2(25)

SQL> create table emp1 as select * from emp;

Table created.

SQL> desc emp1;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(5)
 ENAME                                              VARCHAR2(20)
 SAL                                                NUMBER(7,2)
 ADDRESS                                            VARCHAR2(25)

SQL> insert into emp values(111,'Raja',1000.00,'Gwalior');

1 row created.

SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       111 Raja                       1000 Gwalior

SQL> create table emp2 as select * from emp;

Table created.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       111 Raja                       1000 Gwalior

SQL> create table emp3 as select * from emp where 1=3;

Table created.

SQL> select * from emp3;

no rows selected

SQL> desc emp3;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(5)
 ENAME                                              VARCHAR2(20)
 SAL                                                NUMBER(7,2)
 ADDRESS                                            VARCHAR2(25)

SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       111 Raja                       1000 Gwalior

SQL> alter table emp add(deptno number(3));

Table altered.

SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS                       DEPTNO
---------- -------------------- ---------- ------------------------- ----------
       111 Raja                       1000 Gwalior

SQL> set line 200;
SQL> set pagesize 50;
SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS                       DEPTNO
---------- -------------------- ---------- ------------------------- ----------
       111 Raja                       1000 Gwalior

SQL> set line 100;
SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS                       DEPTNO
---------- -------------------- ---------- ------------------------- ----------
       111 Raja                       1000 Gwalior

SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS                       DEPTNO
---------- -------------------- ---------- ------------------------- ----------
       111 Raja                       1000 Gwalior

SQL> set pagesize 50;
SQL> setline 200;
SP2-0734: unknown command beginning "setline 20..." - rest of line ignored.
SQL> set line 200;
SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS                       DEPTNO
---------- -------------------- ---------- ------------------------- ----------
       111 Raja                       1000 Gwalior

SQL> desc emp;
 Name                                                                                                        Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 EMPNO                                                                                                                NUMBER(5)
 ENAME                                                                                                                VARCHAR2(20)
 SAL                                                                                                                  NUMBER(7,2)
 ADDRESS                                                                                                              VARCHAR2(25)
 DEPTNO                                                                                                               NUMBER(3)

SQL> alter table emp modify(empno number(10));

Table altered.

SQL> desc emp;
 Name                                                                                                        Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 EMPNO                                                                                                                NUMBER(10)
 ENAME                                                                                                                VARCHAR2(20)
 SAL                                                                                                                  NUMBER(7,2)
 ADDRESS                                                                                                              VARCHAR2(25)
 DEPTNO                                                                                                               NUMBER(3)

SQL> alter table emp modify(eno number(10));
alter table emp modify(eno number(10))
                       *
ERROR at line 1:
ORA-00904: "ENO": invalid identifier


SQL> alter table emp modify(eno varchar2(10));
alter table emp modify(eno varchar2(10))
                       *
ERROR at line 1:
ORA-00904: "ENO": invalid identifier


SQL> alter table emp modify(empno varchar2(10));
alter table emp modify(empno varchar2(10))
                       *
ERROR at line 1:
ORA-01439: column to be modified must be empty to change datatype


SQL> select * from emp;

     EMPNO ENAME                       SAL ADDRESS                       DEPTNO
---------- -------------------- ---------- ------------------------- ----------
       111 Raja                       1000 Gwalior

SQL> alter table emp modify(deptno varchar2(20));

Table altered.

SQL> alter table emp drom deptno;
alter table emp drom deptno
                *
ERROR at line 1:
ORA-01735: invalid ALTER TABLE option


SQL> alter table emp drop deptno;
alter table emp drop deptno
                     *
ERROR at line 1:
ORA-00905: missing keyword


SQL> alter table emp drop column deptno;

Table altered.

SQL> desc emp;
 Name                                                                                                        Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 EMPNO                                                                                                                NUMBER(10)
 ENAME                                                                                                                VARCHAR2(20)
 SAL                                                                                                                  NUMBER(7,2)
 ADDRESS                                                                                                              VARCHAR2(25)

SQL> select * from emp1;

no rows selected

SQL> desc emp1;
 Name                                                                                                        Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 EMPNO                                                                                                                NUMBER(5)
 ENAME                                                                                                                VARCHAR2(20)
 SAL                                                                                                                  NUMBER(7,2)
 ADDRESS                                                                                                              VARCHAR2(25)

SQL> alter table emp drop(empno,ename,sal,address);
alter table emp drop(empno,ename,sal,address)
*
ERROR at line 1:
ORA-12983: cannot drop all columns in a table


SQL> alter table emp drop(ename,sal,address);

Table altered.

SQL> drop table emp1;

Table dropped.

SQL> select * from emp;

     EMPNO
----------
       111

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       111 Raja                       1000 Gwalior

SQL> select * from emp3;

no rows selected

SQL> insert into emp2 values(222,'Rani',2000,'LKO');

1 row created.

SQL> commit;

Commit complete.

SQL> truncat table emp2;
SP2-0734: unknown command beginning "truncat ta..." - rest of line ignored.
SQL> truncate table emp2;

Table truncated.

SQL> select * from emp2;

no rows selected

SQL> rollback;

Rollback complete.

SQL> select * from emp2;

no rows selected

SQL> desc emp2;
 Name                                                                                                        Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 EMPNO                                                                                                                NUMBER(5)
 ENAME                                                                                                                VARCHAR2(20)
 SAL                                                                                                                  NUMBER(7,2)
 ADDRESS                                                                                                              VARCHAR2(25)

SQL> insert into emp2 values(&empno,&ename,&sal,&address);
Enter value for empno: 333
Enter value for ename: 'Ram'
Enter value for sal: 3000
Enter value for address: 'Indore'
old   1: insert into emp2 values(&empno,&ename,&sal,&address)
new   1: insert into emp2 values(333,'Ram',3000,'Indore')

1 row created.

SQL> /
Enter value for empno: 444
Enter value for ename: 'Raju'
Enter value for sal: 4000
Enter value for address: 'MP'
old   1: insert into emp2 values(&empno,&ename,&sal,&address)
new   1: insert into emp2 values(444,'Raju',4000,'MP')

1 row created.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       333 Ram                        3000 Indore
       444 Raju                       4000 MP

SQL> insert into emp2(empno,ename,address) values(555,'XYZ','pqr');

1 row created.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       333 Ram                        3000 Indore
       444 Raju                       4000 MP
       555 XYZ                             pqr

SQL> update emp2 set ename='Ramji' where empno=333;

1 row updated.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       333 Ramji                      3000 Indore
       444 Raju                       4000 MP
       555 XYZ                             pqr

SQL> update emp2 set sal=5000 where empno=555;

1 row updated.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       333 Ramji                      3000 Indore
       444 Raju                       4000 MP
       555 XYZ                        5000 pqr

SQL> update emp2 set sal=null where empno=555;

1 row updated.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       333 Ramji                      3000 Indore
       444 Raju                       4000 MP
       555 XYZ                             pqr

SQL> delete from emp2 where empno=333;

1 row deleted.

SQL> select * from emp2;

     EMPNO ENAME                       SAL ADDRESS
---------- -------------------- ---------- -------------------------
       444 Raju                       4000 MP
       555 XYZ                             pqr

SQL> delete from emp2;

2 rows deleted.

SQL> select * from emp2;

no rows selected

SQL> rollback;

Rollback complete.

SQL> select * from emp2;

no rows selected

SQL> select * from emp2;

no rows selected

SQL> select * from emp1;
select * from emp1
              *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> select * from emp;

     EMPNO
----------
       111

SQL> insert into emp values(222);

1 row created.

SQL> insert into emp values(333);

1 row created.

SQL> commit;

Commit complete.

SQL> select * from emp;

     EMPNO
----------
       111
       222
       333

SQL> delete from emp;

3 rows deleted.

SQL> rollback;

Rollback complete.

SQL> select * from emp;

     EMPNO
----------
       111
       222
       333

SQL> CREATE TABLE DEPT (
  2      deptno   NUMBER(2) PRIMARY KEY,
  3      dname    VARCHAR2(14),
  4      loc      VARCHAR2(13)
  5  );

Table created.

SQL> CREATE TABLE EMP (
  2      empno    NUMBER(4) PRIMARY KEY,
  3      ename    VARCHAR2(10),
  4      job      VARCHAR2(9),
  5      mgr      NUMBER(4),
  6      hiredate DATE,
  7      sal      NUMBER(7,2),
  8      comm     NUMBER(7,2),
  9      deptno   NUMBER(2),
 10      CONSTRAINT fk_dept FOREIGN KEY (deptno) REFERENCES DEPT(deptno)
 11  );
CREATE TABLE EMP (
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> drop table emp;

Table dropped.

SQL> CREATE TABLE EMP (
  2      empno    NUMBER(4) PRIMARY KEY,
  3      ename    VARCHAR2(10),
  4      job      VARCHAR2(9),
  5      mgr      NUMBER(4),
  6      hiredate DATE,
  7      sal      NUMBER(7,2),
  8      comm     NUMBER(7,2),
  9      deptno   NUMBER(2),
 10      CONSTRAINT fk_dept FOREIGN KEY (deptno) REFERENCES DEPT(deptno)
 11  );

Table created.

SQL> INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');

1 row created.

SQL> INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');

1 row created.

SQL> INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');

1 row created.

SQL> INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

1 row created.

SQL> INSERT INTO EMP VALUES (7369, 'SMITH', 'CLERK', 7902, DATE '1980-12-17', 800, NULL, 20);

1 row created.

SQL> INSERT INTO EMP VALUES (7499, 'ALLEN', 'SALESMAN', 7698, DATE '1981-02-20', 1600, 300, 30);

1 row created.

SQL> INSERT INTO EMP VALUES (7521, 'WARD',  'SALESMAN', 7698, DATE '1981-02-22', 1250, 500, 30);

1 row created.

SQL> INSERT INTO EMP VALUES (7566, 'JONES', 'MANAGER', 7839, DATE '1981-04-02', 2975, NULL, 20);

1 row created.

SQL> INSERT INTO EMP VALUES (7698, 'BLAKE', 'MANAGER', 7839, DATE '1981-05-01', 2850, NULL, 30);

1 row created.

SQL> INSERT INTO EMP VALUES (7782, 'CLARK', 'MANAGER', 7839, DATE '1981-06-09', 2450, NULL, 10);

1 row created.

SQL> INSERT INTO EMP VALUES (7788, 'SCOTT', 'ANALYST', 7566, DATE '1987-07-13', 3000, NULL, 20);

1 row created.

SQL> INSERT INTO EMP VALUES (7839, 'KING',  'PRESIDENT', NULL, DATE '1981-11-17', 5000, NULL, 10);

1 row created.

SQL> INSERT INTO EMP VALUES (7844, 'TURNER','SALESMAN', 7698, DATE '1981-09-08', 1500, 0, 30);

1 row created.

SQL> INSERT INTO EMP VALUES (7900, 'JAMES', 'CLERK', 7698, DATE '1981-12-03', 950, NULL, 30);

1 row created.

SQL> INSERT INTO EMP VALUES (7902, 'FORD',  'ANALYST', 7566, DATE '1981-12-03', 3000, NULL, 20);

1 row created.

SQL> INSERT INTO EMP VALUES (7934, 'MILLER','CLERK', 7782, DATE '1982-01-23', 1300, NULL, 10);

1 row created.

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800               20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30
      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000               20
      7839 KING       PRESIDENT            17-NOV-81       5000               10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
      7900 JAMES      CLERK           7698 03-DEC-81        950               30
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

12 rows selected.

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> commit;

Commit complete.

SQL>



--**********************************************************************
SQL*Plus: Release 10.2.0.1.0 - Production on Wed Aug 20 14:03:43 2025

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

SQL> connect itmuser/itmpass
Connected.
SQL>  update emp set comm=nvl2(comm,comm+500,500);

12 rows updated.

SQL>  select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7369 SMITH      CLERK           7902 17-DEC-80        800        500
        20

      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        800
        30

      7521 WARD       SALESMAN        7698 22-FEB-81       1250       1000
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7566 JONES      MANAGER         7839 02-APR-81       2975        500
        20

      7698 BLAKE      MANAGER         7839 01-MAY-81       2850        500
        30

      7782 CLARK      MANAGER         7839 09-JUN-81       2450        500
        10


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000        500
        20

      7839 KING       PRESIDENT            17-NOV-81       5000        500
        10

      7844 TURNER     SALESMAN        7698 08-SEP-81       1500        500
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7900 JAMES      CLERK           7698 03-DEC-81        950        500
        30

      7902 FORD       ANALYST         7566 03-DEC-81       3000        500
        20

      7934 MILLER     CLERK           7782 23-JAN-82       1300        500
        10


12 rows selected.

SQL> set line 200;
SQL> set pagesize 50;
SQL>  select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800        500         20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        800         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250       1000         30
      7566 JONES      MANAGER         7839 02-APR-81       2975        500         20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850        500         30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450        500         10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000        500         20
      7839 KING       PRESIDENT            17-NOV-81       5000        500         10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500        500         30
      7900 JAMES      CLERK           7698 03-DEC-81        950        500         30
      7902 FORD       ANALYST         7566 03-DEC-81       3000        500         20
      7934 MILLER     CLERK           7782 23-JAN-82       1300        500         10

12 rows selected.

SQL> select * from emp where sal between 2000 and 5000;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975        500         20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850        500         30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450        500         10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000        500         20
      7839 KING       PRESIDENT            17-NOV-81       5000        500         10
      7902 FORD       ANALYST         7566 03-DEC-81       3000        500         20

6 rows selected.

SQL> insert into emp(empno,sal) values(111,2000);

1 row created.

SQL> select * from emp where sal between 2000 and 5000;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975        500         20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850        500         30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450        500         10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000        500         20
      7839 KING       PRESIDENT            17-NOV-81       5000        500         10
      7902 FORD       ANALYST         7566 03-DEC-81       3000        500         20
       111                                                 2000

7 rows selected.

SQL> rollback;

Rollback complete.

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select * from emp where comm is null;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

9 rows selected.

SQL> select * from emp where ename like ‘M%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select * from emp where ename like '%M%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select * from emp where ename like '_M%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20

SQL> select * from emp where ename like '__I%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select * from emp where hiredate like ‘%DEC%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> select * from emp where ename like ‘S_%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20

SQL> select * from emp where ename like ‘S%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20

SQL> insert into emp(empno,ename) values(111,'S_ITM');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10
       111 S_ITM

13 rows selected.

SQL> select * from emp where ename like ‘S_%’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
       111 S_ITM

SQL> select * from emp where ename like ‘%S@_%’ escape ‘@’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
       111 S_ITM

SQL> select * from emp where ename like ‘%S#_%’ escape ‘#’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
       111 S_ITM

SQL> insert into emp(empno,ename) values(222,'S__ITM');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from emp where ename like ‘%S#_%’ escape ‘#’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
       111 S_ITM
       222 S__ITM

SQL> select * from emp where ename like ‘%S#_#_%’ escape ‘#’;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
       222 S__ITM

SQL> select ename from emp;

ENAME
----------
SMITH
ALLEN
WARD
JONES
BLAKE
CLARK
SCOTT
KING
TURNER
JAMES
FORD
MILLER
S_ITM
S__ITM

14 rows selected.

SQL> select 'Name' || ename from emp;

'NAME'||ENAME
--------------
NameSMITH
NameALLEN
NameWARD
NameJONES
NameBLAKE
NameCLARK
NameSCOTT
NameKING
NameTURNER
NameJAMES
NameFORD
NameMILLER
NameS_ITM
NameS__ITM

14 rows selected.

SQL> select 'Name=' || ename from emp;

'NAME='||ENAME
---------------
Name=SMITH
Name=ALLEN
Name=WARD
Name=JONES
Name=BLAKE
Name=CLARK
Name=SCOTT
Name=KING
Name=TURNER
Name=JAMES
Name=FORD
Name=MILLER
Name=S_ITM
Name=S__ITM

14 rows selected.

SQL> select mod(10,3) from dual;

 MOD(10,3)
----------
         1

SQL> select mod(10,2) from dual;

 MOD(10,2)
----------
         0

SQL> select round(1.234467,3) from dual;

ROUND(1.234467,3)
-----------------
            1.234

SQL> select round(1.234567,3) from dual;

ROUND(1.234567,3)
-----------------
            1.235

SQL> select round(1575.782,-1) from dual;

ROUND(1575.782,-1)
------------------
              1580

SQL> select round(1575.782,-2) from dual;

ROUND(1575.782,-2)
------------------
              1600

SQL> select round(1545.782,-2) from dual;

ROUND(1545.782,-2)
------------------
              1500

SQL> select ename from emp;

ENAME
----------
SMITH
ALLEN
WARD
JONES
BLAKE
CLARK
SCOTT
KING
TURNER
JAMES
FORD
MILLER
S_ITM
S__ITM

14 rows selected.

SQL> select lower(ename) from emp;

LOWER(ENAM
----------
smith
allen
ward
jones
blake
clark
scott
king
turner
james
ford
miller
s_itm
s__itm

14 rows selected.

SQL> select lower('BALLI') from emp;

LOWER
-----
balli
balli
balli
balli
balli
balli
balli
balli
balli
balli
balli
balli
balli
balli

14 rows selected.

SQL> select lower('BALLI') from dual;

LOWER
-----
balli

SQL> select initcap('ab cd ef') from emp;

INITCAP(
--------
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef
Ab Cd Ef

14 rows selected.

SQL> select initcap('ab cd ef') from dual;

INITCAP(
--------
Ab Cd Ef

SQL> select substr('abcdefgh',-2,1) from dual;

S
-
g

SQL> select * from emp where substr(ename,2,2)='la';

no rows selected

SQL> select * from emp where substr(ename,2,2)='LA';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10

SQL> select * from emp where sal=max(sal);
select * from emp where sal=max(sal)
                            *
ERROR at line 1:
ORA-00934: group function is not allowed here


SQL> select sysdate from dual;

SYSDATE
---------
20-AUG-25

SQL> select add_months(sysdate,2) from dual;

ADD_MONTH
---------
20-OCT-25

SQL> select add_months(sysdate,-2) from dual;

ADD_MONTH
---------
20-JUN-25

SQL> select last_day(sysdate) from dual;

LAST_DAY(
---------
31-AUG-25

SQL> select next_day(sysdate,'friday') from dual;

NEXT_DAY(
---------
22-AUG-25

SQL> select next_day(sysdate,'wednesday') from dual;

NEXT_DAY(
---------
27-AUG-25

SQL> select ename,months_between(sysdate,hiredate) from emp;

ENAME      MONTHS_BETWEEN(SYSDATE,HIREDATE)
---------- --------------------------------
SMITH                            536.116778
ALLEN                                   534
WARD                             533.955487
JONES                            532.600649
BLAKE                            531.632907
CLARK                            530.374842
SCOTT                             457.24581
KING                             525.116778
TURNER                             527.4071
JAMES                             524.56839
FORD                              524.56839
MILLER                           522.923229
S_ITM
S__ITM

14 rows selected.

SQL> select last_day(add_months(sysdate,-1))+1 from dual;

LAST_DAY(
---------
01-AUG-25

SQL> select to_char(sysdate,'dd/mm/yy') from dual;

TO_CHAR(
--------
20/08/25

SQL> select to_char(sysdate,'day')from dual;

TO_CHAR(SYSDATE,'DAY')
------------------------------------
wednesday

SQL> friday
SP2-0042: unknown command "friday" - rest of line ignored.
SQL> select to_char(sysdate,'DAY')from dual;

TO_CHAR(SYSDATE,'DAY')
------------------------------------
WEDNESDAY

SQL> select to_char(sysdate,'day')from dual;

TO_CHAR(SYSDATE,'DAY')
------------------------------------
wednesday

SQL> select to_char(sysdate,'D')from dual;

T
-
4

SQL> select to_char(sysdate,'DD')from dual;

TO
--
20

SQL> select to_char(sysdate,'DDD')from dual;

TO_
---
232

SQL> select to_char(sysdate,'mm')from dual;

TO
--
08

SQL> select to_char(sysdate,'MM')from dual;

TO
--
08

SQL> select to_char(sysdate,'HH:MI:SS')from dual;

TO_CHAR(
--------
03:20:46

SQL> select to_char(sysdate,'HH:MI:SS')from dual;

TO_CHAR(
--------
03:28:57

SQL> select * from emp where to_char(hiredate,'MON')='DEC';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> select * from emp where to_char(hiredate,'FMMONTH')='DECEMBER';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> select * from emp where to_char(hiredate,'MONTH')='DECEMBER';

no rows selected

SQL> select * from emp where to_char(hiredate,'FMMONTH')='DECEMBER';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> create table test3(col1 date);

Table created.

SQL> insert into test3 values(sysdate);

1 row created.

SQL> select * from test3;

COL1
---------
20-AUG-25

SQL> select * from emp where sal=min(sal);
select * from emp where sal=min(sal)
                            *
ERROR at line 1:
ORA-00934: group function is not allowed here


SQL> select avg(comm) from emp;

 AVG(COMM)
----------
266.666667

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10
       111 S_ITM
       222 S__ITM

14 rows selected.

SQL> select count(*)  from emp;

  COUNT(*)
----------
        14

SQL> select count(comm)  from emp;

COUNT(COMM)
-----------
          3

SQL> select count(*) from emp group by deptno;

  COUNT(*)
----------
         5
         2
         4
         3

SQL> select deptno,count(*) from emp group by deptno;

    DEPTNO   COUNT(*)
---------- ----------
        30          5
                    2
        20          4
        10          3

SQL> select deptno,count(*) from emp group by job;
select deptno,count(*) from emp group by job
       *
ERROR at line 1:
ORA-00979: not a GROUP BY expression


SQL> select job,count(*) from emp group by job;

JOB         COUNT(*)
--------- ----------
                   2
CLERK              3
SALESMAN           3
PRESIDENT          1
MANAGER            3
ANALYST            2

6 rows selected.

SQL> select deptno,max(sal),min(sal) from emp group by deptno;

    DEPTNO   MAX(SAL)   MIN(SAL)
---------- ---------- ----------
        30       2850        950

        20       3000        800
        10       5000       1300

SQL> select deptno,count(*) from emp group by deptno having
  2  count(*)>3;

    DEPTNO   COUNT(*)
---------- ----------
        30          5
        20          4

SQL> select ename from emp order by ename;

ENAME
----------
ALLEN
BLAKE
CLARK
FORD
JAMES
JONES
KING
MILLER
SCOTT
SMITH
S_ITM
S__ITM
TURNER
WARD

14 rows selected.

SQL> select ename from emp order by ename asc;

ENAME
----------
ALLEN
BLAKE
CLARK
FORD
JAMES
JONES
KING
MILLER
SCOTT
SMITH
S_ITM
S__ITM
TURNER
WARD

14 rows selected.

SQL> select ename from emp order by ename desc;

ENAME
----------
WARD
TURNER
S__ITM
S_ITM
SMITH
SCOTT
MILLER
KING
JONES
JAMES
FORD
CLARK
BLAKE
ALLEN

14 rows selected.

SQL> select ename,dname from emp,dept;

ENAME      DNAME
---------- --------------
SMITH      ACCOUNTING
ALLEN      ACCOUNTING
WARD       ACCOUNTING
JONES      ACCOUNTING
BLAKE      ACCOUNTING
CLARK      ACCOUNTING
SCOTT      ACCOUNTING
KING       ACCOUNTING
TURNER     ACCOUNTING
JAMES      ACCOUNTING
FORD       ACCOUNTING
MILLER     ACCOUNTING
S_ITM      ACCOUNTING
S__ITM     ACCOUNTING
SMITH      RESEARCH
ALLEN      RESEARCH
WARD       RESEARCH
JONES      RESEARCH
BLAKE      RESEARCH
CLARK      RESEARCH
SCOTT      RESEARCH
KING       RESEARCH
TURNER     RESEARCH
JAMES      RESEARCH
FORD       RESEARCH
MILLER     RESEARCH
S_ITM      RESEARCH
S__ITM     RESEARCH
SMITH      SALES
ALLEN      SALES
WARD       SALES
JONES      SALES
BLAKE      SALES
CLARK      SALES
SCOTT      SALES
KING       SALES
TURNER     SALES
JAMES      SALES
FORD       SALES
MILLER     SALES
S_ITM      SALES
S__ITM     SALES
SMITH      OPERATIONS
ALLEN      OPERATIONS
WARD       OPERATIONS
JONES      OPERATIONS
BLAKE      OPERATIONS

ENAME      DNAME
---------- --------------
CLARK      OPERATIONS
SCOTT      OPERATIONS
KING       OPERATIONS
TURNER     OPERATIONS
JAMES      OPERATIONS
FORD       OPERATIONS
MILLER     OPERATIONS
S_ITM      OPERATIONS
S__ITM     OPERATIONS

56 rows selected.

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> select * frok emp;
select * frok emp
         *
ERROR at line 1:
ORA-00923: FROM keyword not found where expected


SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10
       111 S_ITM
       222 S__ITM

14 rows selected.

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> select ename,sal,loc,dname from emp,dept where
  2  emp.deptno=dept.deptno;

ENAME             SAL LOC           DNAME
---------- ---------- ------------- --------------
SMITH             800 DALLAS        RESEARCH
ALLEN            1600 CHICAGO       SALES
WARD             1250 CHICAGO       SALES
JONES            2975 DALLAS        RESEARCH
BLAKE            2850 CHICAGO       SALES
CLARK            2450 NEW YORK      ACCOUNTING
SCOTT            3000 DALLAS        RESEARCH
KING             5000 NEW YORK      ACCOUNTING
TURNER           1500 CHICAGO       SALES
JAMES             950 CHICAGO       SALES
FORD             3000 DALLAS        RESEARCH
MILLER           1300 NEW YORK      ACCOUNTING

12 rows selected.

SQL> select ename,sal,loc,dname from emp e,dept d where e.deptno=d.deptno;

ENAME             SAL LOC           DNAME
---------- ---------- ------------- --------------
SMITH             800 DALLAS        RESEARCH
ALLEN            1600 CHICAGO       SALES
WARD             1250 CHICAGO       SALES
JONES            2975 DALLAS        RESEARCH
BLAKE            2850 CHICAGO       SALES
CLARK            2450 NEW YORK      ACCOUNTING
SCOTT            3000 DALLAS        RESEARCH
KING             5000 NEW YORK      ACCOUNTING
TURNER           1500 CHICAGO       SALES
JAMES             950 CHICAGO       SALES
FORD             3000 DALLAS        RESEARCH
MILLER           1300 NEW YORK      ACCOUNTING

12 rows selected.

SQL> select ename,sal,loc,dname from emp e,dept d where e.deptno=dept.deptno;
select ename,sal,loc,dname from emp e,dept d where e.deptno=dept.deptno
                                                            *
ERROR at line 1:
ORA-00904: "DEPT"."DEPTNO": invalid identifier


SQL> select ename,sal,loc,dname from emp e,dept d where e.deptno=d.deptno;

ENAME             SAL LOC           DNAME
---------- ---------- ------------- --------------
SMITH             800 DALLAS        RESEARCH
ALLEN            1600 CHICAGO       SALES
WARD             1250 CHICAGO       SALES
JONES            2975 DALLAS        RESEARCH
BLAKE            2850 CHICAGO       SALES
CLARK            2450 NEW YORK      ACCOUNTING
SCOTT            3000 DALLAS        RESEARCH
KING             5000 NEW YORK      ACCOUNTING
TURNER           1500 CHICAGO       SALES
JAMES             950 CHICAGO       SALES
FORD             3000 DALLAS        RESEARCH
MILLER           1300 NEW YORK      ACCOUNTING

12 rows selected.

SQL> select ename,sal,loc,dname,deptno from emp e,dept d where e.deptno=d.deptno;
select ename,sal,loc,dname,deptno from emp e,dept d where e.deptno=d.deptno
                           *
ERROR at line 1:
ORA-00918: column ambiguously defined


SQL> select ename,sal,loc,dname,dept.deptno from emp e,dept d where e.deptno=d.deptno;
select ename,sal,loc,dname,dept.deptno from emp e,dept d where e.deptno=d.deptno
                           *
ERROR at line 1:
ORA-00904: "DEPT"."DEPTNO": invalid identifier


SQL> select ename,sal,loc,dname,d.deptno from emp e,dept d where e.deptno=d.deptno;

ENAME             SAL LOC           DNAME              DEPTNO
---------- ---------- ------------- -------------- ----------
SMITH             800 DALLAS        RESEARCH               20
ALLEN            1600 CHICAGO       SALES                  30
WARD             1250 CHICAGO       SALES                  30
JONES            2975 DALLAS        RESEARCH               20
BLAKE            2850 CHICAGO       SALES                  30
CLARK            2450 NEW YORK      ACCOUNTING             10
SCOTT            3000 DALLAS        RESEARCH               20
KING             5000 NEW YORK      ACCOUNTING             10
TURNER           1500 CHICAGO       SALES                  30
JAMES             950 CHICAGO       SALES                  30
FORD             3000 DALLAS        RESEARCH               20
MILLER           1300 NEW YORK      ACCOUNTING             10

12 rows selected.

SQL> select ename,hiredate,sal,d.deptno,dname from emp e,dept d
  2  where e.deptno=d.deptno and d.loc='CHICAGO';

ENAME      HIREDATE         SAL     DEPTNO DNAME
---------- --------- ---------- ---------- --------------
ALLEN      20-FEB-81       1600         30 SALES
WARD       22-FEB-81       1250         30 SALES
BLAKE      01-MAY-81       2850         30 SALES
TURNER     08-SEP-81       1500         30 SALES
JAMES      03-DEC-81        950         30 SALES

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> select * from emp where deptno =30;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30

SQL> ^A^A





























































































