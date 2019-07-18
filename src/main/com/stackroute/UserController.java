package com.stackroute;



import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController
{
    @RequestMapping("/")
    public String greet(Model model){
        User user = new User();
        model.addAttribute("name",user.display());

        return "index";
    }

}