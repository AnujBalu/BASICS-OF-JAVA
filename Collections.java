
import java.util.*;
import java.lang.String.*;
class Collections{
    public static void main(String args[]){
        
        List<String> col = new ArrayList <String>();
        
        col.add("Ram");
        col.add("Senthil");
        col.add("Alice");
        Scanner s = new Scanner(System.in);
        String user = s.nextLine();
        col.add(user);
        System.out.println(col);
        
        List<String> col2 = new ArrayList <String> ();
        col2.addAll(col);
        col2.add("Walter");
        System.out.println(col2);
        
        col2.remove("Senthil");
        System.out.println(col2);
        
        String a = col2.get(1);
        System.out.println(a);
        
        System.out.println(col2.contains("Senthil"));
    }
}
