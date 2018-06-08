package com.annagzowska.rest;

import com.annagzowska.Dto.MovieDto;
import com.annagzowska.persistance.MovieJpaRepo;
import com.annagzowska.service.MovieFinderService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class AppRestController {

    private MovieJpaRepo movieRepository;
    private MovieFinderService movieFinderService;

    @Autowired
    public AppRestController(MovieJpaRepo movieJpaRepo, MovieFinderService movieFinderService) {
        this.movieRepository = movieJpaRepo;
        this.movieFinderService = movieFinderService;
    }

    @RequestMapping(path = "/test")
    public String test() {
        return "ok";
    }

    @RequestMapping(path = "/year", method = RequestMethod.GET)
    public List<MovieDto> getAll(@RequestParam(value = "year", required = false) int year) {
        return movieFinderService.find(year);

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<MovieDto> getAll() {
        return Lists.newArrayList(movieRepository.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody MovieDto movieDto) {
        return movieRepository.save(movieDto).getId();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MovieDto get(@PathVariable("id") Long id) throws EntityNotFoundException{
            return movieRepository.findOne(id);
    }

        @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
        @ResponseStatus(HttpStatus.CREATED)
        public void update (@RequestBody MovieDto movieDto, @PathVariable("id") Long id){
            movieDto.setId(id);
            movieRepository.save(movieDto);
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void delete (@PathVariable("id") Long id) {
            movieRepository.delete(id);
        }

    }
