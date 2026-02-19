package edu.iesam.features.author.data;

import edu.iesam.features.author.domain.Author;

import java.util.ArrayList;

public class AuthorApiLocalDataSource {
    public ArrayList<Author> authorApiStorage= new ArrayList<>();

    public AuthorApiLocalDataSource() {
        initData();
    }

    public void initData(){
        Author author1= new Author("1","Extremoduro","01-01-1970","Española");
        authorApiStorage.add(author1);

        Author author2= new Author("2","Oasis","01-01-1980","Inglesa");
        authorApiStorage.add(author2);
    }

    public ArrayList<Author> findAll(){
        return authorApiStorage;
    }
}
