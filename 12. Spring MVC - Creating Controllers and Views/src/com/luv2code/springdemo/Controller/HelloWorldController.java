package com.luv2code.springdemo.Controller;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloWorldController
{
    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }

    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }


    @RequestMapping("/processFormTwo")
    public String processFormTwo(HttpServletRequest request, Model model)
    {
        String string = request.getParameter("studentName");
        string = string.toUpperCase();
        model.addAttribute("message" , string);
        return "helloworld";
    }
}
