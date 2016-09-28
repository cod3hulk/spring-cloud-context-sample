# Spring Cloud Context Refresh Configuration Sample
Sample project to show basic setup of Spring Cloud Context to refresh Bean configuration values.

# Usage
* Run the application by 'mvn spring-boot:run'. 
* Adjust application.properties in the target folder. 
* Call 'localhost:8080/refresh' to trigger reload of the adjusted properties. 

# Resources

## GreetingController
Spring Bean which uses reloadable Spring Configuration Properties (MyConfig Bean).

## MessageController
Spring Bean which itself is reloadable and has a refreshable Value Property

## StaticController
Spring Bean serving static contant, to show that Beans without RefreshScope annotation stay untouched from the reload process

## RefreshController
Spring Bean serving the route for triggering the refresh of RefreshScope annotated Beans
