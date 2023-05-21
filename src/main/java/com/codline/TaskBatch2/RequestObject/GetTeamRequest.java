package com.codline.TaskBatch2.RequestObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetTeamRequest {

    String teamName ;

    Integer teamMemberNumber;

    String  teamNickName;

}
