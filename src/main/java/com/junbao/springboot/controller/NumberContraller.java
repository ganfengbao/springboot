package com.junbao.springboot.controller;

import com.junbao.springboot.pojo.Number;
import com.junbao.springboot.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class NumberContraller {
    @Autowired
    private NumberService numberService;

    @RequestMapping("/getall")
    public String toNumberPage(Model model) {
        List<Number> numberList = numberService.getAll();
        model.addAttribute("users", numberList);
        return "user/test";
    }

    @RequestMapping("/search")
    public String toSerachPage() {
        return "user/index";
    }


    @RequestMapping(value = "/getall/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Number getAllById(@PathVariable Integer id) {
        Number number = numberService.getAllById(id);
//        model.addAttribute(number)
//        Map numberMap = new HashMap();
//        numberMap.put(number);
        return number;
    }

//    @RequestMapping(value = "/setNumber/{number}/{preNumber}", method = RequestMethod.GET)
//    @ResponseBody
//    public int setNumber(@PathVariable String number, @PathVariable String preNumber) {
//        Number number1 = new Number(number, preNumber);
//        int i = numberService.insertNumber(number1);
//        return i;
//    }

    @RequestMapping(value = "/setNumber", method = RequestMethod.GET)
    @ResponseBody
    public int setNumber(@RequestParam("number") String number, @RequestParam("preNumber") String preNumber) {
        Number number1 = new Number(number, preNumber);
        int i = numberService.insertNumber(number1);
        return i;
    }
}
