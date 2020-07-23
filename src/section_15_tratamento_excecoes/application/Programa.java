package section_15_tratamento_excecoes.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // creating a Calendar object
        Calendar c = Calendar.getInstance();

        // set Month
        // MONTH starts with 0 i.e. ( 0 - Jan)
        c.set(Calendar.MONTH, 21);

        // set Date
        c.set(Calendar.DATE, 07);

        // set Year
        c.set(Calendar.YEAR, 2020);

        // creating a date object with specified time.
        Date dateOne = c.getTime();

        // creating a date of object
        // storing the current date
        Date currentDate = new Date();
        System.out.println("dateOne: " + dateOne);
        System.out.println("currentDate: " + currentDate);
        System.out.print("Is currentDate after date one : ");

        // if currentDate is after dateOne
        System.out.println(currentDate.before(dateOne));

    }

}
