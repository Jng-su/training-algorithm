import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 2;
        while (N > 1) {
            if (N % i == 0) {
                System.out.println(i);
                N /= i;
            } else {
                i++;
            }
        }
    }
}
