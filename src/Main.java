import java.util.Scanner;

public class Main {
    public static int carpma(int x, int y) {
        if(y==0) {
            return 0;
        }else {
            return x + carpma(x,y-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(carpma(3,5));

    }
}