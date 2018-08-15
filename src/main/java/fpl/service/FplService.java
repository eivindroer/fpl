package fpl.service;

import fpl.domain.player.Player;
import fpl.domain.team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FplService {
    private List<Player> players;
    private List<Team> teams;

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    public void initialize() {
        try {
            this.players = playerService.readPlayersFromFile();
            this.teams = teamService.readTeamsFromFile(players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

}
