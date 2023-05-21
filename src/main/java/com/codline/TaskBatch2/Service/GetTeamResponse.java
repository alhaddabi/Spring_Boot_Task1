package com.codline.TaskBatch2.Service;


import com.codline.TaskBatch2.Models.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetTeamResponse {


    @Autowired
    Team team;
}
