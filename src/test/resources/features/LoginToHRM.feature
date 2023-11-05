Feature: Login Functionality

 Scenario: Valid Login
 

 When I enter a valid username
 And I enter a valid password
 And I click on the login button
 Then I validate that I am logged in

 
     @homeworkOutline
     Scenario Outline: Login using Scenario Outline and Example Table
        When user enters login info "<username>" and "<password>"
        And I click on login button
        Then Welcome "<firstname>" message is displayed

        Examples: 
    | username    | password    | firstname |
    | brody        | haloMrb123	| Brody     |
    | dwightschrute| Neotech@2023	| Dwight    |
    | alice        | haloMrb123  | Alice     |
    | Adella       | haloMrb123  | Adella    |
    
    
     @homeworkDataTable
        Scenario: Login using Datatable
        When user enters username and password and clicks on login
            | username | password | firstname |
            | hellobro | asdas123 | Dzeko     |
            | Obrakad  | ballislife | Zeljko  |
            | Bogie    | moneyman  | Bogdan   |
            | haciIso  | fener     | Ismail   | 
        Then Welcome "<firstname>" message is displayed