package spring_example.demo.Color;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class Black implements Color {
    @Value("black")
    private String name;

    @Value("12")
    private int number;

    @Override
    public String toString() {
        return "Black{" +
                "name=" + name +
                ", number=" + number +
                '}';
    }

    @Override
    public String getColor() {
        return "black";
    }
}
