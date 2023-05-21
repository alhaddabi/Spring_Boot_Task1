package com.codline.TaskBatch2.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Player extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long Id ;

//    @JoinColumn(name = "playerId" , referencedColumnName = "id")
//    @OneToOne(Cascade = CascadeType.ALL)
//    Team team;

    String playerName ;

    String playerAge;

    String playerGander;

    String playerFavoriteTeam;
}
