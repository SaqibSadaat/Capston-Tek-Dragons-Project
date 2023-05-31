Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on All section

  @AllSections # PASSED WITH NO ISSUE
  Scenario: Verify Shop by Department sidebar
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Department # PASSED WITH NO ISSUE
  Scenario Outline: Verify department sidebar options
    And User on 'department'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |
