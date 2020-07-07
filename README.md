# basic-auth-spring-security
A sample spring-boot project which does a basic authentication using spring-security.

* The project contains a single endpoint which returns a String "Hello" .
* The project contains 2 roles USER & ADMIN.

* For USER role (username: user , pwd: password) when the EP is accessed it returns Forbidden error.

* For ADMIN role (username: admin , pwd: password) when the EP is accessed it returns String "Hello".

NOTE: Endpoint is http://localhost:8080/hello



