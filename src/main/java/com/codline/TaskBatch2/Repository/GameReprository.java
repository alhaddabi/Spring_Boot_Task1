package com.codline.TaskBatch2.Repository;


import com.codline.TaskBatch2.Models.Game;
import com.codline.TaskBatch2.Models.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameReprository extends JpaRepository<Game, Long> {
}
