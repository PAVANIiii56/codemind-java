import java.util.Scanner;

class seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
        Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 switch(n)
 {
 case 4:
 case 5:
 case 6:
  System.out.println("Summer");
  break;
 case 7:
 case 8:
 case 9:
 case 10:
 case 11:
	 System.out.println("Rainy");
	 break;
 case 12:
 case 1:
	 System.out.println("Winter");
	      break;
 case 2:
case 3:
    System.out.println("Spring");
    break;
	      default:
	    	  System.out.println("-1");
	    	  break;
 } 
	sc.close(); 
 
	}

}
