package main.com.myApp.controller;

import main.com.myApp.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class UserController {

    @RequestMapping("/")
    public String showAgeForm(Model model) {
        model.addAttribute("UserModel" , new UserModel());
        return "userForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("UserModel") UserModel userModel, Model model) {

        model.addAttribute("UserModel", userModel);

        return "result";
    }



}
