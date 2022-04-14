import java.util.Scanner;
class new_one
{
    public static void main(String[] args)
    {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = inputUser.nextInt();
        a = a+10;
        System.out.println("The new value is : "+a);
    }
}
