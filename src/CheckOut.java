import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {

        boolean Done;
        double total =0;

        do {


            Scanner in = new Scanner(System.in);
            double item = 0;
            item = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.01, 9.99);
            total = total + item;

              Done = SafeInput.getYNConfirm(in, "Are you done entering items");


        }while(!Done);
        System.out.println("You said your total was "+ total);
    }
}
