package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Leaderboard;
import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.Repository.LeaderboardRepository;
import com.codline.TaskBatch2.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {

    @Autowired
    LeaderboardRepository leaderboardRepository;

    public List<Leaderboard> getLeaderBoard() {return leaderboardRepository.findAll();
    }
    public void saveLeader(Leaderboard leaderboard) {leaderboardRepository.save(leaderboard); }


}
