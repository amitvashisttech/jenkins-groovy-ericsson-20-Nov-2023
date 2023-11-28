def map = [:]
println map
println map.getClass().getName()

// 
def person = [first:"Amit",last:"Kumar",email:"amitkumar@gmail.com"]
println person
println person.first

person.twitter = "@theamitkumar"
println person

def emailKey = "EmailAddress"
def twitter = [username:"@theamitkumar",(emailKey):"amitkumar@gmail.com"]

println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

