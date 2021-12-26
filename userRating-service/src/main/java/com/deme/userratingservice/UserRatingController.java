package com.deme.userratingservice;

import com.deme.userratingservice.domain.Rating;
import com.deme.userratingservice.domain.UserRatings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("userRatings")
public class UserRatingController {

    @GetMapping("{userid}")
    public UserRatings findByUserId(@PathVariable  int userid) {

        return new UserRatings(userid, "dememan", Arrays.asList(
                        new Rating(1, 5) ,
                        new Rating(2, 4),
                        new Rating(3, 3)
       ));


    }
}
