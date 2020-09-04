Feature:  Buy a pizza
  I as user
  Want buy a pizza from Papa Johns

  Scenario: Buy a standar pizza
    When The user buy a carnes pizza from Favoritas section
    And select a Mediana pizza with Masa tradicional
    Then The user should see the product in the cart list

  Scenario: Buy a standar pizza with extra ingredients
    When The user buy a carnes pizza from Favoritas section
    And select a Familiar pizza, extra Pollo, Piña with Masa delgada
    Then The user should see the product in the cart list

  @Manual:passed
  Scenario: Modify ingredients from pizza
    When The user buy a carnes pizza from Favoritas section
    And select a Familiar pizza with Masa tradicional
    And remove Pollo, Champiñones from it
    Then The user should see the product in the cart list

  @Manual:passed
  Scenario: add cheese edge to pizza
    When The user buy a carnes pizza from Favoritas section
    And select a Familiar pizza with Masa tradicional
    And add cheese edge
    Then The user should see the product in the cart list

  @Manual:passed
  Scenario: Remove pizza from the cart
    When The user buy a carnes pizza from Favoritas section
    And select a Familiar pizza with Masa tradicional
    And remove the pizza added
    Then The user should see an empty cart

