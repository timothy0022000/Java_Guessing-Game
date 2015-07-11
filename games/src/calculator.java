public class calculator {

	public static void main (String [] agrs){
		
		if (agrs.length != 3){
			System.out.println( "Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		int result = 0;
		
		switch (agrs[1].charAt(0)){
		
		case '+' : result = Integer.parseInt(agrs[0]) + 
							Integer.parseInt(agrs[2]);
		
		case '-' : result = Integer.parseInt(agrs[0]) -
							Integer.parseInt(agrs[2]);
		
		case '*' : result = Integer.parseInt(agrs[0]) *
							Integer.parseInt(agrs[2]);
		
		case '/' : result = Integer.parseInt(agrs[0]) /
							Integer.parseInt(agrs[2]);
		}
		
		// Display result
	    System.out.println(agrs[0] + ' ' + agrs[1] + ' ' + agrs[2]
	      + " = " + result);
		
	}
}
