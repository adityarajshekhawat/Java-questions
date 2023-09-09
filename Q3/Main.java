/*
 * Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1: 
 and  is even, so it isn't weird. Thus, we print Not Weird.
 */


package Q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n%2 != 0){
            System.out.println("weird");
        }
        else if (n%2 == 0 && n>2 && n<5 )
            System.out.println("not weird");

        else if (n%2 == 0 && n>6 && n<=20 )
            System.out.println("weird");

        else if (n%2 == 0 && n>20 )
            System.out.println("not weird");
        
        scan.close();
    }
}
