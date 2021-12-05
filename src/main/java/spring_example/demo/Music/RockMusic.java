package spring_example.demo.Music;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }
}
