package com.itfactory;

import com.itfactory.componente.CutieDeViteze;
import com.itfactory.componente.Motor;

public class Main {

    public static void main(String[] args) {
	    Motor motor = new Motor("Ford",10600,1596);
        CutieDeViteze cutieDeViteze = new CutieDeViteze("Ford",1080.12, false);
        Reparatie reparatie = new Reparatie("Ford",700.59, motor, cutieDeViteze);

        double cost =reparatie.calculeazaCostReparatie();
        System.out.println(cost);
    }

}
