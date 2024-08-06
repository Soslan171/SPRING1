import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // Вызов бина HelloWorld
        HelloWorld helloWorld1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean(HelloWorld.class);

        // Сравнение по ссылке
        System.out.println("HelloWorld beans are same: " + (helloWorld1 == helloWorld2)); // true

        // Вызов бина Cat дважды
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);

        // Сравнение по ссылке
        System.out.println("Cat beans are same: " + (cat1 == cat2)); // false
    }
}