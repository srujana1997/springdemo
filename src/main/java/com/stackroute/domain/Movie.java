package com.stackroute.domain;

public class Movie {
    private Actor actor;
    //setter injection for object
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void movieDisplay(){
        actor.displayActor();
    }
}
