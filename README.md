# basic-auth-spring-security
A sample spring-boot project which does a basic authentication using spring-security.

* The project contains a single endpoint which returns a String "Hello, You are authorized to access the endpoint." .
* The project contains 2 roles USER & ADMIN.

* For USER role (username: user , pwd: password) when the EP is accessed it returns <b>Forbidden</b> error.

* For ADMIN role (username: admin , pwd: password) when the EP is accessed it returns String <b>"Hello, You are authorized to access the endpoint".</b>

* For any other users , it will return <b>Unauthorized</b> error. 

NOTE: Endpoint is http://localhost:8080/hello



