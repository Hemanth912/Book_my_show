package book.book_my_movie.Dtos;

import lombok.Data;

import java.util.Date;


@Data
public class MovieRequestDto {

    private String name;
    private Date releaseDate;
    private int duration;
}

