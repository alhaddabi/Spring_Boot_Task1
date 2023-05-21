package com.codline.TaskBatch2.Repository;

import com.codline.TaskBatch2.Models.Player;
import com.codline.TaskBatch2.Models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>  {
}
