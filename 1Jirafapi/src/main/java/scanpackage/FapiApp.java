package scanpackage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FapiApp {

    public static void main(String[] args) {
        SpringApplication.run(FapiApp.class, args);
    }
}
//main() метод передает управление вспомогательному классу
// SpringApplication, где Application.class - аргумент его run()
// метода. Это сообщает Spring о чтении метаданных
// аннотации из Application и управлении ею как компонента в Spring application context.
