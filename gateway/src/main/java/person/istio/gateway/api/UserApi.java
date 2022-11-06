package person.istio.gateway.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import person.istio.gateway.fegin.UserAuthApi;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserApi {
    private final UserAuthApi userAuthApi;

    @PostMapping("/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password){
        return userAuthApi.login(username,password);
    }
}
