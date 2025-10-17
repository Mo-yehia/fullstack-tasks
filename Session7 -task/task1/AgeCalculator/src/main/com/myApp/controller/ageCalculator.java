package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;


@Controller
public class ageCalculator {

    @RequestMapping("/")
    public String showAgeForm() {
        return "ageForm";
    }

    @RequestMapping("/calculateAge")
    public String calculateAge(HttpServletRequest request , Model model) {

        String userDay = request.getParameter("day");
        String userMonth = request.getParameter("month");
        String userYear = request.getParameter("year");

        int day = Integer.parseInt(userDay);
        int month = Integer.parseInt(userMonth);
        int year = Integer.parseInt(userYear);

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birthDate, today);

        model.addAttribute("years",period.getYears());
        model.addAttribute("months",period.getMonths());
        model.addAttribute("days",period.getDays());

        return "result";
    }



}
