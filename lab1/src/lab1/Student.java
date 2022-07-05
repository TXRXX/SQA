package lab1;

import java.util.Scanner;

public class Student {

    public int main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER STUDENT ID: ");
        String stdId = sc.next();
        String [] newStdId = stdId.split("-");
        String usageStdId = newStdId[0];
        int StdIdNum = Integer.parseInt(usageStdId);
        StdIdNum+=5;
        System.out.print(StdIdNum);

        return StdIdNum;
        
    }

}
