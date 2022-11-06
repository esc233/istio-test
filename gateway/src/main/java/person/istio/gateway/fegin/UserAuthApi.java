package person.istio.gateway.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import person.istio.gateway.fegin.fallback.UserAuthApiFallback;

@FeignClient(name = "user",url = "${route.user.url}",fallback = UserAuthApiFallback.class)
public interface UserAuthApi {
    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    String login(@RequestParam("username") String username, @RequestParam("password") String password);
}
