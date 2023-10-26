package ua.edu.ucu.lab7_4.deliverly;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/delivery")
public class DeliveryController {
    @GetMapping("/")
    public String getDelively() {
        return "Delivery";
    }
}
