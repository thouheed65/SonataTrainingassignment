package com.sonata.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.sonata.model.CatalogItem;
import com.sonata.model.Movie;
import com.sonata.model.Rating;
import com.sonata.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
	
		 UserRating ratings = restTemplate.getForObject("http://Rating-data-service/ratingdata/users/" + userId, UserRating.class);
		
		return ratings.getUserRating().stream().map(rating -> {
			//for each movie ID, call movie info service and get details
			Movie movie = restTemplate.getForObject("http://Movie-info-service/movies/" + rating.getMovieId(),Movie.class);
			
			//put them all together
			return new CatalogItem(movie.getName(), "Desc", rating.getRating());
		})
		.collect(Collectors.toList());
		
		//get all rated movie IDs
	
		
        
    }
}

/*Movie movie = webClientBuilder.build()
.get()
.uri("http://localhost:8081/movies/" + rating.getMovieId())
.retrieve()
.bodyToMono(Movie.class)
.block();
*/
