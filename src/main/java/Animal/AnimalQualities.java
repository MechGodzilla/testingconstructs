package Animal;

/**
 * Created by schiang on 3/24/2016.
 */
abstract public class AnimalQualities {
    private String name;
    private boolean aggroType;
    private int animalAttack;
    private int animalHealth;

    public AnimalQualities(){
    }

    public AnimalQualities(String animalName){
        name = animalName;
        aggroType = false;
    }

    public AnimalQualities(String animalName, int setHealth, int setAttack){
        name = animalName;
        aggroType = true;
        animalHealth = setHealth;
        animalAttack = setAttack;
    }


    void specialAbility(){
    }
    public String selectedMonster(){
        return String.format("%s - %d HP - %d DMG \n", name, animalHealth,animalAttack);
    }

    public int animalAttacks(int playerHP, int animalAtkDmg){
        return playerHP -= animalAtkDmg;

    }




}
