# Jetty-JavaEE-Hello-link-parameters
#### Application accepting parameters in the link as name=... , id=... .
###### localhost:8080/?name=You&id=2
##### Where the first name must be given, and in the id field a number from the language list, "Hello Word !" is displayed by default without any parameters.

###### id=1  -> English
###### id=2  -> Polish
###### id=3  -> Germany

## Starting the application
#### To start the application, run the class Start.java in this path : src/main/java/bazyl603.App/Start.java
###### In the class, Jetty has been embedded in a servlet container, link do stackoverflow:
https://stackoverflow.com/questions/17246512/embedding-jetty-as-a-servlet-container
## In the application I used:
* Servlets  
* H2 DataBase  
* Jetty  
* Flyway  
* Hibernate
* JUnit
* Simple Logging Facade for Java (SLF4J)
* Maven



