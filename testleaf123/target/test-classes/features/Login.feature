Feature: login functionality of my application

Scenario Outline: login with postive credentials
Given launch the browser
When enter the username as <username>
And enter the password as <password>
And click the login button
Then homepage should displayed
But the home page should not displayed 

Examples:
|username|password|
|'gokul.sekar@testleaf.com'|'Leaf$123'|
|'gokul.sekar@testleaf.com'|'123'|



