Feature: Test cases for automation exercise page

Background:
#Given Launch browser and load URL

@karthik
Scenario: verify the test case page
When Verify that the home page is visible successfully
And Click on 'Test Cases' button
Then Verify user is navigated to test cases page successfully

@pavi
Scenario: Verify All Products and product detail page
When Verify that home page is visible successfully
And Click on 'Products' button
And Verify user is navigated to ALL PRODUCTS page successfully
And  The products list is visible
And Click on 'View Product' of first product
And User is landed to product detail page
Then Verify that detail detail is visible: product name, category, price, availability, condition, brand



