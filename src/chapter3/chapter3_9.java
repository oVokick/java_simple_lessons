package chapter3;

public class chapter3_9 {
    public static void main(String[] args) {
        int num = 1;

        for (;;){
            System.out.print(num + " ");
            num *= 2;
            if (num > 1000) break;
        }
    }
}
