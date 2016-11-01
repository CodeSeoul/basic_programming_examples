def main():
    adventurer = Adventurer()
    boar = Boar()
    battle(adventurer, boar)

    dragon = Dragon()
    battle(adventurer, dragon)
    print('You win!')


def battle(player, opponent):
    print("You're battling a", opponent)
    while player.health > 0 and opponent.health > 0:
        action = None
        while action not in ('attack', 'check_inventory', 'check_health'):
            action = input("""What would you like to do?
            attack
            check_inventory
            check_health\n""")
            """
                TODO:
                If the action is "attack", call the player's attack function
                on the opponent.
                If the action is "check_inventory", call the player's
                print_inventory function.
                If the action is "check_health", call the player's print_health
                function
                If the command isn't one of these, tell the user that
                the command is invalid and that they should try again.
            """
            # TODO: See above!
        opponent.attack(player)
    if opponent.health <= 0:
        # TODO: The player should loot the opponent
        print('Congratulations! You slayed', opponent)
    if player.health <= 0:
        # TODO: Print to the screen that the player died
        from sys import exit
        exit(0)


class Creature:

    def __init__(self, health, armor, damage):
        self.health = health
        self.armor = armor
        self.damage = damage

    def take_damage(self, damage):
        calculated_damage = damage - self.armor
        print(self, 'lost', calculated_damage, 'health points in damage')
        self.health -= calculated_damage

    def attack(self, target):
        """
            Print that this creature is attacking the target.
            Call the target's take_damage method, giving it this
            creature's damage as a parameter
        """
        pass # TODO: Remove this and see above!


class Adventurer(Creature):
    def __init__(self):
        super(Adventurer, self).__init__(30, 5, 10)
        self.inventory = []

    def __str__(self):
        """
         TODO: When we try to print an Adventurer object, we should
         see the text "Noble Adventurer"
        """
        pass # TODO: Remove this line and see above!

    def loot(self, dead_creature):
        # Add the dead creature's loot to the adventurer's inventory
        """
            TODO: For each item in the dead creature's loot, we should
            print that the player looted the item and add it to
            the inventory
        """
        self.update_stats()

    def update_stats(self):
        self.armor = 5
        self.damage = 10
        for item in self.inventory:
            """
                TODO:
                    If the key "armor" is in the item attributes,
                    we should add the value to the Adventurer's
                    armor property
                    If the key "damage" is in the item attributes,
                    we should add the value to the Adventurer's
                    damage property
            """
            continue # TODO: remove this and see above!

    def print_inventory(self):
        print('The adventurer is currently carrying:')
        if len(self.inventory) == 0:
            print("\tNothing")
        else:
            for item in self.inventory:
                print("\t", item)

    def print_health(self):
        print('The adventurer currently has', self.health, 'health')


# TODO: A Monster should inherit from Creature
class Monster:
    def __init__(self, health, armor, damage, loot):
        super(Monster, self).__init__(health, armor, damage)
        self.loot = loot


class Dragon(Monster):
    def __init__(self):
        sword_of_dragon_slaying = Item('Sword of Dragon Slaying', {
            'damage': 10
        })
        """
            TODO: create an item called "Helm of Glory" with 5 armor
            and add it to the Dragon's loot (Hint, very similar to the
            Sword of Dragon Slaying)
        """
        super(Dragon, self).__init__(40, 0, 20, [sword_of_dragon_slaying, helm_of_glory])

    def __str__(self):
        return 'Dragon'


class Boar(Monster):
    def __init__(self):
        shield_of_the_wild = Item('Shield of the Wild', {
            'armor': 10
        })
        super(Boar, self).__init__(30, 0, 6, [shield_of_the_wild])

    def __str__(self):
        return 'Boar'


"""
    TODO: Extra goal!
    Create a new monster called a Demon. It should inherit from Monster.
    A Demon should have 80 health, 5 armor, and do 20 damage.
    A Demon should carry one item as loot. This item should be called
    the Heavenly Hammer of Hammertime and should provide 15 damage.
    Make sure the player fights the Demon.

    Can you adjust the player's stats such that it's possible to win
    the game but not guaranteed?
    (I haven't actually done the math. Seriously, is it possible?)
"""


class Item:
    def __init__(self, name, attributes):
        self.name = name
        self.attributes = attributes

    def __str__(self):
        return self.name


if __name__ == "__main__":
    main()
