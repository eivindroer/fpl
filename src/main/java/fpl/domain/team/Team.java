package fpl.domain.team;

import fpl.domain.player.Player;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String name;
    private String shortName;
    private int strength;
    private List<Player> players = new ArrayList<>();

    public Team(JSONObject teamJSON, List<Player> players) {
        this.id = teamJSON.getInt("id");
        this.name = teamJSON.getString("name");
        this.shortName = teamJSON.getString("short_name");
        this.strength = teamJSON.getInt("strength");
        setPlayers(players);
    }

    private void setPlayers(List<Player> players) {
        for (Player player : players) {
            if (player.belongsToTeam(this)) {
                this.players.add(player);
            }
        }
    }

    public int getId() {
        return id;
    }

    public JSONObject teamToJSON() {
        JSONObject obj = new JSONObject();
        obj.put("name", name);
        return obj;
    }
}
