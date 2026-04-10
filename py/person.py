class Person:
    def __init__(self, ID: int, name: str):
        self.ID = ID
        self.name = name
    def __eq__(self, other):
        return isinstance(other, Person) and self.ID == other.ID and self.name == other.name
    def __hash__(self):
        return hash((self.ID, self.name))
