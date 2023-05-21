package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.Repository.GameReprository;
import com.codline.TaskBatch2.Repository.PlayerRepository;
import com.codline.TaskBatch2.ResponseObject.GetGameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    GameReprository gameReprository;

    public List<Game> getGame() {
        return gameReprository.findAll();
    }

    public void saveGame(Game game) {
        gameReprository.save(game);
    }

    public GetGameResponse getSPortByName(Long sportId) {
        Optional<Game> optionalGame = gameReprository.findById(sportId);
        if (!optionalGame.isEmpty()) {
            Game game = optionalGame.get();
            GetGameResponse gameResponse = new GetGameResponse(game.getSportName() , game.getGameDesignation());
            return gameResponse;
        } else {
            return null;
        }
    }
}
