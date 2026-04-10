from decimal import Decimal
from person import Person
from account import Account
from bank import Bank

def uWonTheLottery(bank: Bank, p: Person):
    acc = bank.getClientAccount(p)
    if acc:
        acc.deposit(Decimal('1000000'))
        print(f"{p.name} won the lottery! New balance: {acc.getBalance()}")

def main():
    bank = Bank()
    p1 = Person(1, 'Alice')
    p2 = Person(2, 'Bob')
    p3 = Person(3, 'Charlie')
    bank.newClient(p1)
    bank.newClient(p2)
    bank.getClientAccount(p3)
    acc2 = bank.getClientAccount(p1)
    if acc2:
        print(f"{p1.name}'s balance: {acc2.getBalance()}")
    uWonTheLottery(bank, p1)

if __name__ == '__main__':
    main()
