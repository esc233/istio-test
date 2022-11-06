package person.istio.user.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import person.istio.user.service.AuthService;
@Service
public class AuthServiceImpl implements AuthService {
    @Value("${user.password}")
    private String password;
    @Value("${user.username}")
    private String username;
    @Override
    public boolean login(String name, String pw) {
        if(name.equals(username)&&pw.equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
