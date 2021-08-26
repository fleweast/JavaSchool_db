package dataToString;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Convertor convertor = new Convertor();
        String dateString = convertor.convertDateToString(date);
        Date dateDate = convertor.convertStringToDate("20/08/2021");
        System.out.println(dateString);
        System.out.println(dateDate);
    }
}
