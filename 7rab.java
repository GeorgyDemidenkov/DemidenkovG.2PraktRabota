import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите строку:");
        String input=sc.nextLine();
        String[] words=input.split(" ");
        Set<String> unique=new LinkedHashSet<>(Arrays.asList(words));
        StringBuilder res=new StringBuilder();
        for (String word:unique){
            res.append(word).append(" ");
        }
        System.out.println("Результат:"+res.toString().trim());
    }
}
