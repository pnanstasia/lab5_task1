package ua.edu.ucu.lab.flowers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/flower/")
public class FlowerController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/flower")
    public List<Flower> getFlower() {
        return List.of(new Flower(0, FlowerColor.BLUE, 
		0, FlowerType.ROSE));
    }
}
