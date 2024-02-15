package org.adaschool.REST.Raylway.app.appController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class nameRaylwayController {
    @GetMapping("/name")
    public String getName() {
        return "<h1>Andrey Orlando Caro</h1>";
    }
}
