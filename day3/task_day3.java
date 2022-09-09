import java.util.Scanner;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Example1_way1{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the sentence : ");
	String sentence = sc.nextLine();

	System.out.println("Enter the word : ");
	String word = sc.nextLine();

	String tmp[] = sentence.split(" ");
	int counter = 0;

	for(int i=0; i<tmp.length; i++){
		if(word.equals(tmp[i])){
			counter++;
		}
		    }

    System.out.println("The sentence is : " + sentence);
	System.out.println("The word is : " + word + " occurs " + counter + "  times above the sentence");
	
}}

////////////////////////////////////////////////////////////////////////

class Example1_way2{
public static void main(String args[]){


	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the sentence : ");
	String sentence = sc.nextLine();

	System.out.println("Enter the word : ");
	String word = sc.nextLine();
	
	
	System.out.println(sentence.indexOf(word));


}}

/////////////////////////////////////////////////////////////////////

class String_Tokenizer{
	public static int countWords(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return 0;
		} 
		StringTokenizer tokens = new StringTokenizer(sentence);
		return tokens.countTokens(); 
	}


	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the Sentence : ");
		String sentence = sc.nextLine();

		System.out.println("The Sentence is : " + sentence);
		System.out.println("Number of words : " + countWords(sentence));



}}

/////////////////////////////////////////////////////////////////////

class Example2_BigInteger{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 2 BigIntegers :  ");
	BigInteger First_Integer = sc.nextBigInteger();
	BigInteger second_Integer = sc.nextBigInteger();

	BigInteger multiplication = First_Integer.multiply(second_Integer);
	BigInteger addition = First_Integer.add(second_Integer);

	System.out.println("Multiplication of 2 BigIntegers is : " + multiplication);
	System.out.print(System.lineSeparator());
	System.out.println("Addition of 2 BigIntegers is :  " + addition);

}}

/////////////////////////////////////////////////////////////////////

class SwapNumbers{
	int x , y;

public void swap_numbers(SwapNumbers n){
	int tmp;

	tmp = n.x;
	n.x = n.y;
	n.y = tmp;
}

public static void main(String args[]){
	SwapNumbers sn = new SwapNumbers();
	Scanner sc = new Scanner (System.in);

	System.out.print("Enter first number : ");
	sn.x = sc.nextInt();
	System.out.print("Enter second number : ");
	sn.y = sc.nextInt();


	sn.swap_numbers(sn);
	System.out.println("After swapping :  x = " +sn.x +" , y = " +sn.y );

}}










