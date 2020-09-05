from Card import *

class Deck():
    def __init__(self):
        self.cards = []
        self.build()

    # Generate all cards
    def build(self):
        self.cards = []
        for suit in ['Hearts', 'Clubs', 'Diamonds', 'Spades']:
            for val in range(1,14):
                self.cards.append(Card(suit, val))


    # Show all cards 
    def show(self):
        for card in self.cards:
            print(card)
           

    # Shuffle the deck
    def shuffle(self):
        random.shuffle(self.cards)
               

    # Return the top card
    def deal(self):
        return self.cards.pop()


def main():
    
    deck = Deck()
    deck.shuffle()
    #deck.show()
    print('Top card', deck.deal())
    deck.shuffle()
    print('Top card after shuffle', deck.deal())

main()
    

