package com.benialex.proiectfinal;

public class Zoo {
    private String nume;
    private String oras;
    private int nrangajati;
    private int capacitate_gazduire;
    private int nr_vietati=0;

    private static Zoo zoo;


    private Zoo(String nume, String oras, int nrangajati, int capacitate_gazduire) {
        this.nume = nume;
        this.oras = oras;
        this.nrangajati = nrangajati;
        this.capacitate_gazduire = capacitate_gazduire;
    }

    private Zoo() {
        this.nume =" ";
        this.oras =" ";
        this.nrangajati =-1;
        this.capacitate_gazduire =-1;
    }

    public static Zoo getInstance(String nume, String oras, int nrangajati, int capacitate_gazduire){
        if(zoo == null){
            zoo=new Zoo(nume,oras,nrangajati,capacitate_gazduire);
        }
            return zoo;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public int getNrangajati() {
        return nrangajati;
    }

    public void setNrangajati(int nrangajati) {
        this.nrangajati = nrangajati;
    }

    public int getCapacitate_gazduire() {
        return capacitate_gazduire;
    }

    public void setCapacitate_gazduire(int capacitate_gazduire) {
        this.capacitate_gazduire = capacitate_gazduire;
    }

    public int getNr_vietati() {
        return nr_vietati;
    }

    public void setNr_vietati(int nr_vietati) {
        this.nr_vietati = nr_vietati;
    }

    @Override
    public String toString() {
        return "Gradina Zoo " + nume +
                " se afla in orasul " + oras +
                ", are " + nrangajati +" de angajati" +
                ", o capacitate maxima de gazduire de  "+ capacitate_gazduire+" locuri, din care "+nr_vietati+" locuri sunt ocupate";
    }
}
