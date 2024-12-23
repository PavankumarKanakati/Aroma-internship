import java.util.Random;
public class DiceRolling {
    public static void main(String[] args) {
        int a;
        Random roll = new Random();
        a = roll.nextInt(6);
        if (a!=0){
        System.out.println("The rolled dice number is : "+a);
        }
    }
}
