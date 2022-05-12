package com.whdiaz.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whdiaz.dsmovie.dto.MovieDTO;
import com.whdiaz.dsmovie.dto.ScoreDTO;
import com.whdiaz.dsmovie.service.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO saveScore(@RequestBody  ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
		
	}
	

}
