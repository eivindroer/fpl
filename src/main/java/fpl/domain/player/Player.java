package fpl.domain.player;

import fpl.domain.team.Fixture;
import fpl.domain.team.Team;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int id;
    private int code;
    private String firstName;
    private String secondName;
    private double cost;
    private Team team;
    private List<Fixture> fixtures;
    private int teamId;

    public Player(JSONObject jsonPlayer) {
        this.id = jsonPlayer.getInt("id");
        this.code = jsonPlayer.getInt("code");
        this.firstName = jsonPlayer.getString("first_name");
        this.secondName = jsonPlayer.getString("second_name");
        this.cost = jsonPlayer.getDouble("now_cost")/10.0;
        this.teamId = jsonPlayer.getInt("team");
        this.fixtures = new ArrayList<>();
    }

    public static JSONArray playerListToJSON(List<Player> players) {
        JSONArray arr = new JSONArray();
        for (Player player : players) {
            JSONObject obj = new JSONObject();
            obj.put("id", player.id);
            obj.put("code", player.code);
            obj.put("firstName", player.firstName);
            obj.put("secondName", player.secondName);
            obj.put("cost", player.cost);
            obj.put("team", player.team.teamToJSON());
            arr.put(obj);
        }
        return arr;
    }

    public boolean belongsToTeam(Team team) {
        if (team.getId() == teamId) {
            this.team = team;
        }
        return team.getId() == teamId;
    }
}
