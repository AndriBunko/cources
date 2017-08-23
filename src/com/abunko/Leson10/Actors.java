package com.abunko.Leson10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 08.08.2017.
 */
public class Actors implements Serializable{
    private  List<Actor> actorsList = new ArrayList<>();

    public Actors() {
    }

    public Actors(ArrayList<Actor> actors) {
        this.actorsList = actors;
    }

    public Actors addActor(Actor actor){
        actorsList.add(actor);
        return this;
    }

    public List<Actor> getActorsList() {
        return actorsList;
    }
}
