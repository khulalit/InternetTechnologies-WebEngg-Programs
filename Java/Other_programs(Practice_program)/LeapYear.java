import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
	    System.out.println("Enter the year");
        int year = scanner.nextInt();
        boolean leap = false;
        scanner.close();
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}