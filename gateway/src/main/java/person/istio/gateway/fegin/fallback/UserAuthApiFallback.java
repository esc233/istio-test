package person.istio.gateway.fegin.fallback;

import org.springframework.stereotype.Component;
import person.istio.gateway.fegin.UserAuthApi;
@Component
public class UserAuthApiFallback implements UserAuthApi {
    @Override
    public String login(String username, String password) {
        return "连接异常";
    }
}
