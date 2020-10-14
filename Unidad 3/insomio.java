

public class insomio
{
   public int calculartiempo (){
       
       int horaDurmio=2;
       int mintdurmio=45;
       int horadesperto=11;
       int mintdesperto=25;
       int horadurmiomin=horaDurmio*60+mintdurmio;
       int horadespertomin=horadesperto*60+mintdesperto;
       int res=horadespertomin-horadurmiomin;
       return res;
   }
}
