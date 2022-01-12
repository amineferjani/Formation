package com.mycompany.mavenproject2;

public class ComptePayant extends Compte {

    public ComptePayant(float solde) {
        super(solde);
    }
    @Override
    public void retirer(float mt){
        super.retirer(mt);
        solde-=mt*5/100;
    }
    @Override
    public void verser(float mt){
        super.verser(mt);
        solde-=mt*5/100;
    }

    @Override
    public String afficher() {
        return"Code : "+code+" ; Solde : "+solde;
    }
}
