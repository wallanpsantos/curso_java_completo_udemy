package section_11_data_calendario;


import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarioCalendar {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat simpleData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleHora = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Data e Hora: " + simpleDateFormat.format(date));
        System.out.println("Data: " + simpleData.format(date));
        System.out.println("Hora: " + simpleHora.format(date));
        System.out.println("");

        /**
         * Adicionando mais hora
         */
//        Calendar calendar1 = Calendar.getInstance();
//        calendar1.setTime(date);
//        calendar1.add(Calendar.HOUR_OF_DAY, 3); // 3 hora a mais na hora atual
//        date = calendar1.getTime();
//
//        System.out.println("Add 3 horas: " + simpleDateFormat.format(date));

        /**
         * Obtendo determinado tempo da Data
         */
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);

        Integer hora = calendar2.get(Calendar.HOUR);
        Integer minuto = calendar2.get(Calendar.MINUTE);
        Integer segundos = calendar2.get(Calendar.SECOND);

        System.out.println("Data e hora atual separado");
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Segundo: " + segundos);
    }
}
