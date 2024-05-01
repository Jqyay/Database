Things need to be downloaded
  -	mysql installer https://dev.mysql.com/downloads/installer/
      o	choose mysql-installer-web-community-8.0.37.0.msi
   	  o	No thanks just start my download 
  -	mysql connector jar file https://dev.mysql.com/downloads/connector/j/
      o	operating system: platform independent 
      o	choose mysql-connector-j-8.4.0.zip
   	  o	No thanks just start my download 

mysql installer
  -	during the installation process(configuration part), u r required to create ur own username and password 
  -	just create ur own and make sure u rmb it cuz v will use it later for database 

mysql workbench 
  -	go to disk c(if u din modify the location of the installer to install mysql)  and open the exe, file of MySQL Workbench 
  -	at the home page 
  -	create a connection 
  -	insert username and password using the one u inserted during the time u install mysql installer 
  -	hostname localhost, port 3306
  -	need to create a schema named minecraft 

TO gain connection to mysql to netbeans/vs code
  in netbeans 
    -	go to Libraries columns of ur project 
    -	right click on it 
    -	choose Add JAR/Folder
    -	go to desktop n search where ur mysql connector jar file is saved 
    -	extract the zip file 
    -	back to netbeans, choose the mysql-connector-j-8.?.? jar file(not the whole file)
  
  in vs code 
    - create a no-archetype project
    - press app file under the src section
    - java project de panel will appear 
    - go to the reference library to add the mysql connector jar file
    another way for setting up the environment of the database is to use extension and set the password and username in where i forgot le hhh 
    https://www.youtube.com/watch?v=wzdCpJY6Y4c
