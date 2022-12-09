import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

class Strings{
    public static void main(Strings args[]){
        
        StringTokenizer st = new StringTokenizer("Hello guys, I am yours crazy newbie", " ");
        
        // count the Tokens in the sentance
        System.out.println("No.of tokens before using nextToken(): "+ st.countTokens());
        
        // Printing the splited words
        while (st.hasMoreTokens()){
            System.out.println("Tokens are: "+ st.nextToken());
        }
        
        // count the Tokens in the sentance
        System.out.println("No.of tokens After using nextToken(): "+st.countTokens());
        
        // Getting tokenizer from user to StringTikenizer
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String user = sn.nextLine(); // getting String from user
        
        StringTokenizer st2 = new StringTokenizer(user," ");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken(",")); // the Spliting position can be decided while creating ( StringTokenizer() ) or inside while loop in ( nextToken() )         }
    }
}
