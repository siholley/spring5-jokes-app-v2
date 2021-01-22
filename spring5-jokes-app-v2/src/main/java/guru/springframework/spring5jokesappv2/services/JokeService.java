package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getJoke(){
        return "New Joke";
    }
}
