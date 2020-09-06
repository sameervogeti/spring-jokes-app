package guru.springframework.jokesapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesService {


    ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();

    public String renderJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
