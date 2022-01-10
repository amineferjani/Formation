/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author amine
 */
public class App {
    public static void main(String[] a){    
        Compte c=new Compte();
        Compte c1=new Compte(2000);
        Compte c2=new Compte(5000);
        Compte c3=new Compte(10000);
        c1.verser(100);
        c3.verser(1200);
     c1.afficher();
     c2.afficher();
     c3.afficher();
        System.out.println("Nombre de compte :"+Compte.getNbrCompte());
    }
}