package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Repository.GameRepository;
import com.codline.TaskBatch2.RequestObject.GetGameRequest;
import com.codline.TaskBatch2.ResponseObject.GetGameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<Game> getGame() {
        return gameRepository.findAll();
    }

    public void saveGame(Game game) {
        gameRepository.save(game);
    }



    public GetGameResponse updateGame(Long GameID, GetGameRequest updateGame) {
        Optional<Game> optionalGame = gameRepository.findById(GameID);
        if (optionalGame.isPresent()) {
            Game game = optionalGame.get();
            game.setSport_Name(updateGame.getGameName());
            game.setGameDesignation(updateGame.getGameDesignation());
            gameRepository.save(game);
            return GetGameBuId(GameID);
  }
        return null;
    }

    public GetGameResponse GetGameBuId(Long id) {
        Optional<Game> optionalGame = gameRepository.findById(id);
        if (optionalGame.isPresent()) {
            Game game = optionalGame.get();
            GetGameResponse gameResponse = new GetGameResponse();
            gameResponse.setGameName(game.getSport_Name());
            gameResponse.setGameDesignation(game.getGameDesignation());
            return gameResponse;
        }
        return null;
    }

    public List<Game>getSporyBySportName(String Sport_Name){
        return gameRepository.getSporyBySportName(Sport_Name);
    }
}
