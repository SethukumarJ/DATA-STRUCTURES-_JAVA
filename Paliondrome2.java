import java.util.*; 


public class Paliondrome2 {
   public static void main(String[]  args){
        int n = 50;

        for(int j= 0; j<=n; j++){

       
            Scanner in = new Scanner(System.in);
        String original, reverse= "";

        

        System.out.println("Enter the word to check whether it is paliondrome or not :");

        original = in.nextLine();

        int length = original.length();

        for(int i = length - 1; i>=0; i--)

        reverse = reverse + original.charAt(i);

        if(original.equals(reverse))
        System.out.println("The entered character is a paliondrome");
        else
        System.out.println("The entered charecter is't a paliondrome");


        

        }
    }
}
