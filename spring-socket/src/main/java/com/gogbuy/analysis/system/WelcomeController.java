package com.gogbuy.analysis.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Mr.Yangxiufeng on 2016/5/26.
 */
@Controller
public class WelcomeController {
    @RequestMapping(value = "/pad", method = RequestMethod.GET)
    public ModelAndView Hello(ModelAndView modelAndView) {
        modelAndView.setViewName("/index");
        return modelAndView;
    }
}
