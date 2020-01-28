Feature: Login Functionality

@data-driven
Scenario: Login with valid credential 
Given Navigate to home page 
When user enter username and passwsord 
Then user logged in succesfully	


@data-driven
Scenario: the one where user picks different product through search functionality
When larry searches below products in search box:
	|Headphone|
	|Travel|
	|Laptop|
Then product should be added in the cart if available





@user-specific
Scenario Outline: test login
Given Navigate to home page 
When user enter "<uname>" and "<pwd>"
Then user logged in succesfully	

Examples:
|uname|pwd|
|lalitha|Password123|
|ABC|XYZ|

