package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.Repository.GameReprository;
import com.codline.TaskBatch2.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameReprository gameReprository;

    public List<Game> getGame() {return gameReprository.findAll();
    }
    public void saveGame(Game game) {gameReprository.save(game); }


}
