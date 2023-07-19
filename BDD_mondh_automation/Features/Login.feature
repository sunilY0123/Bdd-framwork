
Feature: login  feature

  
  Scenario: verify login page
    Given launch browser
    And open url "http://localhost:8888"
    When enter username "admin" and password "admin"
    And click on login 
   Then title should be "My Home Page"


