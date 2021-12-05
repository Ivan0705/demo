package spring_example.demo.Music;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical music";
    }
}
