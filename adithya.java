class adithya{
	public static void main(String[]args){
		//String name = "adithya";
		int i=1;
		do{
			if(i%2==0)
             System.out.println(i);
			 i++;
		}while(i<=10);
		System.out.println("the numbers are even");
        
        i=10; 
		do{
			if(i%2!=0)
				System.out.println(i);
			    i--;
		}while(i>=1);
		System.out.println("the numbers are odd");
	} 
}