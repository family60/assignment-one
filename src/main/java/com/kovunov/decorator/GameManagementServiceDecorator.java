package com.kovunov.decorator;

import com.kovunov.GameManagementService;
import com.kovunov.GameManager;
import com.kovunov.model.Game;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import java.util.List;

@Decorator
public class GameManagementServiceDecorator implements GameManager {

    @Inject
    @Delegate
    private GameManagementService gameManagementService;

    @Override
    public List<Game> getGame(){
        return gameManagementService.getGame();
    }

    @Override
    public void delete(Game game){
        gameManagementService.delete(game);
    }

    @Override
    public void add(Game game){
        gameManagementService.add(game);
    }




}
