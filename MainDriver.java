import java.util.Scanner;
class MainDriver{
	public static void main (String[] args){
		Scanner value = new Scanner(System.in);
		boolean data = true;
		do{	
	    System.out.println("Select your Number");
		System.out.println("..................");
	    System.out.println("1.add");
	    System.out.println("2.sub");
	    System.out.println("3.mul");
	    System.out.println("4.div");
	    System.out.println("5.exit");
        int choice = value.nextInt();
        switch(choice){
              case 1:{
              	int firstNo = value.nextInt();
              	int secondNo = value.nextInt();
              	int addition = Math.addExact(firstNo,secondNo);
              	System.out.println("your answer is "+addition);
              }

              break;
              case 2:{
              	int firstNo= value.nextInt();
              	int secondNo= value.nextInt();
              	int subtract = Math.subtractExact(firstNo,secondNo);
              	System.out.println("your answer is "+subtract);
              }
              break;
          case 3:{
                int firstNo= value.nextInt();
              	int secondNo= value.nextInt();
              	int multi = Math.multiplyExact(firstNo,secondNo);
              	System.out.println("your answer is "+multi);

          }
              break;
          case 4:{
          	int firstNo= value.nextInt();
              	int secondNo= value.nextInt();
              	int quotient = Math.floorDiv(firstNo,secondNo);
              	int remainder = Math.floorMod(firstNo,secondNo);
              	System.out.println("your quotient after div,remainder after div is "+quotient+","+remainder);

          }break; 
              case 5 : {
         	    data = false;
                System.out.println("get lost");  
              }
              break;
              default : {
                System.out.println("invalid choice");
              }
              break;
          }
        }while(data);
      }
}
