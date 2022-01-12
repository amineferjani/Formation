
package com.mycompany.mavenproject2;

import java.io.Serializable;

public abstract class Compte implements Serializable {


    public Compte() {
    }

    protected int code;
    protected float solde;
    private static int nbCompte;

    public Compte(float solde) {
        nbCompte++;
        this.code = nbCompte;
        this.solde = solde;
    }

    public void verser(float mt){
        solde+=mt;
    }

    public void retirer(float mt){
        if(mt<solde)
            solde-=mt;
    }
    public abstract String afficher();


    public int getCode() {
        return code;
    }

    public float getSolde() {
        return solde;
    }

    public static int getNbCompte() {
        return nbCompte;
    }

}

