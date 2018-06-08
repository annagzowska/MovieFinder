package com.annagzowska.persistance;

import com.annagzowska.Dto.MovieDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieJpaRepo extends CrudRepository<MovieDto, Long> {
    List<MovieDto> findByYear(int year);
}
