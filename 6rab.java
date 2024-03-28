import java.util.Scanner;
public class Main{
    private int[] numbers=new int[3];
    private int numel=0;
    public void insertnum(int num){
        if (numel<3){
            numbers[numel]=num;
            numel++;
        } else{
            int minIndex=findmin();
            numbers[minIndex]=num;
        }
    }
    public int findmin(){
        int minIndex=0;
        for (int i=1; i<numbers.length; i++){
            if (numbers[i]<numbers[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    public void printnum(){
        System.out.println("Ячейкa памяти:");
        for (int i=0; i<numel; i++){
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Main memoryCell=new Main();
        while (true){
            System.out.print("Введите число: ");
            int number=scanner.nextInt();
            memoryCell.insertnum(number);
            memoryCell.printnum();
        }
    }
}
