

public class Autobus
{
    public int valordelpase(){
        int valordelPase=45;
        int valordelpaseencentavos=valordelPase*100;
        int valordepasajeenpesos=1;
        int valordepasajeencentavos=80;
        int valordeCadaViaje=valordepasajeenpesos*100+valordepasajeencentavos;
        int res=valordelpaseencentavos/valordeCadaViaje;
        return res;
    }
}
