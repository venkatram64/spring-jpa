package com.venkat.service;

import com.venkat.model.Author;
import com.venkat.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author getAuthorById(Integer id){
        return authorRepository.getOne(id);
    }
    public boolean deleteAuthorById(Integer id){
        authorRepository.delete(id);
        return true;
    }
}
