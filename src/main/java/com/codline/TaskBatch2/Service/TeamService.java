package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Team;
import com.codline.TaskBatch2.Repository.TeamRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {


    @Autowired
    TeamRepository teamRepository;


    public List<Team> getTeam() {return teamRepository.findAll();
    }
    public void saveTeam(Team team) {teamRepository.save(team); }


}
