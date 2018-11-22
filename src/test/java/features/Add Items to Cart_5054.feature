#Auto generated Octane revision tag
@TID5054REV0.5.1
Feature: Add Items to Cart

	Scenario: Add a Cap
		Given That I am on the Home Page
		When I search for a Cap and add it to the Cart
		Then I can see it in the Cart
