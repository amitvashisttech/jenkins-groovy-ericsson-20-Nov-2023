Range r = 1..10
println r
println r.toList()
println r.class.name
println r.from
println r.to

Range a = 1..<10
println a.toList() 

def characters = 'A'..'F'
println characters.toList()


// Assert Check 
assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false


// Date Example 
Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
println oneWeekAway

// Range 
Range days = today..oneWeekAway
println days.toList()

Range letters = 'a'..'z'
println letters.toList()