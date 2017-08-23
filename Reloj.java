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
    
    public void ticTac()
    {
        minutos +=1;
        if(minutos==60)
        {
            minutos=0;
            horas+=1;
        }
        if(horas==24)
        {
            horas = 0;
        }
    }
}
