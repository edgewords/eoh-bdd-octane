#Auto generated Octane revision tag
@TID6069REV0.2.0
Feature: Shopping Cart

	Scenario: Clear Cart
		Given There are items inthe shopping cart
		When I clear the cart
		Then the cart should be empty
