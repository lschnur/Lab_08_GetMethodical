import javax.xml.crypto.Data;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int Day = 0;
        int Month = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);
        int Year = SafeInput.getRangedInt(in, "Enter your birth year", 1950,2010);




        switch(Month)
        {
            case 1,3,5,7,8,10,12:
                 Day = SafeInput.getRangedInt(in, "Enter your birth date ", 1, 31);
            case 2,4,6,9,11:
                 Day = SafeInput.getRangedInt(in, "Enter your birth date ", 1,30 );


        }


        System.out.println(" Your birthday is "+ Month+ "/" + Day+ " "+ Year);

    }
}
