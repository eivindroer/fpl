package fpl.service;

import fpl.domain.player.Player;
import fpl.domain.team.Team;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    List<Team> readTeamsFromFile(List<Player> players) throws IOException {
        JSONObject bootstrap = new JSONObject(new String(Files.readAllBytes(Paths.get("target/classes/data/bootstrap-static.json"))));
        JSONArray teamsJSON = bootstrap.getJSONArray("teams");
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < teamsJSON.length(); i++) {
            JSONObject teamJSON = teamsJSON.getJSONObject(i);
            teams.add(new Team(teamJSON, players));
        }
        return teams;
    }
}
