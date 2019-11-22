package sofa2.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import sofa2.login.model.LoginResponse;
import sofa2.login.model.User;

@Controller
public class LoginController {
    @Autowired AceController ace;

    @GetMapping(value = "login")
    public String indexHandler(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }


    @PostMapping(value = "login")
    public String loginHandler(User user){
        String post = ace.postLogin(user);
        LoginResponse get = ace.getLogin(user);
        System.out.println(post);
        System.out.println(get.getStatus() + get.getMessage());
        return null;
    }
}


