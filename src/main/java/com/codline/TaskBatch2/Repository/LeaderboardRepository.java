package com.codline.TaskBatch2.Repository;


import com.codline.TaskBatch2.Models.Leaderboard;
import com.codline.TaskBatch2.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {
}
