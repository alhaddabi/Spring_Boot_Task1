package com.codline.TaskBatch2.ResponseObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetPlayerResponse {
    String playerName ;
    String playerFavoriteTeam;
}
