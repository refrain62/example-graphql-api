package com.example.demo.model;

import com.example.demo.infrastructure.mapper.AuthorEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;
import com.example.demo.types.Author;

@Component
public class AuthorFactory {

    /**
     * create Author for AuthorEntity
     * @param authorEntity authorEntity
     * @return Author
     */
    public List<Author> create( List<AuthorEntity> authorEntityList )
    {
    	List<Author> authorList = new ArrayList<>();
    	
        if( Objects.isNull(authorEntityList) )
        {
            return null;
        }
        
        for( AuthorEntity authorEntity : authorEntityList )
        {
        	Author author = Author.builder().id( authorEntity.getId() ).name( authorEntity.getName() ).build();
        	
        	authorList.add( author );
        }

        return authorList;
    }
    
    /**
     * create Author for AuthorEntity
     * @param authorEntity authorEntity
     * @return Author
     */
    public Author create( AuthorEntity authorEntity )
    {
        if( Objects.isNull(authorEntity) )
        {
            return null;
        }

        return Author.builder().id( authorEntity.getId() ).name( authorEntity.getName() ).build();
    }
}
