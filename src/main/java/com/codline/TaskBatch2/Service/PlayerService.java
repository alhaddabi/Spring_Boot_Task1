package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getPlayer() {return playerRepository.findAll();
    }
    public void savePlayer(Player player) {playerRepository.save(player); }



}
