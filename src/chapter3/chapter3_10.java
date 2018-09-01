package chapter3;

public class chapter3_10 {
    public static void main(String[] args)
            throws java.io.IOException {
        int changed = 0;
        char symbol;

        do {
            symbol = (char) System.in.read();
            if (symbol >= 'a' & symbol <= 'z'){
                symbol -= 32;
                System.out.println(symbol);
                changed++;
            }
            else if (symbol >= 'A' & symbol <= 'Z'){
                symbol += 32;
                System.out.println(symbol);
                changed++;
            }
        } while (symbol != '.');
        if (symbol == '.') System.out.println("Symbols changed: " + changed);
    }
}
