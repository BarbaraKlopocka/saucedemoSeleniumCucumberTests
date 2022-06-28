Feature: Login

#  Scenario Outline: Valid user can sign in
#    Given Go to the home page
#    And User login with username "<username>" and password as "<password>"
#    Then The user should login successfully and is on the inventory page
#    Examples:
#      |username       |password     |
#      |standard_user  |secret_sauce |

#  Scenario Outline: Invalid user can sign in
#    Given Go to the home page
#    And User login with username "<username>" and password as "<password>"
#    Then The user should login unsuccessfully and is not on the inventory page
#    Examples:
#      |username       |password     |
#      |incorrect_username  |incorrect_password |

#  Scenario: Valid User signs in and logs out
#    Given Go to the home page
#    And User login with username "standard_user" and password as "secret_sauce"
#    When The user should login successfully and is on the inventory page
#    And Go to the menu and click logout button
#    Then The user is on home page

  @ignore
  Scenario: Menu contains 4 references
    Given Go to the home page
    And User login with username "standard_user" and password as "secret_sauce"
    And The user should login successfully and is on the inventory page
    When Go to the menu
    Then Menu should contain 4 references