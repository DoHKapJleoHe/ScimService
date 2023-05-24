package ru.nsu.fit.g20202.scimservice.mappers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter
{
    public static String dateToString(Date date)
    {
        String pattern = "yyyy-MM-dd";
        DateFormat df = new SimpleDateFormat(pattern);

        String newDate = df.format(date);

        return newDate;
    }

    public static Date stringToDate(String date) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = format.parse(date);

        return newDate;
    }
}
