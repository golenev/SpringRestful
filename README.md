DemoApplicationTests.java --- application entry point


Web server port after startup --- http://localhost:8080/


GET Request http://localhost:8080/products --- returns two objects with fields "regionId", "composition", "id", "shortDescription", "isActive"


GET Request http://localhost:8080/products/2 or /3 --- returns only the required object with the same fields


POST Request http://localhost:8080/products with filled BODY fields "regionId", "composition", "id", "shortDescription", "isActive" --- returns new Object
