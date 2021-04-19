package com.example.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.infrastructure.BookRepositoryImpl;
import com.example.demo.model.value.Id;
import com.example.demo.types.Book;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class BookQueryResolver implements GraphQLQueryResolver
{
    private final BookRepositoryImpl bookRepositoryImpl;

    public List<Book> books()
    {
        return bookRepositoryImpl.getBooksList();
    }

    public Book book( int id )
    {
        Id idValue = Id.of( id );
        
        return bookRepositoryImpl.getBookById( idValue );
    }
}
