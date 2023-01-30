package book.book_my_movie.Repository;

import book.book_my_movie.Models.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeatEntity,Integer> {
}

