package com.codline.TaskBatch2.Controller;


import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.RequestObject.GetPlayerRequest;
import com.codline.TaskBatch2.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;


    @RequestMapping("player/create")
    public void savePlayer (@RequestBody GetPlayerRequest playerRequest)
    {
        createPlayer(playerRequest);
    }


    public void createPlayer(GetPlayerRequest playerRequest)
    {
        Player player = new Player();
        player.setPlayerName("adnan");
        player.setPlayerAge(26);
        player.setUpdatedDate(new Date());
        player.setIsActive(true);
        player.setPlayerGander("Male");
        player.setCreatedDate(new Date());
        player.setPlayerFavoriteTeam("A");
        playerService.savePlayer(player);
    }
}
