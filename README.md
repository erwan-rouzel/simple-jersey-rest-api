Simple REST Server
==================

Very simple RESTful server example which is standalone and does not need a servlet container, using Jersey & Maven.

Documentation
-------------

To run the server, just run the main method of SimpleServer class, then the server is available at :
http://localhost:7777/

You can also get the WADL definition of the Web Service here :
http://localhost:5555/application.wadl

Test
----

Get example :
```
$ curl http://localhost:7777/api/testget
{"firstName":"John","lastName":"Smith"}
```

Post example :
```
$ curl -H "Content-Type: application/json" -X POST -d '{"firstName":"Mark","lastName":"Spencer"}' http://localhost:7777/api/testpost/123
POST:Jersey say : 123
```