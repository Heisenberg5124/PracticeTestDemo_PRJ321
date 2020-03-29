# PracticeTestDemo_PRJ321
Develop destop GUI application with following components and requirements

1. Create database name PRJ321_YourID on MS SQL Server, have 1 table with at least 2 rows sample data

2. Create desktop application in NetBean:
a. Define Java Bean class link to table Magazine, add 2 following function:
+ method getAll() return all Magazine in database
+ method newMagazine() will insert new magazine into table Magazine
b. Develop GUI for application, provide following tasks when user select on menu
+ View all magazine
+ Make new magazine : Input data should be validated before submit: Maz ID must begin by letter M, follow 3 digit characters

3. Develop additional class and component in new package name rmi to allow this application offer remote service for listing all magazine:
+ remote interface
+ implementation class
+ server app
+ client app is a text mode application.
4. Define a thread that count down an int variable from 100 to 0 (that’s decrease 1 every second). When n equals 0, a dialog appear ask user for continue/stop program? If continue then re-set n=100, otherwise stop the program.
