package com.luv2code.springdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class FormController
{
    @RequestMapping("/showForm")
    public String showform()
    {
        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "form-out";
    }

    @RequestMapping("/processFormTwo")
    public String processFormTwo(HttpServletRequest request , Model model)
    {
        String string = request.getParameter("userName");
        string = string.toUpperCase();
        model.addAttribute("message" , string);
        return "form-out";
    }

    @RequestMapping("/processFormThree")
    public String processFormThree(@RequestParam("userName")  String string , Model model)
    {
        string = string.toUpperCase();
        model.addAttribute("message" , string);
        return "form-out";
    }
}
