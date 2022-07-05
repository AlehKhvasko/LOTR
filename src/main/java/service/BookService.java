package service;

import lombok.RequiredArgsConstructor;
import models.entity.ListOfBookEntity;
import repository.BookRepository;

@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public ListOfBookEntity save(ListOfBookEntity listOfBookEntity) {
        return bookRepository.save(listOfBookEntity);
    }

}
