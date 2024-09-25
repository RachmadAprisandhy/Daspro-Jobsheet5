import java.util.Scanner;

public class PemilihanHari19{

    public static void main (String [] args){

        String Dayname,DayTipe;

        Scanner hari = new Scanner(System.in);

        System.out.println("Input Day Name: ");
        Dayname = hari.nextLine();

        switch(Dayname.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":

                DayTipe = "weekday";
                break;
            case "saturday":
            case "sunday":
                DayTipe = "weekend";
                break;
            default :
                DayTipe = "invalid day name";


        }
        System.out.println(Dayname + " is a " + DayTipe);

    }
}

