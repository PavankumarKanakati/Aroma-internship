import java.util.Scanner;

public class GcdLcmFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter number 1 : ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        n2 = sc.nextInt();
        int t1=n1,t2=n2;
        while (n1 % n2 != 0){
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        System.out.println("The GCD is : "+n2);

        int lcm = (t1 * t2)/n2;
        System.out.println("The LCM is : "+lcm);
        

    }
}
