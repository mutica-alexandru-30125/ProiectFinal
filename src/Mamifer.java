public class Mamifer {
    private String _nume;
    private String _inaltime;
    private int _kg;
    public Mamifer(String nume, String inaltime, int kg)	//Constructor
    {
        this._nume = nume;
        this._inaltime = inaltime;
        this._kg = kg;
    }
    public Mamifer()	//Constructor
    {
        this._nume = " ";
        this._inaltime = " ";
        this._kg = -1;
    }
    public String getNume()									//metode get
    {
        return this._nume;
    }
    public String getInaltime()
    {
        return this._inaltime;
    }
    public int getGreutate()
    {
        return this._kg;
    }
    public void setNume(String nume)						//metode set
    {
        this._nume=nume;
    }
    public void setInaltime(String inaltime)
    {
        this._inaltime=inaltime;
    }
    public void setGreutate(int kg)
    {
        this._kg=kg;
    }
    public String toString(){
        return _nume+" "+_inaltime+" "+_kg;
    }
}
