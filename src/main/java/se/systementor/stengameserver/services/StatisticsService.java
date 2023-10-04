package se.systementor.stengameserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.systementor.stengameserver.models.Game;
import se.systementor.stengameserver.repositories.GameRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class StatisticsService {

    @Autowired
    GameRepository rep;
    private static ArrayList<Game> games = new ArrayList<Game>();

    public void save(String winner, String yourSelection, String mySelection) {
        var game = new Game();
        game.setCreated(LocalDateTime.now());
        game.setMySelection(mySelection);
        game.setYourSelection(yourSelection);
        game.setWinner(winner);
        //game.setId(games.size()+1);
        rep.save(game);
        //games.add(game);

    }
}
