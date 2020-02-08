# Microservice-demo


This project consists of two services namely client and greetings

Here client application is using ribbon to communicate with our microservice greetings which can be hosted on several servers/ports.

------------Eureka Configuration----------------

EnableEurekaServer annotation creates the registry with which other application can communicate.

It is required to add dependency spring-cloud-starter-netflix-eureka-server in pom.xml for eureka server.

By Default eureka server runs on port 8761, where you can see instances which are currently registred with eureka.

To register our microservices with eureka, EnableDiscoveryClient or EnableEurekaClient annotations are used in services.

-----------Ribbon Configuartion----------------------

Ribbon is congigured in client application ie the application which sends http requests to other microservices

In our case client will send HTTP get request using restTemplate to greetings api which will return string object.

It is required to add dependency spring-cloud-starter-netflix-ribbon in pom.xml for ribbon client.

LoadBalanced annotation tells Spring Cloud that we want to take advantage of its load balancing support

Ribbon Client annotation enables the ribbon and take name and configuration class name as parameter.

-----------Client------------

Run the client application, it will run on port 8889.

-----------Greetings-----------

Run this service on multiple ports using command SERVER_PORT=XXXX mvn spring-boot:run

--------------------------------

Hit url localhost:8889/hi or localhost:8889/hi?name=yourname
