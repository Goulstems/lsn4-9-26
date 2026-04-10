from account import Account
from person import Person

class Bank:
    def __init__(self):
        self.clientData = {}
    def newClient(self, p: Person):
        acc = Account(p)
        self.clientData[p] = acc
        return acc
    def removeClient(self, p: Person):
        self.clientData.pop(p, None)
    def getClientAccount(self, p: Person):
        try:
            acc = self.clientData.get(p)
            if acc is None:
                raise Exception('Person not enrolled!')
            return acc
        except Exception as e:
            print('Error:', e)
            return None
