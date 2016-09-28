# Spring Cloud Context Refresh Configuration Sample
Sample project to show basic setup of Spring Cloud Context to refresh Bean configuration values.

# Resources

## GreetingController
Spring Bean which uses reloadable Spring Configuration Properties (MyConfig Bean).

## MessageController
Spring Bean which itself is reloadable and has a refreshable Value Property

## StaticController
Spring Bean serving static contant, to show that Beans without RefreshScope annotation stay untouched from the reload process

## RefreshController
Spring Bean serving the route for triggering the refresh of RefreshScope annotated Beans
