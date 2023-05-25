import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(generateRandomPassword(n));
    }
    public static String generateRandomPassword(int length){
        if(length<8){
            return "Password length can't less then 8";
        }

        String specialChar = "!@#$%^&*";
        String combined = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*";

        String password = "";
        Random ran = new Random();

        password+=(char)(ran.nextInt()+'A');
        password+=(char)(ran.nextInt()+'a');
        password+=ran.nextInt(10);
        password+=specialChar.charAt(ran.nextInt(specialChar.length()));

        for(int i=4;i<=length;i++){
            password+=combined.charAt(ran.nextInt(combined.length()));
        }

        return password;
    }
}
