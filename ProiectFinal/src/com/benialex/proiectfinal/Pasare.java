package com.benialex.proiectfinal;

public class Pasare {
    private String _nume;
    private Double _inaltime;
    private Double _kg;
    public Pasare(String nume, Double inaltime, Double kg)
    {
        this._nume = nume;
        this._inaltime = inaltime;
        this._kg = kg;
    }
    public String toString(){
        return _nume+" "+_inaltime+" "+_kg;
    }
    public String getNume()
    {
        return this._nume;
    }
    public Double getInaltime()
    {
        return this._inaltime;
    }
    public Double getGreutate()
    {
        return this._kg;
    }
    public void setNume(String nume)
    {
        this._nume=nume;
    }
    public void setInaltime(Double inaltime)
    {
        this._inaltime=inaltime;
    }
    public void setGreutate(Double kg)
    {
        this._kg=kg;
    }
}
