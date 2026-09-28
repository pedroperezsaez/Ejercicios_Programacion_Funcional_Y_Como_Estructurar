package com.esliceu.streams.exercises;

import com.esliceu.streams.service.InMemoryMovieService;
import com.esliceu.streams.service.MovieService;

import java.util.stream.Collectors;

/**
 * 
 * 
 *
 */
public class Exercise3 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of genres of each director's movies

		var res=movieService.findAllDirectors().stream().map(director-> {
			movieService.findAllGenres().stream().map(genere->{
				movieService.findAllMoviesByDirectorId(director.getId()).stream().
				if (director.getId()== genere.getId()){

				}
			})
		});

		System.out.println(res);


		
	}

}