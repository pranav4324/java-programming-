
import java.util.*;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your name is :" + name);

    // Concatenation
    String firstname = "Pranav";
        String lastname = "Parate";
        String fullName = firstname + "@ " +lastname;
        System.out.println(fullName.length());

        // charAt
        for(int i =0 ; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // Compare

        if(firstname.compareTo(lastname)==0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        String sentence = "Pranav";
        String Pra = sentence.substring(0,sentence.length());
        System.out.println(Pra);
    }
}

