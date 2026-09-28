package com.esliceu.streams.exercises;

import com.esliceu.streams.dao.InMemoryWorldDao;
import com.esliceu.streams.dao.WorldDao;

import java.util.LongSummaryStatistics;
import java.util.function.BiConsumer;

/**
 * 
 * 
 *
 */
public class Exercise12 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	private static final BiConsumer<String, LongSummaryStatistics> printEntry = (continent, statistics) -> System.out.printf("%s: %s\n", continent, statistics);

	public static void main(String[] args) {
		// Find the minimum, the maximum and the average population of each continent.

	}

}
