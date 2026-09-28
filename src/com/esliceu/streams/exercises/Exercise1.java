package com.esliceu.streams.exercises;

import com.esliceu.streams.service.InMemoryMovieService;
import com.esliceu.streams.service.MovieService;

/**
 * 
 * 
 *
 */
record ResEx1(String name, int howManyMovies) {

}
public class Exercise1 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of movies of each director

		//adui se hace con for each
	/*	movieService.findAllDirectors().stream()
				.forEach(d -> {

					long howmany= movieService.findAllMoviesByDirectorId(d.getId()).stream()
							.count();
					System.out.printf("DIrector: %s, movies: %d \n",d.getName(), howmany);
				});

	 */
			// es mejor la segunda opcion porque lo guarda en lista y por eso es mas flexible
		var list = movieService.findAllDirectors().stream().map(d -> {
			long howmany= movieService.findAllMoviesByDirectorId(d.getId()).stream()
					.count();
			return new ResEx1(d.getName(), (int) howmany);
		}).toList();
		System.out.println(list);

	}

}
