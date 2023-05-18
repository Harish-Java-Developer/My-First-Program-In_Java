class strong{
    public static void main(String [] args){
        int num,oriNum,i,sum,rem,fact;
        Scanner value = new Scanner(System.in);
        num = value.nextInt();
        oriNum = num;

        while(num>0){
            rem = num%10;
            System.out.println(rem);
        }
    }
}