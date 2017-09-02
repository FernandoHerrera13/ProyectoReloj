public class Reloj
{
    private int horas;
    private int minutos;
    
    /**El constructor inicializa las horas y minutos con los parametros que nosotros asignamos
     * @param horas
     * @param minutos
     */
    public Reloj(int horas,int minutos)
    {
        this.horas=horas;
        this.minutos=minutos;
    }
    /**Nos permite conocer nuestro tiempo actual
       *@return Regresa un string que muestra la hora y los minutos definidos
       */
    public String tuTiempo()
    {
        String cadResultado="";
        cadResultado+=horas;
        cadResultado=cadResultado+":";
        cadResultado+=minutos;
        
        return cadResultado;
    }
    /**Incrementa en un minuto nuestro Tiempo actual*/
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
