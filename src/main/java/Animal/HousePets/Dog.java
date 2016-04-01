package Animal.HousePets;

import Animal.AnimalQualities;

public class Dog extends AnimalQualities{
    public Dog(String name, int health, int attack){
        super(name,health, attack);
    }

    void specialAbility(int dogHealth){
        if(dogHealth == 1){
            System.out.println("Dog lets out a dying howl");
        }
    }
}
