package com.brainacad.tests.test27;

/**
 * Created by mv on 19.07.2016.
 */
class Plant {
    public void smell(){
        System.out.println("Smells");
    }
}
class Rose extends Plant {
    public void prick(){
        System.out.println("Prickles");
    }
}
public class Camomile extends Plant{
    public void cure(){
        System.out.println("Cures");
    }
    public static void main (String [] args){
        Plant [] plant = {new Camomile(), new Rose()};
        for(Plant p: plant){
            if(p instanceof Rose){
                //p.prick();
                p.smell();
            }
        }
    }
}