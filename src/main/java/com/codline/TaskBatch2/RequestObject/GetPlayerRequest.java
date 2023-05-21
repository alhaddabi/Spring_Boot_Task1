package com.codline.TaskBatch2.RequestObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetPlayerRequest {


    String playerName ;

    String playerAge;

    String playerGander;

    String playerFavoriteTeam;
}
