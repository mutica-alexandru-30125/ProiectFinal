package com.benialex.proiectfinal;

public class Zoo {
        private String nume;
        private String oras;
        private int nrangajati;
        private int capacitate_gazduire;
        private int nr_vietati;

    public Zoo(String nume, String oras, int nrangajati, int capacitate_gazduire,int nr_vietati) {
        this.nume = nume;
        this.oras = oras;
        this.nrangajati = nrangajati;
        this.capacitate_gazduire = capacitate_gazduire;
        this.nr_vietati=nr_vietati;

    }

    public Zoo() {
        this.nume =" ";
        this.oras =" ";
        this.nrangajati =-1;
        this.capacitate_gazduire =-1;
        this.nr_vietati=-1;
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
        return "Gradina Zoo din " + nume +
                " se afla in orasul " + oras +
                ", are " + nrangajati +" de angajati" +
                ", o capacitate maxima de gazduire de  "+ capacitate_gazduire+", din care "+nr_vietati+" locuri sunt ocupate";
    }
}

