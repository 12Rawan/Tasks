import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
    
class Example1{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("YEAR : ");
		int Year = sc.nextInt();

		switch ( Year % 12 ){
			case 0 : System.out.println("monkey");
			break;

			case 1 : System.out.println("rooster");
			break;

			case 2 : System.out.println("dog");
			break;

			case 3 : System.out.println("pig");
			break;

			case 4 : System.out.println("rat");
			break;

			case 5 : System.out.println("Ox");
			break;

			case 6 : System.out.println("tiger");
			break;

			case 7 : System.out.println("rabbit");
			break;

			case 8 : System.out.println("dragon");
			break;

			case 9 : System.out.println("snack");
			break;

			case 10 : System.out.println("horse");
			break;

			case 11 : System.out.println("sheep");
			break;

		}





	}
}

//////////////////////////////////////////////////////////////////////////////////////////
class Example2{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int number_of_days = 0;
		String month_name = "Unknown";

		System.out.print("Month  ");
		int month = sc.nextInt();


		System.out.print("Year  ");
		int year = sc.nextInt();

		switch(month){
			case 1: month_name = "January";
			number_of_days = 31;
			break;

			case 2: month_name = "February";
			if((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0))){
				number_of_days = 29;
			}
			else{
				number_of_days = 28;
			}
			break;


			case 3: month_name = "March";
			number_of_days = 31;
			break;

			case 4: month_name = "April";
			number_of_days = 30;
			break;

			case 5: month_name = "May";
			number_of_days = 31;
			break;

			case 6: month_name = "June";
			number_of_days = 30;
			break;

			case 7: month_name = "July";
			number_of_days = 31;
			break;

			case 8: month_name = "August";
			number_of_days = 31;
			break;

			case 9: month_name = "September";
			number_of_days = 30;
			break;

			case 10: month_name = "October";
			number_of_days = 31;
			break;

			case 11: month_name = "November";
			number_of_days = 30;
			break;

			case 12: month_name = "December";
			number_of_days = 31;

		}
	
		System.out.print(month_name + "  " + year + " contains  " + number_of_days + "  DAYS\n");
	}}

	//////////////////////////////////////////////////////////////////////////////////////////////////

class Example3{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter  a,b,c  :  ");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
        double c = sc.nextDouble();
	  	
		double discriminant = b * b - 4.0 * a * c;
		if(discriminant < 0.0){
				System.out.println ("The equation has no real roots ");
			}

		else if( discriminant == 0){
				double r1 = - b / (2.0 * a);
				System.out.println( " The equation has one root :  " + r1);
			}
		else{
				double r1 = (- b + Math.pow(discriminant , 0.5)) / (2.0 * a);
				double r2 = (- b + Math.pow(discriminant , 0.5)) / (2.0 * a);
				System.out.println( " The equation has two roots  : " + r1 + " and " + r2);
			}
	
	}}
	/////////////////////////////////////////////////////////////////////////////////////


class Example4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number between 1 and 15: ");
    int num_lines = sc.nextInt();

    for (int row = 1; row <= num_lines; row++){

        for (int col = 1; col <= (num_lines-row); col++){
            System.out.print(" ");
        }
        for (int col= row; col >= 1; col--){
            System.out.print(col + "");
		}
           
        for(int col =2; col<= row; col++){
			System.out.print(col + "");
		}
              
    System.out.println();
    }
    }

}


	/////////////////////////////////////////////////////////////////////////////////

class  Example5 {

public static void main(String[] args) {
	final int num_of_primes = 50;
	final int num_of_primes_per_line = 10;
    int count = 0; // Count the number of prime numbers
    int number = 2; 

    System.out.println("The first 50 prime numbers are \n");



    while (count < num_of_primes) {

    boolean isPrime = true;

    for (int i = 2; i <= number / 2; i++) {

    if (number % i == 0) {
		isPrime = false; 

        break;    }}



   if (isPrime) {
	    count++; 

   if (count % num_of_primes_per_line == 0) {
	   System.out.println(number);    }

   else 
      System.out.print(number + " "); 

   }


    number++;

}}}

//////////////////////////////////////////////////////////////////

class Example6{
public static void main(String args[]){
	System.out.println("The four perfect numbers : ");

	int number ;
	for(int i=1; i<10000;i++){
		number = 0;
		for(int j =1; j<i; j++ ){
			if(i % j == 0)
			   number+=j;

		}

		if(i == number)
		   System.out.printf("%20d\n" , i );

	for(int n = 1; n<= 10000; n++){
		Boolean perfect_number = i == number;
	}}}}

///////////////////////////////////////////////////////////////////////


	
class Example7 {

    public static void main(String args[]) {
        int arr[] =  new int[1000];
        Random rand = new Random();

        int maximum = 0;
        int minimum = arr[0];


        for(int i = 0; i < 10; i++) {
            int Random_num = rand.nextInt(10000);
            arr[i] = Random_num;

    
            if (Random_num>maximum) {
                maximum = Random_num;
            }

            if (i > 0) {
                if (Random_num < arr[0]) {
                    minimum = Random_num;
                }
            }
        }
		System.out.println("Maximum number  : " + maximum ); 
        System.out.println("Minimum number  : " + minimum );
              
    } 
}

