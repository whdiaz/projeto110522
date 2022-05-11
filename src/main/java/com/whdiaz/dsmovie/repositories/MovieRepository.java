package com.whdiaz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whdiaz.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
