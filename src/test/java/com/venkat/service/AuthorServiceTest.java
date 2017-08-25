package com.venkat.service;

import com.venkat.model.Author;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Author.class, AuthorService.class})
@EntityScan(basePackages = {"com.venkat.model"})
@EnableAutoConfiguration
@AutoConfigureTestDatabase
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthorServiceTest {

    @Autowired
    private AuthorService authorService;

    //@Test
    public void test1InsertAuthor(){
        Author sponsor = new Author();
        sponsor.setFirstName("Venkatram");
        sponsor.setLastName("Veerareddy");

        Author sponsored = new Author();
        sponsored.setFirstName("Srijan");
        sponsored.setLastName("Veerareddy");

        sponsored.setSponsor(sponsor);

        authorService.addAuthor(sponsored);

        sponsored = authorService.getAuthorById(sponsored.getId());

        assertNotNull(sponsored);
        assertNotNull(sponsored.getSponsor());

    }

    @Test
    public void test2nsertAuthor(){
        Author sponsor = new Author();
        sponsor.setFirstName("Venkatram");
        sponsor.setLastName("Veerareddy");

        Author sponsored = new Author();
        sponsored.setFirstName("Srijan");
        sponsored.setLastName("Veerareddy");

        sponsored.setSponsor(sponsor);
        sponsor.getSponsoredAuthors().add(sponsored);

        authorService.addAuthor(sponsored);

        sponsored = authorService.getAuthorById(sponsored.getId());

        assertNotNull(sponsored);
        assertNotNull(sponsored.getSponsor());

        Author dbAuthor = authorService.getAuthorById(sponsor.getId());
        assertNotNull(dbAuthor);

    }


}
