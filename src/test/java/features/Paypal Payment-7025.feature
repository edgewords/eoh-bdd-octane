#Auto generated Octane revision tag
@TID7025REV0.2.0
Feature: Paypal Processing

	Scenario: Checkout paypal
		Given That I have some items in my basket
		When I checkout
		Then I get the options to use Paypal
        
