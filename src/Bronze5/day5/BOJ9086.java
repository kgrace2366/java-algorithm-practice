package Bronze5.day5;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String text = sc.next();
            String answer = text.charAt(0) + text.substring(text.length() - 1);
            System.out.println(answer);
        }
    }
}
