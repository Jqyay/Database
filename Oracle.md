if having trouble to install the oracle 21.x.x
- uninstall the oracle in the window setting->app
- win+ r
- type regedit.exe, press enter
- type path Computer\HKEY_LOCAL_MACHINE\SOFTWARE\ORACLE
- right click the ORACLE folder and hit delete
- go to C:\Program Files\Oracle\Inventory (or C:\Program Files (x86)\Oracle\Inventory if you have the 32bit install), delete the Oracle folder from the program files
- win + r
- type services.msc
- scroll to find the the Oracle services 
- go to win, search command prompt, run as administrator
- type sc stop X, sc delete X for each Oracle device (replace X with the name of the service name, u can find it by right click on the service and choose properties)
- got to the path where u install the DB previously (C:\app unless u configure it before)


after installing the oracle 21.x.x
- go to C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Oracle - OraDB21Home1\Application Development
- open the SQL Plus
- u should see "Enter user-name:"
- type / as sysdba
- u should see "Connected to Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production"
- type select name from v$pdbs;
- u will get the list of the name of database service available
- use name of the database service, type connect sys/oracle@localhost:1521/XEPDB1 as sysdba;
- type create user (schema name u want) identified by (password) default tablespace users quota unlimited on users;
- grant create session, create table to (schema name)
- connect (schema name)/(password)@localhost:1521/XEPDB1 as sysdba;
- grant connect, resource to db;


install sql developer in the official website of oracle

create connection in the sql developer
- first u need to open command prompt run as administrator
- lsnrctl status
- lsnrctl start
- press the green "+' button to create connection


for creating procedure n dbms scheduler
- sql plus
- connect (schema name)/(password)@localhost:1521/XEPDB1 as sysdba;
- alter session set current_schema = username;
- grant create procedure to username;
- grant execute on Sale to username;
- grant select, insert, update, delete on sale to username;
- grant execute on delete_sale to username;
- grant create job to username;
- grant execute on DBMS_SCHEDULER to username;
- grant create trigger to db;
- grant execute on update_staff_age to db;
- grant all on Product to db


troubleshooting connection error
- go to sql plus
- select name from v$database;(check which pdb u are connecting)
- ALTER SESSION SET CONTAINER = <PDB(XEPDB1)>;
- SELECT name, status FROM v$services; (check if services is started)
- SELECT status FROM v$instance;(check if database is up)
- select name from v$pdbs; (list available pluggable database names)
