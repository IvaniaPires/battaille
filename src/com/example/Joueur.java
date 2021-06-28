package com.example;
import java.util.Random;

//public class Joueur {
//    public String nom;
//    public int [] deck = new int [13];
//
//
//    public void jouer() {
//        System.out.println(nom + " Oh, c'est à moi!!!");
//    }
//
//    public int [] initDeck(){
//        for (int i = 0; i<13; i++){
//            Random random = new Random();
//            deck[i]=random.nextInt(13)+1;
//        }
//        return deck;
//    }
//
//    public int tirerCarte() {
//        Random random = new Random();
//        int carteindex = random.nextInt(deck.length-1);
//        int carte = deck[carteindex];
//        return carte;
//    }
//}
public class Joueur {

    /* ***** Attributs ********/
    private String nom = "test";
    private int[] jeuDeCartes = new int[13];
    /* ***** Méthodes ********/
    public void initJeuCartes()
    {
        for(int i=0; i<jeuDeCartes.length;i++)
        {
            jeuDeCartes[i] = i+1; // [0] = 1 'As' [1] = 2 ...
        }
    }
    public int tirerUneCarte()
    {
        Random lRand = new Random();
        int lIndexAlea = lRand.nextInt(jeuDeCartes.length);
        return jeuDeCartes[lIndexAlea];
    }

    public void setJeuDeCartes(int[] value){
        this.jeuDeCartes = value;
    }

    public int[] getJeuDeCartes(){
        return  jeuDeCartes;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return  nom;
    }
}

