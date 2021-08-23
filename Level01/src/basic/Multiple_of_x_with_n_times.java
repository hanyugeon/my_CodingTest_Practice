package basic;

public class Multiple_of_x_with_n_times {
    public long[] solution(int x, int n) {

        // 나의 풀이 (참고 : https://wooaoe.tistory.com/41)
        long[] answer = new long[n];
        long temp  = x;

        for(int i = 0; i < n; i++) {
            answer[i] = temp * (i + 1);
        }
        return answer;


        // 다른 풀이
        /*
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
        */

        // 첫날 후기 : 시발 나는 존나 멍청하다.
    }
}
