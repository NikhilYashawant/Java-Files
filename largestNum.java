import java.util.Scanner;
public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println("largest number is" + a);
        // }else if(b>a && b>c){
        //     System.out.println("largest number is" + b);
        // }else{
        //     System.out.println("largest number is" + c);
        // }
        // sc.close();

        int largest = Math.max(a,Math.max(b,c));
        System.out.println("largest number is:" + largest);

        }
    }
    

