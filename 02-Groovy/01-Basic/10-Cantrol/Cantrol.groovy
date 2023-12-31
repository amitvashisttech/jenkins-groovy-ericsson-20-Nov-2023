//1. if 
if( true ) 
  println "value is true"

// false | null | empty strings | empty collections
if( false )
  println "value is false" 

if( !false )
  println "value is false"


// 2. String with if  
String name = "Amit"
if( name ) 
  println "name has a value"  
  
String last = ""
if( last ) 
  println "last has a value"
  
  
//3.  if/else 
def x = 5
if( x  == 10 ){ 
  println "x is 10"
} else {
  println "x is NOT 10"
}

//4.  classic while
def i = 1
while( i <= 10 ) {
    println i
    i++
}


//5. for in list
def list = [1,2,3,4]
for( num in list ){
    println num
}

//6.  closure
def list2 = [1,2,3,4]
list2.each { println it }

//7.  Switch
def myNumber = 1

switch(myNumber) {

    case 1:
        println "number is 1"
        break
    default:
        println "we hit the default case"    

}