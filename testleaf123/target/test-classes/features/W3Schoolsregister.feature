Feature: register in W3 schools

Scenario Outline: Enter the user details in W3 schools
Given launch the browser
When enter the fullname <firstname>
And enter the email <email>
And enter the address <address>
And enter the State <State>
And enter the Zip <zip>
And enter the exp year <year>
And enter the month <month>
And enter the name on card <name>
Then close the browser

Examples:
|firstname|email|address|State|zip|year|month|name|
|'karthik'|'karthik.com'|'velachery'|'TN'|'42'|'2024'|'04'|'PAVI'|
|'karthik'|'karthik.com'|'velachery'|'TN'|'42'|'2024'|'04'|'PAVI'|