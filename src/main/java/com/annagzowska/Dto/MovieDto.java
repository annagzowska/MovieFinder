package com.annagzowska.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "MOVIES")
public class MovieDto {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private int year;

    @Column
    @Lob
    private String description;
}
