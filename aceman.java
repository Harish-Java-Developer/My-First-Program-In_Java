import java.util.Scanner;


class aceman{
    public static void modulus(int j,int n){
        Scanner adhi = new Scanner(System.in);
        int harish = adhi.nextInt();
        System.out.println("first man is :"+j);
        System.out.println("secomd man is:"+n);
        int modulus = j/n;
        System.out.println(modulus);
    }
}