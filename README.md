# Springboot Actuator Sample

This is sample project for actuator study. Actuator is used for monitoring springboot application using different endpoints.
Example: /info, /health, /metric, /trace, /bean (in latest version /actuator/**) etc.

## Endpoints Configuration
Endpoints can be configured from application.yml file as below.
```
endpoints.beans.id=springbeans
endpoints.beans.sensitive=false
endpoints.beans.enabled=true
```

## /health Customization
/health endpoint can be customized using HealthIndicator interface.

## /info Configuration
/info endpoint returns data from application.yml file.
If you put property like,
```
info.something: Test
```
Then /info endpoint will return the same in json format.

## Custom Endpoints
You can design your own endpoints using Endpoint interface.

## Changing Actuator Endpoint Address/Port
Actuator endpoint availability can be configured using below application.yml properties.
```
management.port: 9999
management.address: localhost
management.security.enabled: false
```

By default few endpoints are exposed. All can be exposed using below property.
```
management.endpoints.web.exposure.include=*

[More reading](https://www.baeldung.com/spring-boot-actuators)
