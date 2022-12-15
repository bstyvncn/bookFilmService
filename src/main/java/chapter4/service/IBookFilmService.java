package chapter4.service;

import chapter4.model.bookFilm;
import org.springframework.stereotype.Service;

@Service
public interface IBookFilmService {
    void newBooking(bookFilm bookFilm);
}
