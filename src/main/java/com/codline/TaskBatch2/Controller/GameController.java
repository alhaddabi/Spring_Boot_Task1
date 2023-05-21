package com.codline.TaskBatch2.Controller;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Models.Leaderboard;
import com.codline.TaskBatch2.RequestObject.GetGameRequest;
import com.codline.TaskBatch2.RequestObject.GetLeaderboardRequest;
import com.codline.TaskBatch2.ResponseObject.GetGameResponse;
import com.codline.TaskBatch2.Service.GameService;
import com.codline.TaskBatch2.Service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService gameService;


    @PostMapping("Game/api/register")
    public void saveGame (@RequestBody GetGameRequest gameRequest)
    {
        createGame(gameRequest);
    }


    @RequestMapping("Game/get")
    public List<Game> getGame ()
    {
        return gameService.getGame();
    }


    @GetMapping("Game/get/{sportName}")
    public GetGameResponse createGAme (@PathVariable Long gameId)
    {
        return gameService.getSPortByName(gameId);
    }


    public void createGame(GetGameRequest gameRequest)
    {
        Game game = new Game();
        game.setGameDesignation("11 player in every team");
        game.setSportName("basketball");
        game.setCreatedDate(new Date());
        game.setUpdatedDate(new Date());
        game.setIsActive(true);
        gameService.saveGame(game);
    }
}
