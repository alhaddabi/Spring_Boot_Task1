package com.codline.TaskBatch2.Controller;

import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.Models.Team;
import com.codline.TaskBatch2.RequestObject.GetPlayerRequest;
import com.codline.TaskBatch2.RequestObject.GetTeamRequest;
import com.codline.TaskBatch2.Service.PlayerService;
import com.codline.TaskBatch2.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
public class TeamController {

        @Autowired
        TeamService teamService;


        @PostMapping("Team/api/register")
        public void saveTeam (@RequestBody GetTeamRequest teamRequest)
        {
            createTeam(teamRequest);
        }


        public void createTeam(GetTeamRequest teamRequest)
        {
            Team team = new Team();
            team.setTeamName("Oman Team");
            team.setTeamMemberNumber(120);
            team.setUpdatedDate(new Date());
            team.setIsActive(true);
            team.setTeamNickName("Fast_Team");
            team.setCreatedDate(new Date());
            teamService.saveTeam(team);
        }
}
