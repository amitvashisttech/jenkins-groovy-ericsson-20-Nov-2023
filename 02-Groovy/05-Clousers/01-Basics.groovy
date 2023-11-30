//1. A closure is a short anonymous block of code.
def c = { }

println c.class.name
println c instanceof Closure


// 2. sayHello

def sayHello = { name ->
    println "Hello, $name"
}
sayHello('Amit')

// 3. Num is supplied as an arugment & [->] Arrow is used to seprate the agrugment form the methord body

List nums = [1,4,7,4,30,2]
nums.each { num ->
    println num
}

// closures are objects & last param

def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10, { println it })
timesTen(3, { println it })

// So anytime a closure is the last argument to a method, you can remove these braces and put it outside of this.
// All this tells me is that this particular method took two arguments, One was a number which we passed in, and the second was a closure, So we didn't need to keep it inside of these braces, That's just a way, Groovy does it And it kind of cleans up a lot of of syntax.
timesTen(2) { 
    println it 
}

10.times { 
    println it
}


// Closures and Variables
// More formally, closures can refer to variables at the time the closure is defined.

class Example {     
   static void main(String[] args) {
      def str1 = "Hello";
      def clos = {param -> println "${str1} ${param}"}
      clos.call("World");
		
      // We are now changing the value of the String str1 which is referenced in the closure
      str1 = "Welcome";
      clos.call("World");
   } 
}

// Using Closures in Methods

// Closures can also be used as parameters to methods. In Groovy, a lot of the inbuilt methods for data types such as Lists and collections have closures as a parameter type.

// 1. We are defining a static method called Display which takes a closure as an argument.
// 2. We are then defining a closure in our main method and passing it to our Display method as a parameter

class Example { 
   def static Display(clo) {
      // This time the $param parameter gets replaced by the string "Inner"         
      clo.call("Inner");
   } 
	
   static void main(String[] args) {
      def str1 = "Hello";
      def clos = { param -> println "${str1} ${param}" }
      clos.call("World");
		
      // We are now changing the value of the String str1 which is referenced in the closure
      str1 = "Welcome";
      clos.call("World");
		
      // Passing our closure to a method
      Example.Display(clos);
   } 
}







import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}