
package findspecialstringbeginindex;

import java.util.Scanner;

public class FindSpecialStringBeginIndex {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //scanner.next();
        String str2 = str.toLowerCase();
        String s = "the";

        if(str2.contains("the")) {
            System.out.println(str2.indexOf(s));
        }else{
            System.out.println("-1");
        }
    }
    
}
