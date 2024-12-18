

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
      int a = x1;
	  int b = x2;
	   if (b<0) {
	   for (int i=0; b<i; i--) {
	      a--;
	    }
	    }else{
	      for (int i=0; i<b; i++)
		{
		  a++;
		}
	    }
		
		return a; 

	}	

	
	public static int minus(int x1, int x2) {
		int a = x1;
		int b = x2;
		if (b<0) {
			for (int i=0; b<i; i--) {
			   a++;
			 }
			 }else{
			   for (int i=0; i<b; i++){
			   a--;
			 }
			 }

		return a;
	}


	public static int times(int x1, int x2) {
		int a = x1;
		int b = x2;
		int sumA = a;
        
		if (a==0 || b==0) {
			sumA = 0;
		}else if (a>0 && b>0) {	
		  for(int i=1; i<b; i++) {
		  sumA= plus(sumA,a);
		  }

		}else if (a<0 && b>0) {
		  for(int i=1; i<b; i++) {
		  sumA= plus(sumA,a);
		  }
		}else if (a>0 && b<0) {
          sumA = b;
		  for(int i=1; i<a; i++) {
			sumA= plus(sumA,b);
			}
		}else{ for(int i=-1; i>b; i--) {
			sumA= plus(sumA,a);
			}
			sumA = -sumA;
		}
			
		return sumA;

		}

	

	public static int pow(int x, int n) {
		int a = x;
		int b = n;
		int sumA= a;
		if (b==0) {
			sumA = 1;
			return sumA;
		}

		for(int i=0; i<b-1; i++) {
		  sumA= times(sumA, a);
		}
		return sumA;
	}

	public static int div(int x1, int x2) {
		int a = x1;
		int b = x2; 
		int sumA = b;
		int div = 1;
            if (a==0) {
			  div = 0;	
			}
			else if (a<0 && b<0) {
			   a = times(a, -1);
			   b = times(b, -1);
			while (sumA <= a-b) { 
			   div++;
			   sumA= times(div,b);
			}

			}else if (a<0 && b>0) {
			   a = times(a, -1);
			 while (sumA <= a-b) { 
			   div++;
			   sumA= times(div,b);
			}
			
			div= times(div, -1);

	       	}else if (a>0 && b<0) {
			   a = times(b, -1);
		    while (sumA <= a-b) { 
			   div++;
			   sumA= times(div,b);
		    }
		 
		    div= times(div, -1);

		     }else{
			  while (sumA <= a-b) { 
					div++;
					sumA= times(div,b);
			}
				
			}
			return div;	  
		}
	
	
	public static int mod(int x1, int x2) {
		int a = x1;
		int b = x2; 
		int solution = minus(a, times(b,div(a,b)));
	
		return solution;
	}	

	public static int sqrt(int x) {
	int a = x;
	int var = 0;
	int ans =0;
    ans = pow(var,2);

     while (ans < a) {
	 var++;
	 ans = pow(var, 2);
     
	}
    if (ans>a) {
	var = minus(var, 1);
		
	}
		return var;
	}  	
}  
