package spring_example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring_example.demo.Color.Black;
import spring_example.demo.Color.White;
import spring_example.demo.Music.Music;
import spring_example.demo.Shape.Shape;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private final
    Music music1;

    private final
    Music music2;

    private final
    Shape shape1;

    private final
    Shape shape2;

    private final
    ApplicationContext context;

    @Autowired
    public DemoApplication(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2, Shape shape1, Shape shape2, ApplicationContext context) {
        this.music1 = music1;
        this.music2 = music2;
        this.shape1 = shape1;
        this.shape2 = shape2;
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... args) {
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());

        System.out.println(shape1.getName());
        System.out.println(shape2.getName());

        White white1 = context.getBean("white", White.class);
        White white2 = context.getBean("white", White.class);
        white1.setNumber(8);
        System.out.println(white1.getNumber() == white2.getNumber());//@Scope("singleton"), будет true, т.к. один тот же бин

        Black black1 = new Black();
        Black black2 = new Black();
        black1.setNumber(6);
        System.out.println(black1.getNumber() == black2.getNumber());//@Scope("prototype"), будет false, т.к. создается много разных экземпляров бина
    }
}
