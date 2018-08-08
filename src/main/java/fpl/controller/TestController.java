package fpl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class TestController {

    @RequestMapping(value = "/test", method = GET)
    @ResponseBody
    public String testeFaen() {
        return "HAAAAALLLOOO";
    }
}
