package fpl.service;

import fpl.domain.player.Player;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@Service
public class PlayerService {

    List<Player> readPlayersFromFile() throws IOException {
        JSONObject bootstrap = new JSONObject(new String(Files.readAllBytes(Paths.get("target/classes/data/bootstrap-static.json"))));
        JSONArray elements = bootstrap.getJSONArray("elements");
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < elements.length(); i++) {
            JSONObject element = elements.getJSONObject(i);
            players.add(new Player(element));
        }
        return players;
    }

}
