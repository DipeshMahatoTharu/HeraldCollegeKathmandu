/*Create an abstract class GameCharacter with abstract methods like attack() and
defend(). Then, create subclasses Warrior and Archer with different attack and
defense behaviors.*/
abstract class GameCharacter {
    public abstract void attack();
    public abstract void defend();


    
}
class Warrior extends GameCharacter{
    public void attack(){
        System.out.println("Attack");

    }
    public void defend(){
        System.out.println("Defend ! ");
    }
}
class Archer extends GameCharacter{
    public void attack(){
        System.out.println("Peew Pewwe");
    }
    public void defend(){
        System.out.println("defending ");

    }
}

public class Qno4 {
    public static void main(String[] args) {
        Warrior warrior=new Warrior();
        warrior.attack();
        warrior.defend();
        
        Archer archer=new Archer();
        archer.attack();
        archer.defend();

    }
    
}
