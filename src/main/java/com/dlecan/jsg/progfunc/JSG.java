package com.dlecan.jsg.progfunc;

import java.util.function.*;

import java.util.*;

public class JSG {

    public static enum Genre {
        H,
        F
    }

    public static class Personne {

        public String nom;

        public String prenom;

        public Genre genre;

        public Personne(String nom, String prenom, Genre genre) {
            this.nom = nom;
            this.prenom = prenom;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return String.format("Personne: %s, %s - %s", new Object[]{nom, prenom, genre});
        }

    }


    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<Personne>() {{
            add(new Personne("bob", "drummond", Genre.H));
            add(new Personne("jack", "leventreur", Genre.H));
            add(new Personne("marie", "scarry", Genre.F));
        }};

        System.out.println();

        personnes.forEach(System.out::println);

        System.out.println();
        System.out.println();

        personnes.stream();

        System.out.println();
        System.out.println();

    }

}