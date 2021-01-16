import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        // write your code with StringBuilder here
        StringBuilder longString = new StringBuilder();
        for(String str : strings){
            StringBuilder sb = new StringBuilder(str);
            for(int i=0; i<sb.length(); i++){
                if((Character.isDigit(sb.charAt(i))) || sb.charAt(i) == ' ') {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
            longString.append(sb);
        }
        return longString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}