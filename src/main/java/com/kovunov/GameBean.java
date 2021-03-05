package com.kovunov;


import com.kovunov.interceptor.Logged;
import com.kovunov.model.Forza;
import com.kovunov.model.Game;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Model
public class GameBean
{
    private String name;
    private Double price;
    private int quantity;
    private String company;

    @Inject
    @com.kovunov.AddGame
    private Event<Game> gameAddGame;

    @Inject
    @DeleteGame
    private Event<Game> gameDeleteGame;

    @Inject
    private GameManager gameService;

    public List<Game> getGames(){
        return gameService.getGame();
    }

    @Logged

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Logged
    public void addGame(){
        gameAddGame.fire(new Forza(name, price, quantity, company));
    }

    @Logged
    public void deleteGame(){
        gameDeleteGame.fire(new Forza(name, price, quantity, company));
    }
}
