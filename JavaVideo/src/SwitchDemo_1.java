import java.util.Scanner;
public class SwitchDemo_1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
                default:
                    System.out.println("输入错误");
        }
    }
}
