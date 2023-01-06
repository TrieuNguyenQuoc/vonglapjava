import java.util.Scanner;

public class vaylai {
    public static void main (String[] args){
        double money = 0;
        double month = 1;
        double interset_rate=1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sô tiền:");
        money = sc.nextDouble();
        System.out.println("Nhập tháng:");
        month = sc.nextDouble();
//        sc.nextLine();
        System.out.println("nhập lãi suất hàng năm theo tỷ lệ phần trăm:");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate/100/12) * 3;
        }
        System.out.println("tổng tiền lãi:" + total_interset);
    }
}
