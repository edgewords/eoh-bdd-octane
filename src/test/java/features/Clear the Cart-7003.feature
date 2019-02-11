#Auto generated Octane revision tag
@TID7003REV0.2.0
Feature: Clear shopping cart
	Scenario: Clear Cart
		Given as a customer
		When I clear my cart
		Then Nothing is left in the cart
