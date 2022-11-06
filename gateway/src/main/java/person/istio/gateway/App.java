package person.istio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= SpringApplication.run(App.class, args);
    }
}
