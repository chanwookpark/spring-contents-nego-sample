package com.github.chanwookpark;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chanwook
 */
@Controller
public class EndpointController {

    @RequestMapping("/view.hx")
    public String view(ModelMap model) {
        model.put("greeting", new Greeting("HaHa"));
        return "view";
    }
}
