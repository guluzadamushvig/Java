package findsubstringcount;

import java.util.Scanner;

/**
 *
 * @author mushu
 */
public class FindSubstringCOunt {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            String strFind = sc.nextLine();
            int count = 0, fromIndex = 0;

            while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){

                count++;
                fromIndex =fromIndex + strFind.length() ;

            }

            System.out.println(count);
    }

}
