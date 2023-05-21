package com.codline.TaskBatch2.ResponseObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetLeaderboardResponse {

    String leaderboardName;

    Integer LeaderboardNumber;
}
