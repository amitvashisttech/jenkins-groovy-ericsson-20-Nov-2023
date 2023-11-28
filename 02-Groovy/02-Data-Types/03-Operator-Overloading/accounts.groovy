@groovy.transform.ToString
class AccountDemo { 
    BigDecimal balance = 100.0
    String type // checking or savings 

    BigDecimal deposit(BigDecimal amount){
        balance += amount
    }
    
    BigDecimal withdraw(BigDecimal amount){
        balance -= amount 
    }

    BigDecimal plus(AccountDemo account){
        this.balance + account.balance
    }
}   



AccountDemo checking = new AccountDemo(type:"Checking")
checking.deposit(100.00) 

AccountDemo savings = new AccountDemo(type:"Savings")
savings.deposit(50.00)

AccountDemo updates = new AccountDemo(type:"Updates")
updates.deposit(150.00)

AccountDemo atmwithdraw = new AccountDemo(type:"Withdraw")
atmwithdraw.withdraw(10.00)

println checking
println savings
println updates
println atmwithdraw

BigDecimal total = checking + savings
println total
