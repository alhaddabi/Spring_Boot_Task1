package com.codline.TaskBatch2.Controller;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Models.Leaderboard;
import com.codline.TaskBatch2.Repository.GameRepository;
import com.codline.TaskBatch2.RequestObject.GetGameRequest;
import com.codline.TaskBatch2.RequestObject.GetLeaderboardRequest;
import com.codline.TaskBatch2.ResponseObject.GetGameResponse;
import com.codline.TaskBatch2.Service.GameService;
import com.codline.TaskBatch2.Service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class GameController {

    @Autowired
    GameService gameService;


    @PostMapping("Game/api/register")
    public void saveGame(@RequestBody GetGameRequest gameRequest) {
        createGame(gameRequest);
    }


    @RequestMapping("Game/get")
    public List<Game> getGame() {
        return gameService.getGame();
    }


    @PutMapping("/api/Game/{GameId}")
    public ResponseEntity<GetGameResponse> updateGame(@PathVariable Long GameID, @RequestBody GetGameRequest updateGame) {
        GetGameResponse response = gameService.updateGame(GameID, updateGame);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

        public void createGame (GetGameRequest gameRequests)
        {
            Game game = new Game();
            game.setGameDesignation("11 player in every team");
            game.setSport_Name("basketball");
            game.setCreatedDate(new Date());
            game.setUpdatedDate(new Date());
            game.setIsActive(true);
            gameService.saveGame(game);
        }
    @RequestMapping("game/getPlayerBySportName")
    public List<Game> getSporyBySportName(@RequestParam String Sport_Name){
        return gameService.getSporyBySportName(Sport_Name);
    }

    @PutMapping("/api/products/{GameID}")
    public ResponseEntity<GetGameResponse> UpdateGame(@PathVariable Long id, @RequestBody GetGameRequest updateGAme) {
        GetGameResponse response = gameService.updateGame(id, updateGAme);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    }

