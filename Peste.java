package com.benialex.proiectfinal;

public class Peste {
    private String _nume;
    private Double _inaltime;
    private int _kg;
    public Peste(String nume, Double inaltime, int kg)
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
    public int getGreutate()
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
    public void setGreutate(int kg)
    {
        this._kg=kg;
    }
}
