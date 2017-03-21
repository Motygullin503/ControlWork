package controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by UseR7 on 21.03.2017.
 */
public class OrdersController {

    @RequestMapping("/index")
    public String orderGet(ModelMap map) {


        return "index";
    }

    @RequestMapping("/orders")
    public String listGet(ModelMap map) {


        return "orders";
    }


    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String calcPost(@RequestParam String num1, @RequestParam String op, @RequestParam String num2, ModelMap map) {



        return "index";
    }
}

