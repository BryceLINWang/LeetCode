package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 司机调度 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Integer>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        String str;
        while (cin.hasNextInt()) {
            int incomeOfA = cin.nextInt();
            a.add(incomeOfA);
            int incomeOfB = cin.nextInt();
            b.add(incomeOfB);
            //Start coding -- Input Data
            if((str=cin.next())=="#"){
                break;
            }
        }
        System.out.println(a.get(a.size()-1));

    }
}
