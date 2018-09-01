/*chapter3.1
Программа, которая получает символы, введенные с клавиатуры, до тех пор, пока не встретится точка.
Сведения о количестве пробелов выводятся в конце программы.
 */
public class chapter3_1 {
    public static void main(String[] args)
            throws java.io.IOException {

        char entered_symbol;
        int num = 0;

        for(;;){
            entered_symbol = (char) System.in.read();
            if (entered_symbol == '.') break;
            if (entered_symbol == ' ') num++;
        }
        System.out.print(num);
    }
}
