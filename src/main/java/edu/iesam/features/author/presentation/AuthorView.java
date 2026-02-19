package edu.iesam.features.author.presentation;

import edu.iesam.features.author.data.AuthorApiLocalDataSource;
import edu.iesam.features.author.data.AuthorDataRepository;
import edu.iesam.features.author.data.AuthorMemLocalDataSource;
import edu.iesam.features.author.domain.Author;
import edu.iesam.features.author.domain.GetAuthorsUseCase;

import java.util.ArrayList;

public class AuthorView {

    public static void printAuthors() {
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(
                new AuthorDataRepository(
                        new AuthorMemLocalDataSource(),
                        new AuthorApiLocalDataSource()));

        ArrayList<Author> authors =getAuthorsUseCase.execute();
        System.out.println(authors);
    }
}
