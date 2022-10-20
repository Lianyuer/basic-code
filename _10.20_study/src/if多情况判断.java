import java.util.Scanner;

public class if多情况判断 {
    public static void main(String[] args) {
        int ori_total = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的会员级别：");
        int level = sc.nextInt();
        if(level>0 && level<=3){
            if(level == 1){
                System.out.println("打9折");
                System.out.println("您需要付款" + ori_total*0.9 + "元");
            } else if (level == 2) {
                System.out.println("打8折");
                System.out.println("您需要付款" + ori_total*0.8 + "元");
            } else if (level == 3) {
                System.out.println("打7折");
                System.out.println("您需要付款" + ori_total * 0.7 + "元");
            } else{
                System.out.println("不打折");
            }
        }else {
            System.out.println("您输入的会员级别有误");
        }
    }
}
