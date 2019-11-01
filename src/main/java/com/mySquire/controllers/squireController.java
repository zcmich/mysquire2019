package com.mySquire.controllers;


import com.mySquire.model.QueryModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class squireController {

//    @RequestMapping("/home")
//    @ResponseBody
//    public String welcome() {
//        return "index";
//    }

    @RequestMapping("/")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index1");
        return modelAndView;
    }


    @GetMapping("/index")
    public String sparqlForm(Model model) {
        model.addAttribute("queryModel", new QueryModel());
        return "index";
    }


    @PostMapping("/submit")
    public String querySubmit(@ModelAttribute QueryModel queryModel) {
        return "result";
    }

}