import java.util.Calendar;

public class Fecha {
    int dia;
    int mes;
    int anio;

    public Fecha(){
        dia = Calendar.getInstance().get( Calendar.DAY_OF_MONTH );
        mes = Calendar.getInstance().get( Calendar.MONTH  )+1;
        anio = Calendar.getInstance().get( Calendar.YEAR );
    }

    @Override
    public String toString(){
        // return "Fecha: "+ "dia:"+ dia+ ", mes"+ mes + ".a\u00f1c="+ anio ; 
        return  "Fecha(day/month/year)"+ dia+"/" + mes + "/" + anio ;
    }


}
