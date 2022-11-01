package com.benialex.proiectfinal;

public class Peste {
    private String _nume;
    private Double _inaltime;
    private int _kg;

    private static Peste pestisor;

    public Peste(String nume, Double inaltime, int kg)	//Constructori
    {
        this._nume = nume;
        this._inaltime = inaltime;
        this._kg = kg;
    }
	public Peste()
    {
        this._nume = "";
        this._inaltime = 0;
        this._kg = 0;
    }

    public String toString(){	//toString
		return "Nume: "+_nume+"; inaltime: "+_inaltime+"; greutate: "+_kg;
    }
	
    public String getNume()		//Metode get
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
	
    public void setNume(String nume)	//Metode set
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
