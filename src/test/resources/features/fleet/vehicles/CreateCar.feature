
@CreateACar
Feature: Create a Car
  As user I want to be able to create a car

  Scenario: Create a regular car
    Given user logs in as a "sales manager"
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "All Cars" page name is displayed
    Then user clicks on the create a car button
    And user enters car information:
    |License Plate |Cybertek|
    |Driver        |Spartan |
    |Location      |Alaska  |
    |Model Year    |2019    |
    |Color         |Black   |
    |Power         |500     |
    |Vehicle Model |X5M     |
    |Vehicle Make  |BMW     |
    Then user clicks save and close
    And user verifies  that general information is displayed

# example with list of maps

@create_a_car_with_list_of_maps
  Scenario: Create a regular car (with list of maps)
    Given user logs in as a "sales manager"
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "All Cars" page name is displayed
    Then user clicks on the create a car button
    And user enters car information to create a car
      |License Plate  |Driver        | Location | Model Year | Color | Power | Vehicle Model | Vehicle Make |
      |Cybertek 1     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 2     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 3     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 4     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 5     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 6     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 7     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 8     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 9     |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 10    |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |
      |Cybertek 11    |Spartan       | Alaska   | 2019       | Black | 500   | X5M           | BMW          |



    Then user clicks save and close
    And user verifies  that general information is displayed

