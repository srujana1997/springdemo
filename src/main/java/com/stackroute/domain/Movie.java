package com.stackroute.domain;

public class Movie {
    private Actor actor;
      //setterinjection for injecting object
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void movieDisplay(){
        actor.displayActor();
    }
}
