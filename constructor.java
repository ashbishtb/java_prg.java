public class constructor {
    int x;
    int y;
    public constructor()          // default constructor(no value is passed and it is automatically created if you don't create)
    {
        System.out.println("This is default constructor\n");
    }
    public constructor(int a,int b){           // paramaterized constructor(we pass values in parameterized constructor)
        x = a;
        y = b;
    }
    void show_result()
    {
        System.out.println("two values are : "+ x+" , "+y);
    }

    public static void main(String[] args)
    {
        constructor c1 = new constructor(12,23);
        c1.show_result();
        constructor c2 = new constructor();
    }
}
