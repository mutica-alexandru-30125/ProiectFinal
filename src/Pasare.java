public class Pasare {
    private String _nume;
    private String _inaltime;
    private String _kg;
    public Pasare(String nume, String inaltime, String kg)
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
    public String getInaltime()
    {
        return this._inaltime;
    }
    public String getGreutate()
    {
        return this._kg;
    }
    public void setNume(String nume)
    {
        this._nume=nume;
    }
    public void setInaltime(String inaltime)
    {
        this._inaltime=inaltime;
    }
    public void setGreutate(String kg)
    {
        this._kg=kg;
    }
}
