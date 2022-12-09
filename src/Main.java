import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        input();
    }

    private static void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter year: ");
        String string = s.nextLine();

        if(isNumeric(string))
            if(isLeapYear(string))
            System.out.println("Year " + string + " is leap");
            else
                System.out.println("Is not a leap year");
        else
            System.out.println("it is not a year!");



    }

    private static boolean isLeapYear(String str){
        int year = Integer.parseInt(str);
        if( year % 4 == 0 && year % 100 != 0)
            return true;
        else if(year % 100 == 0 && year % 400 == 0)
            return true;
        else
            return false;
    }

    private static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
