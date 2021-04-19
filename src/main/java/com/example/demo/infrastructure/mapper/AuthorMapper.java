package com.example.demo.infrastructure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorMapper
{
    List<AuthorEntity> getAuthorList();
    
    AuthorEntity getAuthorById( @Param("id") int id );
    
    void registAuthor( @Param("name") String name );
}
