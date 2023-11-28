class MyAccount {
     BigDecimal balance 

     // Our own plus logic
     MyAccount plus(MyAccount other) {
        new MyAccount(balance: this.balance + other.balance)
     }
    
     //Converting Balance out into string readble format 
     String toString() { 
        "Account Balance = $balance"
     }
}
MyAccount savings = new MyAccount(balance: 100.00)
MyAccount current = new MyAccount(balance : 50.00)

println savings
println current
println savings + current 




