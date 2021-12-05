package spring_example.demo.Color;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("singleton")
public class White implements Color {
    @Value("${white.color}")
    private String name;

    private int number;

    public White() {
    }

    @Override
    public String toString() {
        return "White{" +
                "name=" + name +
                ", number=" + number +
                '}';
    }

    @Override
    public String getColor() {
        return "white";
    }
}
