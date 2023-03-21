import java.util.*;
import java.lang.Math.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    static Calculator calc = new Calculator();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------- Calculator --------------------");
        while(true)
        {
            System.out.println("List of operations");
            System.out.println("1. Square root of a number");
            System.out.println("2. Factorial of a number");
            System.out.println("3. Natural logarithm of a number");
            System.out.println("4. Power of a number");
            System.out.println("5. Exit");

            System.out.print("Select one of the above number to do the respective operation : ");
            int input = sc.nextInt();

            if(input == 1)
            {
                System.out.print("Enter the value x to find its square root: ");
                int x = sc.nextInt();
                System.out.println("Square root of number x is " + Double.toString(calc.sqroot(x)) + ".");
            }
            else if(input == 2)
            {
                System.out.print("Enter the value x to find its factorial: ");
                int x = sc.nextInt();
                System.out.println("Factorial of number x is " + Long.toString(calc.factorial(x)) + ".");
            }
            else if(input == 3)
            {
                System.out.print("Enter the value x to find its natural logarithm: ");
                int x = sc.nextInt();
                System.out.println("Natural logarithm of number x is " + Double.toString(calc.lnx(x)) + ".");
            }
            else if(input == 4)
            {
                System.out.println("Enter the values x and b to find x power b: ");
                System.out.print("x: ");
                int x = sc.nextInt();
                System.out.print("y: ");
                int b = sc.nextInt();
                System.out.println("Value of x power b is " + Long.toString(calc.power(x, b)) + ".");
            }
            else if(input == 5)
            {
                break;
            }

            System.out.println("------------------------------------------------------------\n\n");
        }
        sc.close();

    }


    public double sqroot(int x)
    {
        if(x < 0)
        {
            logger.info("[ERROR - SQROOT] - negative number is given");
        }
        logger.info("[SQROOT] - " + x);
        double ret = 0;
        ret = Math.sqrt(x);
        logger.info("[RESULT - SQROOT] - " + ret);
        return ret;
    }

    //Factorial
    public long factorial(int x)
    {
        if(x < 0){
            logger.error("[ERROR - FACTORIAL] - negative number is given for finding the factorial");
            return -1;
        }
        logger.info("[FACTORIAL] - " + x);
        long ret = 1;
        for(int i=1; i<=x; i++)
        {
            ret *= i;
        }
        logger.info("[RESULT - FACTORIAL] - " + ret);
        return ret;
    }

    public double lnx(int x)
    {
        if(x < 0)
        {
            logger.error("[ERROR - LOG] - negative number is given to find its natural logarithm");
        }
        logger.info("[LOG] - " + x);
        double ret = Math.log(x);
        logger.info("[RESULT - LOG] - " + ret);
        return ret;
    }

    public long power(int x, int b)
    {
        logger.info("[POWER] - " + x + ", " + b);
        long ret = 1;
        for(int i=1; i<=b; i++)
        {
            ret *= x;
        }
        logger.info("[RESULT - POWER] - " + ret);
        return ret;
    }
}