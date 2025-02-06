package org.jointheleague.SpecificWeather.Specific.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
@GetMapping("/hello")
public String sayHello(){
    return "Hello, Alex!";
}

}
