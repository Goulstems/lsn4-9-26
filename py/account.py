from decimal import Decimal
from person import Person

class Account:
    def __init__(self, owner: Person):
        self.owner = owner
        self.balance = Decimal('0')
    def deposit(self, amount: Decimal):
        self.balance += amount
    def withdraw(self, amount: Decimal):
        self.balance -= amount
    def getBalance(self):
        return self.balance
