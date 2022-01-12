package com.mycompany.mavenproject2;

public class CompteSimple extends Compte {
    private float decouvert;

    CompteSimple(float solde,float d){
        super(solde);
        super.solde=solde;
        decouvert=d;
    }
    @Override
    public void retirer(float mt){
        if(mt<solde+decouvert)
            solde-=mt;
    }


    @Override
    public String afficher() {
        return"Code : "+code+" ; Découvert : "+decouvert+" Solde : "+solde;
    }
}
