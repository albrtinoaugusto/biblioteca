package services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Albertino Augusto
 */
public class SubscriptionPeriod
{

    public String getSubscriptionDate(String date, String period)
    {
        String finalDate = "";
        GregorianCalendar gc = new GregorianCalendar();
//        date = "20/07/2014";

//        String date = day + "/" + month + "/" + year;
        System.out.println(date);

        Integer duration = Integer.parseInt(period);

        Integer ano = Integer.valueOf(date.substring(6, 10));

        Date dataing = dateFormater(date);

        for (int i = 0; i < duration; i++)
        {
            gc.setTime(dataing);
            gc.add(Calendar.MONTH, duration);

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date d = (java.util.Date) gc.getTime();

            if (ano == gc.get(Calendar.YEAR))
            {
                gc.set(GregorianCalendar.YEAR, gc.get(GregorianCalendar.YEAR) + 1);
            }
            else
            {
                gc.set(GregorianCalendar.YEAR, gc.get(Calendar.YEAR));
            }

            if (i == duration - 1)
            {
                finalDate = df.format(d);
            }
        }
//        System.out.println(finalDate);
        return finalDate.replace("/", "-");
    }

    public String getSubscriptionDate(String day, String month, String year, String period)
    {
        String finalDate = "";
        GregorianCalendar gc = new GregorianCalendar();
//        String data = "20/07/2014";

        String data = day + "/" + month + "/" + year;
        System.out.println(data);

        Integer duration = Integer.parseInt(period);

        Integer ano = Integer.valueOf(data.substring(6, 10));

        Date dataing = dateFormater(data);

        for (int i = 0; i < duration; i++)
        {
            gc.setTime(dataing);
            gc.add(Calendar.MONTH, duration);

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date d = (java.util.Date) gc.getTime();

            if (ano == gc.get(Calendar.YEAR))
            {
                gc.set(GregorianCalendar.YEAR, gc.get(GregorianCalendar.YEAR) + 1);
            }
            else
            {
                gc.set(GregorianCalendar.YEAR, gc.get(Calendar.YEAR));
            }

            if (i == duration - 1)
            {
                finalDate = df.format(d);
            }
        }
//        System.out.println(finalDate);
        return finalDate.replace("/", "-");
    }

    private Date dateFormater(String date)
    {
        try
        {
            String temp = date;
            temp = temp.replace("/", "").trim();

            if (temp == null || temp.trim().isEmpty())
            {
                return null;
            }
            else
            {
                SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
                return new Date(formater.parse(date).getTime());
            }
        }
        catch (ParseException e)
        {

        }

        return null;
    }

    public String dayToEndSubscription(int days)
    {
        String date = "";
        
        DateTime dateTime = new DateTime();

        int today = dateTime.getDayInt();
        int thisMonth = dateTime.getMonthInt();
        int thisYear = dateTime.getYear();

        for (int i = 0; i < days; i++)
        {
            
            if (thisMonth == 2 && today == 29 || thisMonth == 2 && today == 28)
            {
                today = 1;
                thisMonth++;
            }
            
            if (thisMonth == 4 && today == 30)
            {
                today = 1;
                thisMonth++;
            }
            
            if (thisMonth == 6 && today == 30)
            {
                today = 1;
                thisMonth++;
            }
            
            if (thisMonth == 9 && today == 30)
            {
                today = 1;
                thisMonth++;
            }
            
            if (thisMonth == 11 && today == 30)
            {
                today = 1;
                thisMonth ++;
            }
            
            if (thisMonth == 12)
            {
                thisMonth = 1;
                thisYear++;
            }

            today++;
        }

        return dateTime.getDay(today) + "-" + dateTime.getMonth(thisMonth) + "-" + thisYear;
    }

//    public static void main(String[] args) {
//        new SubscriptionPeriod().getSubscriptionDate(new DateTime().getDateDash(), 0 + "");
//    }
}
