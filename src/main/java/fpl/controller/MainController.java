package fpl.controller;

import fpl.service.FplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MainController {

    @Autowired
    private FplService fplService;

    @RequestMapping(value = "/initialize", method = GET)
    public ResponseEntity initializeWebApp(){
        fplService.initialize();
        return new ResponseEntity(HttpStatus.OK);
    }
}
