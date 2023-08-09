
Feature: Login to app

  Scenario: Login to the app
    Given open url
    And I enter username as <Admin> and password as <admin123> into fields
    Then click submit
    And click on user and verify
    
