import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        double tanksOfGas=0;
        double milesPerGallon=0;
        double costOfGasPerGallon=0;
        double milesYouWantToGo=0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of gallons of gas in the tank");
        if(in.hasNextDouble()){
            tanksOfGas = in.nextDouble();
            in.nextLine();
            System.out.println("enter the fuel efficiency in miles per gallon");
            if (in.hasNextDouble()){
                milesPerGallon = in.nextDouble();
                in.nextLine();
                System.out.println("Enter the price of gas per gallon ");
                if (in.hasNextDouble()){
                    costOfGasPerGallon =in.nextDouble();
                    in.nextLine();
                    double finished = (100 -tanksOfGas) / milesPerGallon * costOfGasPerGallon;
                    double finished1 = tanksOfGas * milesPerGallon;

                    System.out.println("to drive 100 miles it will cost "+finished);
                    System.out.println("your car can go "+finished1+ " miles until you need gas");

                }
                else{
                    trash = in.nextLine();
                    System.out.println("You must enter a valid number for the price of gas per gallon: "+trash);
                }
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number for the miles per gallon: "+trash);
            }
        }
        else{
            trash = in.nextLine();

            System.out.println("You must enter a valid number for the gallons of gas: "+trash);

        }





    }
}
