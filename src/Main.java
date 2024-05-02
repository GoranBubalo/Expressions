
public class Main {
//expression lesson 
	public static void main(String[] args) {
		
		// expression = Operands & operators 
		// - > computation
		// - > construct made out of variables, operators and method invocations = > evaluates to a single value 
		// operands = values, variables, numbers, quantity ( operandi ) 
		// operators = + - * / %  ( operatori ) 
		
		int friends = 10;
		
		//addition
		friends = friends + 1; 
		System.out.println(friends);
		
		//subtraction
		friends = friends - 1; 
		System.out.println(friends);
		
		//multiplication
		friends = friends * 2;
		System.out.println(friends);
		
		//division
		friends = friends / 2;
		System.out.println(friends);
		
		//MODULUS (%)- > it gives you the remainder of any division that occurs
		friends = friends % 3;
		System.out.println(friends);
		
		//SHORT (INCREMENT)
		friends++;
		System.out.println(friends);
		//DECREMENT
		friends--;
		System.out.println(friends);
		
		//DOUBLE VALUE
		double friend = 10;
		friend = (double) friend / 3;
		System.out.println(friend);
		
		//Convenient  way to add a value to an existing variable and assign the new 
		//value to the same variable 
		friend+=9; // friend = friend + 9;
		System.out.println(friend);
		
		
		--friend;
		System.out.println(friend);
	}

}
