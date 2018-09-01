//Chapter 2
//Программа, которая находит простые числа в пределах от 2 до 100.
public class chapter2 {
    public static void main(String[] args){
        System.out.print("2 ");
        for (int i = 3; i <= 200; i++){
            for (int y = 2; y < i; y++){
                if (i % y == 0){
                    break;
                }
                else if (y == (i-1)){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
