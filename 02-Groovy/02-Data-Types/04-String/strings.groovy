// Working with Strings in Groovy


// Java :: 

char c = 'c'
println c.class

String str = "this is a string"
println str.class

// Groovy ::

// By Default Everything is a string

def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str2.class

// String interpolation

String name = "Amit"
String msg = "Hello " + name + "..."
println msg

String msg2 = "Hello ${name}"
println msg2

String msg3 = 'Hello ${name}'
println msg3

String msg4 = "We can evaulate expressions here: ${1 + 1}"
println msg4

// multiline strings

def aLargeMsg = """
A 
Msg
goes 
here and 
keeps going ${1+1}
"""

println aLargeMsg

// dollar slashy - help us to care of back slash ( $/..$)

def folder = $/C:\groovy\amit\foo\bar/$
println folder



