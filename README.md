<h1 align="center">

   :sun_behind_rain_cloud: API - MetaWeather 
</h1>

## Project status: 

:construction: The project isn't ready yet. At this inicial point the objective is to perform a request and receive a response.
## About:

:scroll: The main goal is to perform a simulation of REST concepts consuming the MetaWeather external API: 

https://www.metaweather.com/api/ .

The present application is able to process a request from client using a city name as a parameter and return it's weather info in Celsius and Fahrenheitin.

## Technologies and tools:
:computer: To build this project the following technologies were necessary:
- Java as programming language;
- Spring Boot as framework;
- Postman as tool to perform web requests;
- REST architectural style;
- Maven to manage project dependencies;

## How it works:

:pencil2: The application functionalities and specifications can be described as follows:

1. The application receives client's request containing city's name as a parameter: 

   "http://localhost:8080/{cityName}" 

2. It calls MetaWeather API sending city's name and receiving a related code, aka WOEID:

   url: "https://www.metaweather.com/api/location"
   @RequestMapping("/search/?query={cityName}")
   
3. A seconde call is made to MetaWeather API using WOEID as a parameter in order to get weather info regarding to the specified city:
   
   url: "https://www.metaweather.com/api/location"
   @RequestMapping("/{woeid}")
   
4. The application receives city weather info in Celsius format, mantain it in a variable but also convert it to Fahrenheit and store it in another variable.

5. The client response is the searched city weather info as maximum and minimum temperature in Celsius and Fahrenheit format.        
 
            
## Functional Test:

:mag_right: To do so please follow the described steps bellow:

1. Run the app in class "WeatherApplication.java".
2. In order to perfor the request insert the url in Postman specified fied:"http://localhost:8080/{cityName}"
3. The methode shall be "GET".

The expected response is the specified city weather info:

   - Maximum temperature in Celsius;
   - Maximum temperature in Fahrenheit;
   - Minimum temperature in Celsius;
   - Minimum temperature in Fahrenheit;
