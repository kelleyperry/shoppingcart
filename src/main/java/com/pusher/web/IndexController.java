package com.pusher.web;

import com.pusher.constants.GeneralConstants;
import com.pusher.constants.PusherConstants;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;



@Controller
@SessionAttributes(GeneralConstants.ID_SESSION_SHOPPING_CART)
public class IndexController {

    @RequestMapping(method=RequestMethod.GET, value="/")
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");
        modelAndView.addObject("pusher_app_if", PusherConstants.PUSHER_APP_ID);
        modelAndView.addObject("pusher_key", PusherConstants.PUSHER_KEY);
        modelAndView.addObject("pusher_secret", PusherConstants.PUSHER_SECRET);

        if (!model.containsAttribute(GeneralConstants.ID_SESSION_SHOPPING_CART)) {
            model.addAttribute(GeneralConstants.ID_SESSION_SHOPPING_CART);
        }

        return modelAndView;
    }
}