package person.istio.user.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import person.istio.user.service.AuthService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthApi {
    private final AuthService authService;
    @PostMapping("login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password){
        if(authService.login(username,password)){
            return "欢迎"+username;
        }else {
            return "拒绝登录";
        }
    }
}
