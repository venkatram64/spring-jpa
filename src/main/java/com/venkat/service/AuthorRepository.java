package com.venkat.service;

import com.venkat.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{
}
