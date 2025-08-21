
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

--===================================================================
--=================================day-2--------------------------


SQL*Plus: Release 10.2.0.1.0 - Production on Thu Aug 21 10:12:07 2025

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

SQL> connect
Enter user-name: itmuser/itmpass
Connected.
SQL> drop table test1;
drop table test1
           *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> create table test1(deptno number(5));

Table created.

SQL> create table test2(deptno number(5));
create table test2(deptno number(5))
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> drop table test2;

Table dropped.

SQL> create table test2(deptno number(5));

Table created.

SQL> insert into test1 values(20);

1 row created.

SQL> insert into test2 values(10);

1 row created.

SQL> insert into test2 values(20);

1 row created.

SQL> insert into test2 values(30);

1 row created.

SQL> commit;

Commit complete.

SQL> select * from test1;

    DEPTNO
----------
        20

SQL> select * from test2;

    DEPTNO
----------
        10
        20
        30

SQL> select * from test1,test2 where test1.deptno>test2.deptno;

    DEPTNO     DEPTNO
---------- ----------
        20         10

SQL> select * from salgrade;
select * from salgrade
              *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> -- Create SALGRADE table
SQL> CREATE TABLE salgrade (
  2      grade NUMBER(2) PRIMARY KEY,
  3      losal NUMBER(7,2),
  4      hisal NUMBER(7,2)
  5  );

Table created.

SQL>
SQL> -- Insert sample data (like SCOTT schema)
SQL> INSERT INTO salgrade VALUES (1, 700, 1200);

1 row created.

SQL> INSERT INTO salgrade VALUES (2, 1201, 1400);

1 row created.

SQL> INSERT INTO salgrade VALUES (3, 1401, 2000);

1 row created.

SQL> INSERT INTO salgrade VALUES (4, 2001, 3000);

1 row created.

SQL> INSERT INTO salgrade VALUES (5, 3001, 9999);

1 row created.

SQL>
SQL> -- Commit changes
SQL> COMMIT;

Commit complete.

SQL> select * from salgrade;

     GRADE      LOSAL      HISAL
---------- ---------- ----------
         1        700       1200
         2       1201       1400
         3       1401       2000
         4       2001       3000
         5       3001       9999

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


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
       111 S_ITM


       222 S__ITM



14 rows selected.

SQL> set line 200;
SQL> set pagesize 50;
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

SQL> select ename,sal,losal,hisal,grade from emp,salgrade where (sal between losal
  2  and hisal) or (sal<=losal and sal>=hisal);

ENAME             SAL      LOSAL      HISAL      GRADE
---------- ---------- ---------- ---------- ----------
SMITH             800        700       1200          1
JAMES             950        700       1200          1
WARD             1250       1201       1400          2
MILLER           1300       1201       1400          2
ALLEN            1600       1401       2000          3
TURNER           1500       1401       2000          3
JONES            2975       2001       3000          4
BLAKE            2850       2001       3000          4
CLARK            2450       2001       3000          4
SCOTT            3000       2001       3000          4
FORD             3000       2001       3000          4
KING             5000       3001       9999          5

12 rows selected.

SQL> select e1.ename as employee,e2.empno,e2.ename as manager from
  2  emp e1,emp e2 where e1.mgr=e2.empno;

EMPLOYEE        EMPNO MANAGER
---------- ---------- ----------
FORD             7566 JONES
SCOTT            7566 JONES
JAMES            7698 BLAKE
TURNER           7698 BLAKE
WARD             7698 BLAKE
ALLEN            7698 BLAKE
MILLER           7782 CLARK
CLARK            7839 KING
BLAKE            7839 KING
JONES            7839 KING
SMITH            7902 FORD

11 rows selected.

SQL> select e1.ename as Employee,e2.ename as Manager from emp
  2  e1,emp e2 where e1.mgr=e2.empno and e1.sal>e2.sal;

EMPLOYEE   MANAGER
---------- ----------
FORD       JONES
SCOTT      JONES

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> select ename,sal,dname,dept.deptno,loc from emp,dept where
  2  emp.deptno(+)=dept.deptno;

ENAME             SAL DNAME              DEPTNO LOC
---------- ---------- -------------- ---------- -------------
SMITH             800 RESEARCH               20 DALLAS
ALLEN            1600 SALES                  30 CHICAGO
WARD             1250 SALES                  30 CHICAGO
JONES            2975 RESEARCH               20 DALLAS
BLAKE            2850 SALES                  30 CHICAGO
CLARK            2450 ACCOUNTING             10 NEW YORK
SCOTT            3000 RESEARCH               20 DALLAS
KING             5000 ACCOUNTING             10 NEW YORK
TURNER           1500 SALES                  30 CHICAGO
JAMES             950 SALES                  30 CHICAGO
FORD             3000 RESEARCH               20 DALLAS
MILLER           1300 ACCOUNTING             10 NEW YORK
                      OPERATIONS             40 BOSTON

13 rows selected.

SQL> select ename,sal,d.deptno,dname from emp e join dept d on
  2  e.deptno=d.deptno;

ENAME             SAL     DEPTNO DNAME
---------- ---------- ---------- --------------
SMITH             800         20 RESEARCH
ALLEN            1600         30 SALES
WARD             1250         30 SALES
JONES            2975         20 RESEARCH
BLAKE            2850         30 SALES
CLARK            2450         10 ACCOUNTING
SCOTT            3000         20 RESEARCH
KING             5000         10 ACCOUNTING
TURNER           1500         30 SALES
JAMES             950         30 SALES
FORD             3000         20 RESEARCH
MILLER           1300         10 ACCOUNTING

12 rows selected.

SQL> create table demo1(A varchar2(5),B varchar2(5),C varchar2(5));

Table created.

SQL> desc demo1;
 Name                                                                                                              Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 A                                                                                                                          VARCHAR2(5)
 B                                                                                                                          VARCHAR2(5)
 C                                                                                                                          VARCHAR2(5)

SQL> create table demo2(A varchar2(5),B varchar2(5));

Table created.

SQL> insert into demo1 values('p','q','r');

1 row created.

SQL> insert into demo1 values('x','y','z');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from demo1;

A     B     C
----- ----- -----
p     q     r
x     y     z

SQL> insert into demo1 values('p','q');
insert into demo1 values('p','q')
            *
ERROR at line 1:
ORA-00947: not enough values


SQL> insert into demo2 values('p','q');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from demo2;

A     B
----- -----
p     q

SQL> select * from demo1 left outer join demo2 on demo1.a=demo2.a and demo1.b=demo2.b;

A     B     C     A     B
----- ----- ----- ----- -----
p     q     r     p     q
x     y     z

SQL> insert into demo2 values('s','t');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from demo1 right outer join demo2 on demo1.a=demo2.a and demo1.b=demo2.b;

A     B     C     A     B
----- ----- ----- ----- -----
p     q     r     p     q
                  s     t

SQL> select * from demo1 right outer join demo2 on demo1.a=demo2.a and demo1.b=demo2.b;

A     B     C     A     B
----- ----- ----- ----- -----
p     q     r     p     q
                  s     t

SQL> select * from demo1 full outer join demo2 on demo1.a=demo2.a and demo1.b=demo2.b;

A     B     C     A     B
----- ----- ----- ----- -----
p     q     r     p     q
x     y     z
                  s     t

SQL> create table z1(sno number(5) not null,sname varchar2(20));

Table created.

SQL> insert into z1 values(1,'raja');

1 row created.

SQL> insert into z1 values(2,'rani');

1 row created.

SQL> insert into z1 values(1,'raja');

1 row created.

SQL> select * from z1;

       SNO SNAME
---------- --------------------
         1 raja
         2 rani
         1 raja

SQL> insert into z1 values(null,'rahul');
insert into z1 values(null,'rahul')
                      *
ERROR at line 1:
ORA-01400: cannot insert NULL into ("ITMUSER"."Z1"."SNO")


SQL> drop table z1;

Table dropped.

SQL> create table z1(sno number(5) unique,sname varchar2(20));

Table created.

SQL> insert into z1 values(1,'raja');

1 row created.

SQL> insert into z1 values(1,'raja');
insert into z1 values(1,'raja')
*
ERROR at line 1:
ORA-00001: unique constraint (ITMUSER.SYS_C004111) violated


SQL> insert into z1 values(2,'raja');

1 row created.

SQL> select * from z1;

       SNO SNAME
---------- --------------------
         1 raja
         2 raja

SQL> insert into z1 values(null,null);

1 row created.

SQL> create table z1(sno number(5),sname varchar2(20) , unique(sno,sname));
create table z1(sno number(5),sname varchar2(20) , unique(sno,sname))
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> drop table z1;

Table dropped.

SQL> create table z1(sno number(5),sname varchar2(20) , unique(sno,sname));

Table created.

SQL> insert into z1 values(1,'raja');

1 row created.

SQL> insert into z1 values(2,'raja');

1 row created.

SQL> select * from z1;

       SNO SNAME
---------- --------------------
         1 raja
         2 raja

SQL> drop table z1;

Table dropped.

SQL> create table z1(sno number(5) primary key,sname varchar2(20));

Table created.

SQL> insert into z1 values(1,'raja');

1 row created.

SQL> insert into z1 values(2,'rani');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from z1;

       SNO SNAME
---------- --------------------
         1 raja
         2 rani

SQL> create table z2(sno number(5) references z1(sno));

Table created.

SQL> insert into z2 values(2);

1 row created.

SQL> insert into z2 values(4);
insert into z2 values(4)
*
ERROR at line 1:
ORA-02291: integrity constraint (ITMUSER.SYS_C004114) violated - parent key not found


SQL> insert into z1 values(4,'rani');

1 row created.

SQL> commit;

Commit complete.

SQL> insert into z2 values(4);

1 row created.

SQL> insert into z2 values(4);

1 row created.

SQL> select * from z2;

       SNO
----------
         2
         4
         4

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

SQL> create table z6(name varchar2(20),sal number(10) check(sal>1000));

Table created.

SQL> insert into z6 values('raja',3000);

1 row created.

SQL> insert into z6 values('raja',900);
insert into z6 values('raja',900)
*
ERROR at line 1:
ORA-02290: check constraint (ITMUSER.SYS_C004115) violated


SQL> select avg(sal) from emp;

  AVG(SAL)
----------
2222.91667

SQL> select * from emp where sal>2222.91667;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

6 rows selected.

SQL> select * from emp where sal>(select avg(sal) from emp);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

6 rows selected.

SQL> select * from emp where sal>avg(sal);
select * from emp where sal>avg(sal)
                            *
ERROR at line 1:
ORA-00934: group function is not allowed here


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

SQL> select * from emp where deptno=(select deptno from dept where
  2  dname='SALES');

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30

SQL> select * from emp where hiredate=(select min(hiredate) from emp);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20

SQL> select * from emp where deptno=(select deptno from emp where
  2  ename='SMITH');

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> select max(sal) from emp);
select max(sal) from emp)
                        *
ERROR at line 1:
ORA-00933: SQL command not properly ended


SQL> select max(sal) from emp;

  MAX(SAL)
----------
      5000

SQL> select job,avg(sal) from emp group by job having avg(sal)>(select
  2  avg(sal) from emp where job='CLERK');

JOB         AVG(SAL)
--------- ----------
SALESMAN        1450
PRESIDENT       5000
MANAGER   2758.33333
ANALYST         3000

SQL> select * from emp where sal=(select max(sal) from emp group by
  2  deptno);
select * from emp where sal=(select max(sal) from emp group by
                             *
ERROR at line 1:
ORA-01427: single-row subquery returns more than one row


SQL> select max(sal) from emp group by deptno;

  MAX(SAL)
----------
      2850

      3000
      5000

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

SQL> delete from emp where empno=111;

1 row deleted.

SQL> delete from emp where empno=222;

1 row deleted.

SQL> commit;

Commit complete.

SQL> select max(sal) from emp group by deptno;

  MAX(SAL)
----------
      2850
      3000
      5000

SQL> select * from emp where sal in(select max(sal) from emp group by deptno);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> select job,mgr from emp
  2  where ename='SCOTT';

JOB              MGR
--------- ----------
ANALYST         7566

SQL> select * from emp where (job,mgr) in(select job,mgr from emp
  2  where ename='SCOTT');

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20

SQL> select * from emp where sal in(select max(sal) from emp group by deptno);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

SQL> update emp set sal=2850 where ename='FORD';

1 row updated.

SQL> select * from emp where sal in(select max(sal) from emp group by deptno);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20

SQL> select max(sal) from emp group by deptno;

  MAX(SAL)
----------
      2850
      3000
      5000

SQL> select * from emp where (deptno,sal) in(select deptno,max(sal) from
  2  emp group by deptno);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10

SQL> Select ename ,sal,sal*12 annsal from emp where annsal>2000;
Select ename ,sal,sal*12 annsal from emp where annsal>2000
                                               *
ERROR at line 1:
ORA-00904: "ANNSAL": invalid identifier


SQL> select ename,sal,sal*12 annsal from emp;

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
FORD             2850      34200
MILLER           1300      15600

12 rows selected.

SQL> Select * from(select ename,sal,sal*12 annsal from emp) where annsal>20000;

ENAME             SAL     ANNSAL
---------- ---------- ----------
JONES            2975      35700
BLAKE            2850      34200
CLARK            2450      29400
SCOTT            3000      36000
KING             5000      60000
FORD             2850      34200

6 rows selected.

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
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select rownum,ename from emp;

    ROWNUM ENAME
---------- ----------
         1 SMITH
         2 ALLEN
         3 WARD
         4 JONES
         5 BLAKE
         6 CLARK
         7 SCOTT
         8 KING
         9 TURNER
        10 JAMES
        11 FORD
        12 MILLER

12 rows selected.

SQL> select rowid,rownum,ename from emp;

ROWID                  ROWNUM ENAME
------------------ ---------- ----------
AAADkJAABAAAKlCAAA          1 SMITH
AAADkJAABAAAKlCAAB          2 ALLEN
AAADkJAABAAAKlCAAC          3 WARD
AAADkJAABAAAKlCAAD          4 JONES
AAADkJAABAAAKlCAAE          5 BLAKE
AAADkJAABAAAKlCAAF          6 CLARK
AAADkJAABAAAKlCAAG          7 SCOTT
AAADkJAABAAAKlCAAH          8 KING
AAADkJAABAAAKlCAAI          9 TURNER
AAADkJAABAAAKlCAAJ         10 JAMES
AAADkJAABAAAKlCAAK         11 FORD
AAADkJAABAAAKlCAAL         12 MILLER

12 rows selected.

SQL> select rowid,rownum,ename from emp order by ename;

ROWID                  ROWNUM ENAME
------------------ ---------- ----------
AAADkJAABAAAKlCAAB          2 ALLEN
AAADkJAABAAAKlCAAE          5 BLAKE
AAADkJAABAAAKlCAAF          6 CLARK
AAADkJAABAAAKlCAAK         11 FORD
AAADkJAABAAAKlCAAJ         10 JAMES
AAADkJAABAAAKlCAAD          4 JONES
AAADkJAABAAAKlCAAH          8 KING
AAADkJAABAAAKlCAAL         12 MILLER
AAADkJAABAAAKlCAAG          7 SCOTT
AAADkJAABAAAKlCAAA          1 SMITH
AAADkJAABAAAKlCAAI          9 TURNER
AAADkJAABAAAKlCAAC          3 WARD

12 rows selected.

SQL> select ename from emp where deptno=10;

ENAME
----------
CLARK
KING
MILLER

SQL> select ename,rownum from emp where deptno=10;

ENAME          ROWNUM
---------- ----------
CLARK               1
KING                2
MILLER              3

SQL> select * from emp where rownum=1;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20

SQL> select * from emp where rownum=2;

no rows selected

SQL> select * from emp where rownum<=5;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30

SQL> select * from(select * from emp order by sal desc) where
  2  rownum<=5;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20

SQL> select * from(select * from emp order by sal desc) where
  2  rownum<=5 minus (select * from(select * from emp order by sal desc) where
  3  rownum<=4);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20

SQL> select sal from emp order sal;
select sal from emp order sal
                          *
ERROR at line 1:
ORA-00924: missing BY keyword


SQL> select sal from emp order by sal;

       SAL
----------
       800
       950
      1250
      1300
      1500
      1600
      2450
      2850
      2850
      2975
      3000
      5000

12 rows selected.

SQL> select sal from emp order by sal desc;

       SAL
----------
      5000
      3000
      2975
      2850
      2850
      2450
      1600
      1500
      1300
      1250
       950
       800

12 rows selected.

SQL> select * from emp minus select * from emp where rownum<=(select
  2  count(*) from emp)-2;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

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
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select * from(select rownum r,emp.* from emp) where r=2;

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
         2       7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30

SQL> select * from(select rownum r,emp.* from emp) where r=10;

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
        10       7900 JAMES      CLERK           7698 03-DEC-81        950                    30

SQL> select * from(select rownum r,emp.* from emp) where r=12;

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
        12       7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select * from(select rownum r,emp.* from emp) where r=2;

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
         2       7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30

SQL> select * from(select rownum r,emp.* from emp) where r between 3
  2  and 7;

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
         3       7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
         4       7566 JONES      MANAGER         7839 02-APR-81       2975                    20
         5       7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
         6       7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
         7       7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20

SQL> select * from(select rownum r,emp.* from emp) where r in
  2  (2,3,7,10);

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
         2       7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
         3       7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
         7       7788 SCOTT      ANALYST         7566 13-JUL-87       3000                    20
        10       7900 JAMES      CLERK           7698 03-DEC-81        950                    30

SQL> select * from(select rownum as r,emp.* from emp) where r in
  2  (1,(select count(*) from emp));

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
         1       7369 SMITH      CLERK           7902 17-DEC-80        800                    20
        12       7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> select * from(select rownum as r,emp.* from emp) where
  2  mod(r,2)=0;

         R      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
         2       7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
         4       7566 JONES      MANAGER         7839 02-APR-81       2975                    20
         6       7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
         8       7839 KING       PRESIDENT            17-NOV-81       5000                    10
        10       7900 JAMES      CLERK           7698 03-DEC-81        950                    30
        12       7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

6 rows selected.

SQL> select * from(select rownum as r,ename,sal from (select * from emp
  2  order by sal desc)) where r=5 ;

         R ENAME             SAL
---------- ---------- ----------
         5 BLAKE            2850

SQL> order by sal desc)) where r=1 ;
SP2-0734: unknown command beginning "order by s..." - rest of line ignored.
SQL> select * from(select rownum as r,ename,sal from (select * from emp
  2  order by sal desc)) where r=1 ;

         R ENAME             SAL
---------- ---------- ----------
         1 KING             5000

SQL> select * from(select rownum as r,ename,sal from (select * from emp
  2  order by sal desc)) where r=2;

         R ENAME             SAL
---------- ---------- ----------
         2 SCOTT            3000

SQL> select * from (select deptno,sal,row_number() over(partition by
  2  deptno order by sal desc) r from emp) where r<10;

    DEPTNO        SAL          R
---------- ---------- ----------
        10       5000          1
        10       2450          2
        10       1300          3
        20       3000          1
        20       2975          2
        20       2850          3
        20        800          4
        30       2850          1
        30       1600          2
        30       1500          3
        30       1250          4
        30        950          5

12 rows selected.

SQL> select * from (select deptno,sal,row_number() over(partition by
  2  ;

*
ERROR at line 2:
ORA-00936: missing expression


SQL> select * from (select deptno,sal,rank() over(partition by
  2  deptno order by sal desc) r from emp) where r<10;

    DEPTNO        SAL          R
---------- ---------- ----------
        10       5000          1
        10       2450          2
        10       1300          3
        20       3000          1
        20       2975          2
        20       2850          3
        20        800          4
        30       2850          1
        30       1600          2
        30       1500          3
        30       1250          4
        30        950          5

12 rows selected.

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
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

12 rows selected.

SQL> select * from (select deptno,sal,row_number() over(order by sal
  2  desc) r from emp) where r=5;

    DEPTNO        SAL          R
---------- ---------- ----------
        20       2850          5

SQL> select * from (select deptno,sal,row_number() over(order by sal
  2  desc) r from emp) where r=&n;
Enter value for n: 1
old   2: desc) r from emp) where r=&n
new   2: desc) r from emp) where r=1

    DEPTNO        SAL          R
---------- ---------- ----------
        10       5000          1

SQL> /
Enter value for n: 2
old   2: desc) r from emp) where r=&n
new   2: desc) r from emp) where r=2

    DEPTNO        SAL          R
---------- ---------- ----------
        20       3000          2

SQL> /
Enter value for n: 3
old   2: desc) r from emp) where r=&n
new   2: desc) r from emp) where r=3

    DEPTNO        SAL          R
---------- ---------- ----------
        20       2975          3

SQL> /4
Enter value for n: 5
old   2: desc) r from emp) where r=&n
new   2: desc) r from emp) where r=5

    DEPTNO        SAL          R
---------- ---------- ----------
        20       2850          5

SQL> /
Enter value for n: 10
old   2: desc) r from emp) where r=&n
new   2: desc) r from emp) where r=10

    DEPTNO        SAL          R
---------- ---------- ----------
        30       1250         10

SQL> create or replace view vl
  2  as
  3  select * from emp where deptno=10;

View created.

SQL> select * from vl;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SQL> insert into vl(ename,sal,deptno) values('kayum',5000,30);
insert into vl(ename,sal,deptno) values('kayum',5000,30)
*
ERROR at line 1:
ORA-01400: cannot insert NULL into ("ITMUSER"."EMP"."EMPNO")


SQL> insert into vl(empno,ename,deptno) values(101,'Kayum',30);

1 row created.

SQL> select * from vl;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

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
      7902 FORD       ANALYST         7566 03-DEC-81       2850                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10
       101 Kayum                                                                   30

13 rows selected.

SQL> create or replace view al as select deptno,max(sal) salary from emp
  2  group by deptno;

View created.

SQL> select * from al;

    DEPTNO     SALARY
---------- ----------
        30       2850
        20       3000
        10       5000




























































































