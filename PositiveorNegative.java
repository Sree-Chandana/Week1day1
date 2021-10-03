package code1;

public class PositiveorNegative {

	public static void main(String[] args) {
		int a=-10;
		//for find the positive number

		if (a>0) 
		{ 
			System.out.println("The given number is Postive");

		} 
		// for finding the negative numbers 
		else if (a<0) 
		{
			System.out.println("The given number is Negative");
		} 
		//for finding the neutral
		else if(a==0)
		{ 
			System.out.println("The given number is Neutral"); 
		}


		int b=-1*a;
		if (a<0){
			System.out.println("The negative number is converted to Postive = " +b);

		}
		else {
			System.out.println("Number is " +a);
		}



	}

}
