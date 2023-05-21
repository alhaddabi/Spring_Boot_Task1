package com.codline.TaskBatch2.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Data
public class Team extends BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String teamName ;

    Integer teamMemberNumber;

    String  teamNickName;





}
