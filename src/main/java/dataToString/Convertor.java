package dataToString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertor {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    Date convertStringToDate(String date) throws ParseException {
        return formatter.parse(date);
    }
    String convertDateToString(Date date) {
        return formatter.format(date);
    }
}
