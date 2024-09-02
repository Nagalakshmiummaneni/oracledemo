#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature:  home page of oracle cloud application page
  @tag1
 # Scenario: testing home page to go  navigate page
 #  And open oracle sign in page
  #  When enter username and password
  #  And click on sign in button
  #  And able to see home page 
  #  Then click on navigate page
  #  And able to see navigation menu
  #  And close navigation menu

   @tag2
  Scenario : testing home page to go  home page
     Given  open any browser
    And open oracle sign in page
    When enter username and password
    And click on sign in button
    And able to see home page 
    Then click on home icon
    And able to see home screen
  
    