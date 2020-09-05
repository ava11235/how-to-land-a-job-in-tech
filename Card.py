import random

class Card():
    def __init__(self, suit, value):
        self.suit = suit
        self.value = value

    # Override built in methods 
    def __unicode__(self):
        return self.show()
    def __str__(self):
        return self.show()
    def __repr__(self):
        return self.show()
        
    def show(self):
        if self.value == 1:
            value = "Ace"
        elif self.value == 11:
            value = "Jack"
        elif self.value == 12:
            value = "Queen"
        elif self.value == 13:
            value = "King"
        else:
            value = self.value

        return "{} of {}".format(value, self.suit)

