package spring_example.demo.Shape;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
    @Override
    public String getName() {
        return "rectangle";
    }
}
