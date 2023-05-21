package com.codline.TaskBatch2.Controller;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Models.Leaderboard;
import com.codline.TaskBatch2.RequestObject.GetGameRequest;
import com.codline.TaskBatch2.RequestObject.GetLeaderboardRequest;
import com.codline.TaskBatch2.Service.GameService;
import com.codline.TaskBatch2.Service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GameController {

    @Autowired
    GameService gameService;


    @PostMapping("Game/api/register")
    public void saveGame (@RequestBody GetGameRequest gameRequest)
    {
        createGame(gameRequest);
    }


    public void createGame(GetGameRequest gameRequest)
    {
        Game game = new Game();
        game.setGameDesignation("11 player in every team");
        game.setSportName("Football");
        game.setUpdatedDate(new Date());
        game.setIsActive(true);
        game.setCreatedDate(new Date());
        gameService.saveGame(game);
    }
}
