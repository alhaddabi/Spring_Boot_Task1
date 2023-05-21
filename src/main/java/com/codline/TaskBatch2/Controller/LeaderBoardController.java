package com.codline.TaskBatch2.Controller;
import com.codline.TaskBatch2.Models.Leaderboard;
import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.RequestObject.GetLeaderboardRequest;
import com.codline.TaskBatch2.RequestObject.GetPlayerRequest;
import com.codline.TaskBatch2.Service.LeaderboardService;
import com.codline.TaskBatch2.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LeaderBoardController {

    @Autowired
    LeaderboardService leaderboardService;


    @PostMapping("Leader/api/register")
    public void saveLeader (@RequestBody GetLeaderboardRequest leaderboardRequest)
    {
        createLeader(leaderboardRequest);
    }


    public void createLeader(GetLeaderboardRequest leaderboardRequest)
    {
        Leaderboard leader = new Leaderboard();
        leader.setLeaderboardName("adnan,majid,Hisham");
        leader.setLeaderboardNumber(3);
        leader.setUpdatedDate(new Date());
        leader.setIsActive(true);
        leader.setCreatedDate(new Date());
        leaderboardService.saveLeader(leader);
    }
}
