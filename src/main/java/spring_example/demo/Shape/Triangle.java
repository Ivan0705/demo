package spring_example.demo.Shape;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Triangle implements Shape {
    @Override
    public String getName() {
        return "triangle";
    }
}
