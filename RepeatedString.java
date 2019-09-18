import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] sr = s.toCharArray();
        long size = sr.length, sumremainder = 0, summultiply = 0, remainder = 0, multiply = 0, j = 0;
        if(size > 0){
            multiply = n/size;
            remainder = n%size;
        } else {
            return 0;
        }
        for(int i=0; i<size; i++){
            if(sr[i] == 'a'){
                if(j < remainder){
                    sumremainder++;
                }
                summultiply++;
            }
            j++;
        }
        if(remainder > multiply){
            return sumremainder;
        } else {
            return ((summultiply*multiply)+sumremainder);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
