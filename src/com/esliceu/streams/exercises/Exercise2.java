package com.esliceu.streams.exercises;

import com.esliceu.streams.dao.CountryDao;
import com.esliceu.streams.dao.InMemoryWorldDao;
import com.esliceu.streams.domain.City;

import java.util.Comparator;
import java.util.List;

/**
 * 
 * 
 *
 */


public class Exercise2 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numeros2=numeros.stream().sorted(Comparator.reverseOrder()).toList();
		// Find the most populated city of each continent

		/*var list = movieService.findAllDirectors().stream().map(d -> {
			long howmany= movieService.findAllMoviesByDirectorId(d.getId()).stream()
					.count();
			return new ResEx1(d.getName(), (int) howmany);
		}).toList();
		System.out.println(list);
		*/

		/*
		countryDao.getAllContinents().stream()
						.filter(cont -> !cont.equals("Antartica"))
								.forEach(cont -> {
									var city = countryDao.findCountriesByContinent(cont).stream()
											.map(country -> {
												var maxCity = country.getCities().stream().max(Comparator.comparingInt(City::getPopulation));
												return  maxCity.orElse(new City());
											});
								});







		countryDao.getAllContinents().stream().forEach(conti ->
				countryDao.findCountriesByContinent(countr ->
				)	);


		 */
	}

}