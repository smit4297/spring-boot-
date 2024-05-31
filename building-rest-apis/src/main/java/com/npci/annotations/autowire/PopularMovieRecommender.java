package com.npci.annotations.autowire;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PopularMovieRecommender {

    public List<String> getMovieNames() {
        return Arrays.asList("3 idiots", "gg");
    }
}
