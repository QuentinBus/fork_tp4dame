/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.jeudedames;

import java.util.ArrayList;

/**
 *
 * @author grigm
 */
public class Partie {
    private ArrayList<Pion> listePions; 

    public ArrayList<Pion> getListePions() {
        return listePions;
    }

    public void setListePions(ArrayList<Pion> listePions) {
        this.listePions = listePions;
    }
    
    
    
    public Pion verifierCase(int x, int y){
        
        for (int i = 0; i < this.getListePions().size(); i++) {
            if ((this.getListePions().get(i).getX()==x) && (this.getListePions().get(i).getY()==y)){
                return this.getListePions().get(i); 
            }
         }
        return null; 
    }
    
    private ArrayList<Pion> verifierPrisePossible(boolean estBlanc){
        for (int i = 0; i < this.getListePions().size(); i++) {
            Pion pionTest = this.getListePions().get(i);
           if (pionTest.isBlanc() == estBlanc){
               verifierPrisePossible(pionTest);
           }
        }
    }
    
    private ArrayList<Pion> verifierPrisePossible(Pion pion){
        ArrayList<Pion> listePionPrenables;
        listePionPrenables = new ArrayList<Pion>();
        int[][] mouvements = {
            {1,1},
            {1,-1},
            {-1,-1},
            {-1,1}
        };
        
        for (int i = 0; i < mouvements.length; i++){
            
        }
        
        return listePionPrenables;
    }
}
