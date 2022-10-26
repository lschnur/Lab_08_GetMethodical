import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in,"Enter your SSN","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You said your SSN was "+ SSN);
        String UCID = SafeInput.getRegExString(in,"Enter your UC Id", "(M|m)\\d{5}");
        System.out.println("You said your Uc Id was "+ UCID);
        String MenuChoice = SafeInput.getRegExString(in,"Enter your menu choice","[OoSsVvQq]");

    }
}
