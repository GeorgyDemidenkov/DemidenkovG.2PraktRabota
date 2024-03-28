import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку 1");
        String first=scanner.nextLine();
        System.out.println("Введите строку 2");
        String second=scanner.nextLine();
        System.out.println(check(first, second));
    }
    public static boolean check(String first, String second){
        return first.endsWith(second);
    }
}
