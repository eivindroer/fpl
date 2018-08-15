package fpl.controller;

import fpl.domain.player.Player;
import fpl.service.FplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PlayerController {

    @Autowired
    private FplService fplService;

    @RequestMapping(value = "/getAllPlayers", method = GET)
    @ResponseBody
    public ResponseEntity getAllPlayers() {
        return new ResponseEntity<>(Player.playerListToJSON(fplService.getPlayers()).toString(), HttpStatus.OK);
    }
}
