import java.util.Scanner;
import java.util.ArrayList;

class LeaderArray{
    public static void leaderarray(int[] array)
    {
        int size= array.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[j]>array[i]){
                    break;
                }
                if(array[j]==array[size-1]){
                    result.add(array[i]);

                }
            }
        }
        result.add(array[size-1]);
        System.out.println(result);

    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        LeaderArray la=new LeaderArray();
        la.leaderarray(arr);


    }
}