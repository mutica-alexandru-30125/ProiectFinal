package com.benialex.proiectfinal;

public class Pasare extends Vietate{
    private String _nume;
    private Double _inaltime;
    private Double _kg;
    private int nrPicioare;

    public Pasare(String nume, Double inaltime, Double kg)	//Constructori
    {
        this._nume = nume;
        this._inaltime = inaltime;
        this._kg = kg;
        this.nrPicioare = super.nrPicioare();
    }
    public Pasare()
    {
        this._nume = "";
        this._inaltime = 0.0;
        this._kg = 0.0;
    }

    public String toString(){	//toString
        return "Nume: "+_nume+"; inaltime: "+_inaltime+"; greutate: "+_kg+" si are "+nrPicioare+" picioare!";
    }
    public String getNume(){	//Metode get
        return this._nume;
    }
    public Double getInaltime(){
        return this._inaltime;
    }
    public Double getGreutate(){
        return this._kg;
    }

    public void setNume(String nume){	//Metode set
        this._nume=nume;
    }
    public void setInaltime(Double inaltime){
        this._inaltime=inaltime;
    }
    public void setGreutate(Double kg){
        this._kg=kg;
    }
}