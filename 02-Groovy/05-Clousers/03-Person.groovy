class Person {
    String name
    int age
}

def people = [
    new Person(name:"Amit", age:35),
    new Person(name:"John", age:50),
    new Person(name:"Ricky", age:25)
]

assert people 
     .findAll {it.age < 40}
     .collect {it.name.toUpperCase() }
     .sort()
     .join(',') == "AMIT,RICKY"
