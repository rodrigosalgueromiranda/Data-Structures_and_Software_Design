/*
 * SD2x Homework #5
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;


public class MovieRatingsProcessor {

	public static List<String> getAlphabeticalMovies(TreeMap<String, PriorityQueue<Integer>> movieRatings) {
		if (movieRatings == null || movieRatings.isEmpty()) {
			return new ArrayList<String>();
		}
		
		List<String> keys = new ArrayList<>(movieRatings.keySet());
		
		return keys; 
	}

	public static List<String> getAlphabeticalMoviesAboveRating(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
		if (movieRatings == null || movieRatings.isEmpty()) {
			return new ArrayList<String>();
		}
		
		List<String> movies = new ArrayList<>();
		
		for (String title : movieRatings.keySet()) {
			if (movieRatings.get(title).peek() > rating) {
				movies.add(title);
			}
		}
		
		return movies;
	}
	
	public static TreeMap<String, Integer> removeAllRatingsBelow(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
		if (movieRatings == null || movieRatings.isEmpty()) {
			return new TreeMap<String, Integer>();
		}
		
		TreeMap<String, Integer> result = new TreeMap<>();
	

		return result;
	}
}
