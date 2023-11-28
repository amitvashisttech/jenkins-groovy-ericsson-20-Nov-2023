List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums
println nums.class.name

// add | remove | get | clear

nums.push(99)
println nums

nums.putAt(5,77)
println nums

nums[0] = 78
println nums

nums + 7
println nums

nums << 66
println nums

// Removes the last item from this List
nums.pop()
println nums
nums.removeAt(0)
println nums


// flatten
List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
nums << [3,4,5]
nums << [1,2]
println nums
println nums.flatten()

// equals
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)

// findAll
List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums.findAll { it == 4 }
println nums.flatten().findAll { it < 5 }

// getAt(Range)
println nums.getAt(0..5)

// reverse list
println nums.reverse()

// unique
println nums.unique()




- Ignore
// Java Collections List(LinkedList) (Set,SortedSet)
def evens = [10,2,8,4,24,14,2] as Set
println evens
println evens.class.name

