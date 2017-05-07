
import java.util.*;

public class Substring {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner g= new Scanner(System.in);
    System.out.println("enter a string");
    String string =g.next();			//inputting string value through console
    System.out.println("enter string to be found");
    String substring =g.next();			//inputting substring to be found through console
    if(string.contains(substring)){				//prints substring found using the inbuilt function
        System.out.println(substring +" substring found");
    }else{								//prints not found if the substring is not found
        System.out.println(substring+" substring not found");
    }
    
    }
    
}
