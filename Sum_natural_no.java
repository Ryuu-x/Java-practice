import java.util.Scanner;

public class Sum_natural_no 
{
    public static void main(String[] args)
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = s.nextInt();
        int sum = addNumbers(num);
        System.out.println("Sum of " + num + " natural numbers: " + sum);
    }

    public static int addNumbers(int num)
    {
        if(num != 0)
            return num + addNumbers(num - 1);

        else 
            return num;
    }
}
