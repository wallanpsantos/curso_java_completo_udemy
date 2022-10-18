package section_11_data_calendario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DataCalendario {
    public static void main(String[] args) {

        /**
         * Data atual do sistema
         */
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(System.currentTimeMillis());
        System.out.println("Data formatada: " + dataFormato.format(data));

        /**
         * Hora atual do sistema
         */
        SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss");
        Date hora = new Date(System.currentTimeMillis());
        System.out.println("Hora formatada: " + horaFormato.format(hora));

        /**
         * Data e hora local
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Data e hora local: " + simpleDateFormat.format(date));

        /**
         * Data e hora atual UTC
         */
        SimpleDateFormat simpleDateFormatUTC = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        simpleDateFormatUTC.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date dateUTC = new Date();
        System.out.println("Data e hora UTC: " + simpleDateFormatUTC.format(dateUTC));

         /**
         * String para LocalDateTime Data e hora atual UTC
         */
        String dataEmString = "2022-10-18 10:00:30";
        LocalDateTime dataHora = LocalDateTime.parse(dataEmString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dataHora); // 2022-10-18T10:00:30

    }
}
