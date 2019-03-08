Feature: Registration functionality scenarios
@Register @one
Scenario: Verify user is able to registration by providing user login details
Given I will login application
And  I will navigate to Registration page
When   I will give login details
  |First name |Ravi                |
  |Last name  |kiran               |
|Email      |ravi.kiran@gmail.com|
  |phone      |9898989801          |
  |password   |rkiran              |  
  And I will select primary policy
  And I click on continue button
  Then I should see that the user account has successfully created
  
  
  

