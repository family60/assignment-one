package com.kovunov;


import com.kovunov.model.Game;

import java.util.List;

public interface GameManager {
    void add(Game game);
    List<Game> getGame();
    void delete(Game game);
}
