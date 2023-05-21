package com.codline.TaskBatch2.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Leaderboard extends BaseEntity {
    @javax.persistence.Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long Id ;

    String leaderboardName;

    Integer LeaderboardNumber;
}
