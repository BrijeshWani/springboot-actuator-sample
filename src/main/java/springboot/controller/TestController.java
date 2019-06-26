package springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public @ResponseBody ResponseEntity<Map<String, String>> test() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("actuator", "spring-boot-starter-actuator");
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
