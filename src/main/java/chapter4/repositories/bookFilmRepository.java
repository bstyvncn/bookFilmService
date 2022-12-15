package chapter4.repositories;

import chapter4.model.bookFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookFilmRepository extends JpaRepository<bookFilm, String> {
}
