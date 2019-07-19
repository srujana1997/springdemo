package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }
//setter injection for object
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void movieDisplay(){
        actor.displayActor();
    }
}


