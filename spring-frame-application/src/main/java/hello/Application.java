package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bo.zhou
 * @date 2018/4/1
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService(){
        return new MessageService() {
            @Override
            public String getMessage() {
                return "hello world";
            }
        };
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
