package com.itfactory.componente;

public class CutieDeViteze {
    private String marcaProductie;
    private double pretVanzare;
    private boolean esteAutomata;

    public CutieDeViteze(String marcaProductie,
                         double pretVanzareCv, boolean esteAutomata) {
        this.marcaProductie = marcaProductie;
        this.pretVanzare = pretVanzareCv;
        this.esteAutomata = esteAutomata;
    }

    public String getMarcaProductie() {
        return marcaProductie;
    }

    public void setMarcaProductie(String marcaProductie) {
        this.marcaProductie = marcaProductie;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public void setPretVanzare(double pretVanzare) {
        this.pretVanzare = pretVanzare;
    }

    public boolean isEsteAutomata() {
        return esteAutomata;
    }

    public void setEsteAutomata(boolean esteAutomata) {
        this.esteAutomata = esteAutomata;
    }
}
