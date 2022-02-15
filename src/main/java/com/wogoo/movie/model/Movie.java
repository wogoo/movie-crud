package com.wogoo.movie.model;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "movie_description")
    private String movieDescription;
    @Column(name = "movie_image")
    private String movieImage;
    @Column(name = "movie_trailer")
    private String movieTrailer;
    @Column(name = "movie_duration")
    private String movieDuration;
    @Column(name = "movie_release_date")
    private String movieReleaseDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
