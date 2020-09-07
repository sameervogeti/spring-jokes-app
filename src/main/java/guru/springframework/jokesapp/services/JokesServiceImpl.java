package guru.springframework.jokesapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokesServiceImpl implements JokesService {


     final ChuckNorrisQuotes chuckNorrisQuotes;

     public JokesServiceImpl()
     {
         this.chuckNorrisQuotes=new ChuckNorrisQuotes();
     }


    @Override
    public String renderJoke()
    {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
