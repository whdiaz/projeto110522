package com.whdiaz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whdiaz.dsmovie.entities.Score;
import com.whdiaz.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
