import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld leaf =
                applicationContext.getBean(HelloWorld.class);

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);
        System.out.println(bean.getMessage());
        System.out.println("Сравниваем HelloWorld - " + bean.equals(leaf));
        System.out.println("Сравниваем Cat - " + one.equals(two));
    }
}