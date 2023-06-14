package com.codline.TaskBatch2.Repository;


import com.codline.TaskBatch2.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("SELECT a FROM Game a WHERE a.Sport_Name=:SportName")
    List<Game>getSporyBySportName(@Param("SportName") String Sport_Name);
}
