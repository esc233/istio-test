package person.istio.gateway.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/gateway")
public class LocalApi {
    @GetMapping("/hello")
    public String helloGateway(){
        return "you get gateway";
    }
}
