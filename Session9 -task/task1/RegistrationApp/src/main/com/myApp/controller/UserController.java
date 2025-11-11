package main.com.myApp.controller;

import main.com.myApp.dao.UserDao;
import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;


@Controller
public class UserController {
    @Autowired
    private UserDao userDao;


    @RequestMapping("/")
    public String showAgeForm(Model model) {
        model.addAttribute("UserModel", new UserModel());
        return "userForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("UserModel") UserModel user,
                              BindingResult bindingResult,
                              Model model) throws SQLException {

        //check errors
        if (bindingResult.hasErrors()) {
            return "userForm";
        }

        //Save into the database
        userDao.saveUser(user);


        // pass the data to the results page
        model.addAttribute("UserModel", user);

        return "result";
    }

}