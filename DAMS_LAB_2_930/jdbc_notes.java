/*
    Required Software:
	----------------
	
	JDK
	Oracle Database / Mysql 
	Driver Software (ojdbc6.jar , ojdbc8.jar , ojdbc11.jar for oracle)
	Eclipse | STS (IDE to type the code)
	
	==============================================================================
	We are installing oracle-10g database software
	
	right click--->run as admin--->yes--->next--->accept terms and conditions-->
	--->password  ====>confirm password--->next-->install--->finish
	
	after successfull installation
	   |-open RUN SQL Command line
	       |-go to search box and type run sql and click
		   |-conn sys as sysdba;
		   |-enter password-admin (at the time of installation)
		      |-Connected
			  
			  SQL> show user;
				   USER is "SYS"
				   
		  How to create our own user:
		  ---------------------------
		  
		  SQL> create user udams identified by pdams;

               User created.
			   
			  Get Permission for our created user:
			  
			  SQL> grant dba to udams;

                   Grant succeeded.
				   
				   Connect to our created user
				   
				   SQL> connect udams/pdams
                     Connected.
					 
					 SQL> show user;
                          USER is "UDAMS"
		=====================================================================
		How to create table:
		SQL> create table items(srno  number(5),itemname  varchar2(20), weight  number(5));

        Table created.
		
		Fetch Records from table:
		
		
            SQL> select * from items;

            no rows selected
			
			How to get all table details
			
			SQL> select * from tab;
			
			===========================================
			To describe table:
			    desc tablename;
			QL> desc items;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 SRNO                                               NUMBER(5)
 ITEMNAME                                           VARCHAR2(20)
 WEIGHT                                             NUMBER(5)
			
			-----------------------------------------
			insert records into database table
			
			insert into items values(101,'Gold',100);
			
			SQL> insert into items values(101,'Gold',100);

1 row created.

SQL> insert into items values(102,'Silver',200);

1 row created.

SQL> insert into items values(103,'Diamond',300);

1 row created.

SQL> commit;

Commit complete.

SQL> select * from items;

      SRNO ITEMNAME                 WEIGHT
---------- -------------------- ----------
       101 Gold                        150  update using java app
       102 Silver                      200  delete using java app
       103 Diamond                     300  run sql command line
	   104 Ruby                        400  insert using java app
	                                        fetch records using java app
=========================================================================

create a java project using sts:
--------------------------------
File --->new --->java project-->project name--->next--->finish

create a package within src of project--->package name --->finish

create a java class:- rt click on package--->new --->class--->classname--->finish

How to add jarb file in sts/eclipse

Rt click on project---->build path --->configure build path---->libraries--->
add external jars--->select the jar (from your system)---->apply andf close



****************************************************************************8

SQL> insert into student values(111,'Raja','kanpur',1234566780);

1 row created.

SQL> insert into student values(333,'Rani','kanpur dehat',123456634);

1 row created.
*/