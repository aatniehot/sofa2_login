package sofa2.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import sofa2.login.Model.User;

@Controller
public class LoginController {
    @Autowired AceController ace;


    @PostMapping(value = "login")
    public String loginHandler(User user){
        String response = ace.getLogin(user);
        System.out.println(response);
        return null;
    }
}


