package com.deme.moviecatalogservice;

import com.deme.moviecatalogservice.domain.CatalgItem;
import com.deme.moviecatalogservice.domain.Movie;
import com.deme.moviecatalogservice.domain.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {


    @Autowired
    RestTemplate restTemplate;
    WebClient.Builder builder = WebClient.builder();


    // WebClient.Builder().get().url("").retrieve().getFromMono(UserRatings.class).block();

    @GetMapping("/{userId}")
    public List<CatalgItem> getCatalog(@PathVariable("userId") int userid) {


    /*    UserRatings ratings = builder.build()
                .get()
                .uri("http://localhost:8082/userRatings/" + userid)
                .retrieve()
                .bodyToMono(UserRatings.class)
                .block();
*/
        UserRatings ratings=restTemplate.getForObject("http://rating-info-service/userRatings/"+userid ,UserRatings.class);


        return ratings.getRatings().stream()

                .map(rating -> {
                            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
                            return new CatalgItem(rating.getMovieId(), movie.getName(), rating.getRating());
                        }
                )
                .collect(Collectors.toList());


    }
}
