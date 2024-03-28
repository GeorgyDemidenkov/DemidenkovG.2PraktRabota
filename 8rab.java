import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите строку:");
        String input=sc.nextLine();
        String res=cases(input);
        System.out.println("Результат:"+res);
    }
    public static String cases(String input){
        int uppercase=0;
        int lowercase=0;

        for (char ch:input.toCharArray()){
            if (Character.isUpperCase(ch)){
                uppercase++;
            } else if (Character.isLowerCase(ch)){
                lowercase++;
            }
        }
        if (uppercase>lowercase){
            return input.toUpperCase();
        } else if (lowercase>uppercase){
            return input.toLowerCase();
        } else{
            return input.toLowerCase();
        }
    }
}
