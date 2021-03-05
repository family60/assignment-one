package com.kovunov;

import com.kovunov.model.Game;
import com.kovunov.model.Forza;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class GameManagementService implements com.kovunov.GameManager
{
    private List<Game> games;

    @PostConstruct
    public void addForza()
    {
        games = new ArrayList<>();
        games.add(new Forza("Forza Horizon 1", 13.99, 1,"Playground Games"));
    }

    @Override
    public List<Game> getGame(){
        return games;
    }

    @Override
    public void delete(@Observes @DeleteGame Game game){
        games = new ArrayList<>();
        games.remove(game);
    }

    @Override
    public void add(@Observes @com.kovunov.AddGame Game game){
        games = new ArrayList<>();
        games.add(game);
    }


}
