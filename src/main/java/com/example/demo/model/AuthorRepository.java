package com.example.demo.model;

import java.util.List;

import com.example.demo.model.value.Id;
import com.example.demo.model.value.Name;
import com.example.demo.types.Author;
import com.example.demo.types.RegistAuthorResponse;

public interface AuthorRepository
{
    List<Author> getAuthorList();
    
    Author getAuthorById( Id id );
    
    RegistAuthorResponse registAuthor( Name name );
}
