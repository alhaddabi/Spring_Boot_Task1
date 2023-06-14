package com.codline.TaskBatch2.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
public class Game extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id ;


    @Column(unique = true)
    String Sport_Name;

    String gameDesignation;

}
