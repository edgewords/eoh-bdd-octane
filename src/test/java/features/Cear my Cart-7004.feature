#Auto generated Octane revision tag
@TID7004REV0.2.0
Feature: Cart Handling

	Scenario: Clear my Cart
		Given That I have an item in the shopping cart
		When I clear my Cart
		Then No items are left in the Cart
