import java.util.Scanner;

public class calculator
{
   public static void main(String[] args)
   {
      float a, b, res=0;
      int choice;
      Scanner scan = new Scanner(System.in);
      
      while(true)
      {
         init();
         choice = scan.nextInt();
         
         switch(choice)
         {
            case 1:
               msg();
               a = scan.nextFloat();
               b = scan.nextFloat();
               res = add(a, b);
               break;
            case 2:
               msg();
               a = scan.nextFloat();
               b = scan.nextFloat();
               res = sub(a, b);
               break;
            case 3:
               msg();
               a = scan.nextFloat();
               b = scan.nextFloat();
               res = mul(a, b);
               break;
            case 4:
               msg();
               a = scan.nextFloat();
               b = scan.nextFloat();
               res = div(a, b);
               break;
            case 5:
               return;
            default:
               System.out.println("\nInvalid choice!");
               break;
         }
         System.out.println("\nResult = " +res+ "\n");
      }
   } 
   public static void init()
   {
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Exit");
      System.out.print("Enter Your Choice (1-5): ");
   }
   public static void msg()
   {
      System.out.print("\nEnter any Two Number: ");
   }
   public static float add(float x, float y)
   {
      return x+y;
   }
   public static float sub(float x, float y)
   {
      return x-y;
   }
   public static float mul(float x, float y)
   {
      return x*y;
   }
   public static float div(float x, float y)
   {
      return x/y;
   }
}