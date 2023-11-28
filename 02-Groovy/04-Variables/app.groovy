// 1. A variable declaration tells the compiler where and how much to create the storage for the variable

class Var { 
   static void main(String[] args) { 
      // x is defined as a variable 
      String x = "Hello";
		
      // The value of the variable is printed to the console 
      println(x);
   }
}

// 2. The name of a variable can be composed of letters, digits, and the underscore character. 
class Varname { 
   static void main(String[] args) { 
      // Defining a variable in lowercase  
      int x = 5;
	  
      // Defining a variable in uppercase  
      int X = 6; 
	  
      // Defining a variable with the underscore in it's name 
      def _Name = "Amit"; 
		
      println(x); 
      println(X); 
      println(_Name); 
   } 
}

// 3. You can print the current value of a variable with the println function.

class Varprint { 
   static void main(String[] args) { 
      //Initializing 2 variables 
      int x = 5; 
      int X = 6; 
	  
      //Printing the value of the variables to the console 
      println("The value of x is " + x + "The value of X is " + X);  
   }
}