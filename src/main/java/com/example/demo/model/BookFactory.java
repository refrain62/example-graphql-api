package com.example.demo.model;

import com.example.demo.infrastructure.mapper.BookEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import com.example.demo.types.Book;

@Component
@AllArgsConstructor
public class BookFactory {

    /**
     * create Books for BookEntities
     * @param bookEntities bookEntities
     * @return Books
     */
    public List<Book> create( List<BookEntity> bookEntities )
    {
        List<Book> bookList = new ArrayList<>();
        
        for (BookEntity bookEntity : bookEntities)
        {
            Book book = Book.builder().id( bookEntity.getId() ).authorId( bookEntity.getAuthorId() ).name( bookEntity.getName() ).build();
            
            bookList.add( book );
        }

        return bookList;
    }

    /**
     * create Book for BookEntity
     * @param BookEntity bookEntity
     * @return Author
     */
    public Book create( BookEntity bookEntity )
    {
        if( Objects.isNull(bookEntity) )
        {
            return null;
        }

        return Book.builder().id( bookEntity.getId() ).name( bookEntity.getName() ).build();
    }
}
