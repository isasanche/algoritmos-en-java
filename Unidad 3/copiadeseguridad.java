

public class copiadeseguridad{
   public int calcularCapacidad(){
       int capacidaddeCDenblanco=700;
       int capacidadde1GB=1024;
       int infoaCopiar=5;
       int res=capacidadde1GB*infoaCopiar/capacidaddeCDenblanco;
       return res;
    }
}
