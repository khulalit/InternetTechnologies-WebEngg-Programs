import java.util.Arrays;
import java.util.Scanner;
public class Convert {
    static char[] stringToChar(String input){
        char[] ch = new char[input.length()]; 
        for (int i = 0; i <input.length(); i++) {
            ch[i] = input.charAt(i);
        }
        return ch;
    }
    static String charToString(char input[]){
        String output = String.valueOf(input);
        return output;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = new String(scanner.nextLine());

        System.out.println("char array for the given string is : "+Arrays.toString(stringToChar(s)));
       
        System.out.println("Enter char array size");
        int size = scanner.nextInt();
        System.out.println("Size typed :"+size);
        char[] input = new char[size];

        System.out.println("Enter array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            input[i] = sc.next().charAt(0);
        } 
        System.out.println(Arrays.toString(input));
        System.out.println("String for the char array is : "+ charToString(input));

        sc.close();
        scanner.close();
    }
}