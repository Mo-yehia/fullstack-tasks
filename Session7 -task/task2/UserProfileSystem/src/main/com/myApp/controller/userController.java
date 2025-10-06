package main.com.myApp.controller;

import main.com.myApp.dao.UserDao;
import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


@Controller
public class userController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String showAgeForm() {
        return "userForm";
    }

    @RequestMapping("/saveData")
    public String saveData(HttpServletRequest request , Model model) throws SQLException {

        UserModel user = new UserModel();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setEmail(request.getParameter("email"));

        // Convert text from the form to LocalDate
        String dobString = request.getParameter("dob");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(dobString, formatter);
        user.setDateOfBirth(dob);

        user.setCity(request.getParameter("city"));

       //Save into the database
        userDao.saveUser(user);

        // pass the data to the results page
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("dob", user.getDateOfBirth());
        model.addAttribute("city", user.getCity());

        return "result";
    }

}
