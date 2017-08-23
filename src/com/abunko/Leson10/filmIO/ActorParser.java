package com.abunko.Leson10.filmIO;

import com.abunko.Leson10.Actor;
import com.abunko.Leson10.Actors;


import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Andrew on 23.08.2017.
 */
public final class ActorParser {
    public static Actors parseActors(String s) throws IllegalFormatException {
        ArrayList<Actor> actors = new ArrayList<>();
        String[] str = s.split(":");
        if (str.length == 0) {
            throw new IllegalFormatException("Illegal format" + s);
        }
        for (String s1 : str) {
            String[] str1 = s1.split(",");
            if(str1.length < 2) throw new IllegalFormatException("Illegal format" + s1);
            actors.add(new Actor(str1[0], str1[1]));
        }
        return new Actors(actors);
    }


        public static String actorFormat(Actor actor){
            return actor.getName() + "," + actor.getSurname();
        }

        public static String actorsFormat(Actors actors){
            return actors.getActorsList().stream().map(ActorParser :: actorFormat).collect(Collectors.joining(":"));
        }
}
