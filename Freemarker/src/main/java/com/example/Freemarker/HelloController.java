package com.example.Freemarker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    /**
     * Handles HTTP GET requests to the "/hello" endpoint.
     * This method adds a message to the Model and returns the name of the FreeMarker template.
     * @param model The Model object used to pass data to the view.
     * @return The name of the FreeMarker template file (without the extension).
     */
    @GetMapping("/hello")
    public String hello(Model model) {
        // Add an attribute named "message" to the model with a value.
        // This "message" can be accessed in the FreeMarker template.
        model.addAttribute("message", "Hello from Spring Boot and FreeMarker!");
        
        // Return the name of the template. Spring Boot's FreeMarker auto-configuration
        // will look for a file named "hello.ftlh" in the configured template path.
        return "hello";
    }
}