package org.example.sectionB

//Create a class 'BankAccount' with a private balance variable. Add functions deposit(), withdraw(), and getBalance(). Ensure balance cannot become negative.

class BankAccount {
    private var balance: Double = 0.0
    private var accountNo: String = "50001234001"

    fun deposit(amount: Double) {
        if(amount > 0) {
            println("Depositing Rs.$amount")
            balance += amount
        } else {
            println("Enter Invalid Amount.")
        }
    }

    fun withdraw(amount: Double) {
        if(amount > 0 && amount <= balance) {
            println("Withdrawing Rs.$amount")
            balance -= amount
        } else {
            println("Withdrawing Amount must be greater than $balance")
        }
    }

    fun getBalance() {
        println("Current Balance: $balance of Account Number: $accountNo")
    }
}

fun main() {
    val SBI = BankAccount()
    SBI.deposit(50000.0)
    SBI.getBalance()
    SBI.withdraw(10000.0)
    SBI.getBalance()
}