Feature: Sign in to ebay account

Scenario Outline: User trying to Login with login credentials

Given launch the chrome browser
And navigate to the url "https://signin.ebay.com.au"
When enter the credentials to sign in to ebay account username  <username> and password <password>
And click on the Sign in button
Then verify that the user is redirected to the Home page by searching "clothes" in the search bar
And close the browser


Examples:
|username				|password	|
|sajina2704@gmail.com	|Sachin*10	|
|sadftghh@gmail.com		|farfaf#12	|