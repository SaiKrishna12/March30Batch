Feature: Login and logout functionality of OrangeHRM

Scenario: Verify the login functionality
	Given the browser is launched and we navigate to orangehrm
	When we enter the username and password
	And click on the login button
	Then it should display welcome admin msg
	
Scenario: Verify logout functionality
	When we click on welcome admin
	And also click on logout link
	Then it should navigate to home page
	