package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reminder")
public class ReminderController {
    @GetMapping("/get")
    @ResponseBody
    public String getReminder(ModelMap model){
        return "May reminder";
    }
}
