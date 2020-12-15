@Test
Feature: Test Post
Scenario: Test Register

Given a URL passing in the body a JSON with the attributes email and password,
When is through the POST method
Then the expected result is that the return status is equal to 200 
And that the token attribute sent in the return contains token “QpwL5tke4Pnpja7X4”.
