package lab7_Prob4;

public abstract class Duck implements Flyable,Quackable{
    public abstract void display();

    public void swim(){ System.out.println("Swimming"); }
}
