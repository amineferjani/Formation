package com.mycompany.mavenproject2;

public class CompteEpargne extends Compte{
    private float taux;

    public CompteEpargne(float taux, float solde) {
        super(solde);
        this.taux = taux;
    }
    public void CalculInterret(){
        solde+=solde*taux/100;
    }

    @Override
    public String afficher() {
        return"Code : "+code+"; Taux : "+taux+" ; Solde : "+solde;
    }


}
