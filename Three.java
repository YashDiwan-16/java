import java.util.*;
public class Three
{
public static void main (String args[])
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a = scanner.nextInt();
System.out.print("Enter the value of b: ");
int b = scanner.nextInt();
int x = mul(a, b);

int sum = calsum(x);
while (sum >= 10)
{
x = sum;
sum = calsum(x);
}
System.out.println("Result: " + sum);
}


 private static int mul(int a, int b)
 {
 int result = 1;
 for (int i = a; i <= b; i++) 
{
 result *= i;
  }
 return result;
  }



private static int calsum(int number)
 {
        int s = 0;
        while (number != 0)
 {
            s += number % 10;
            number /= 10;
        }
        return s;
    }
}