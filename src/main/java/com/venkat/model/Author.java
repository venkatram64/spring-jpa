package com.venkat.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Entity
@Table(name="Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @ManyToOne(cascade = CascadeType.ALL)//one author can sponsor many authors
    @JoinColumn(name="SPANSOR_ID") //owning side, since it is having the join column
    private Author sponsor;

    @OneToMany(mappedBy = "sponsor")
    private List<Author> sponsoredAuthors = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author getSponsor() {
        return sponsor;
    }

    public void setSponsor(Author sponsor) {
        this.sponsor = sponsor;
    }

    public List<Author> getSponsoredAuthors() {
        return sponsoredAuthors;
    }

    public void setSponsoredAuthors(List<Author> sponsoredAuthors) {
        this.sponsoredAuthors = sponsoredAuthors;
    }
}
