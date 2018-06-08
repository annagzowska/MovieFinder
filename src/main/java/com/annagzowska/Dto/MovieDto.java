package com.annagzowska.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "MOVIES")
public class MovieDto {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private int year;

    private String description;
}
