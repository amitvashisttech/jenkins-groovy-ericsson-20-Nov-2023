// Implicit parameter
def foo = {
    println it
}

foo('amit')


// No Paramters
def noparams = { ->
    println "no params..."
}

noparams()


// Multi Parameter Inputs 
def sayHello = { String first, String last ->
    println "Hello, $first $last"
}

sayHello("Amit","Kumar")

// default values
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

greet("Amit","Hello")
greet("Amit")

// var-arg
def concat = { String... args -> 
    args.join('')
}

println concat('abc','def')
println concat('abc','def','123','456')


def test = { String... args -> 
    args.join('')
}

println test('abc','def')
println test('abc','def','123','456')



// Ignore

def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)


