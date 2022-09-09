import java.util.Scanner;



class Example1{
public static void main(String args[]){
System.out.println("U are welcome !!" );



}}




class Example2{
public static void main(String args[]){
	if(args.length==0){
		System.out.println("no input");
	}
	else{
		for (int i=0; i<args.length; i++){

			System.out.println("args["+i+"] = " + args[i]);

	}}	
}
}



class Example3{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	 int number = sc.nextInt();
	 String name= sc.next();
	for(int i=0; i<number; i++){
		System.out.println(name);
	}
}}