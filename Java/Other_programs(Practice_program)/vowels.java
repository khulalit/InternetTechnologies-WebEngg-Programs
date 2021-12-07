import java.util.Scanner;

public class vowels{
    static boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        String s = scanner.nextLine();
        scanner.close();
        // isvowel(s.charAt(0)) ? System.out.println("yes it is vowel") : System.out.println("not vowel");
        if(isvowel(s.charAt(0))){
            System.out.println("yes it is vowel");
        }
        else{
            System.out.println("not vowel"); 
        }
    }
}