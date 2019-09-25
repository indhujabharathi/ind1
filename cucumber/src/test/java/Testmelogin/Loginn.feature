Feature: Testme App user Login
 Login Credentials
 
 Scenario Outline: Login Functionality
 Given Enter the url "http://10.232.237.143:443/TestMeApp/login.htm"
 When user enter "<username>" as username
 When user enter "<password>" as password
 Then user Logins to Testmeapp
 
 Examples:
 |username|password|
 |Lalitha |password123|
 |Indhuja|indhu123|