package com.annagzowska.service;

import com.annagzowska.Dto.MovieDto;
import com.annagzowska.persistance.MovieJpaRepo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieFinderService {

    private MovieJpaRepo movieJpaRepo;

    @Autowired
    public  MovieFinderService(MovieJpaRepo movieJpaRepo) {this.movieJpaRepo = movieJpaRepo;}

    public List<MovieDto> find(int year) {
        boolean yearIsPresent = year > 0;
        if (yearIsPresent){
            return movieJpaRepo.findByYear(year);
        }
        return Lists.newArrayList(movieJpaRepo.findAll());
    }

}
