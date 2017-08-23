public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int HoraIni,int MinIni)
    {
        horas=HoraIni;
        minutos=MinIni;
    }
    
    public String tuTiempo()
    {
        String cadResultado="";
        cadResultado+=horas;
        cadResultado=cadResultado+":";
        cadResultado+=minutos;
        
        return cadResultado;
    }
}
/*
    public void TicTac()
    {
        if(
        */
    
    
        