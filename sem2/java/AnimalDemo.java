class Animal {
    private String species;
    int age;
    float weight;
    protected String color; 
    
    public Animal(String species,int age,float weight,String color){
        this.species=species;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    public void disAnimal(){
        System.out.println("Age:"+age+" "+"Weight:"+weight+" "+"Species:"+species+" "+"Color:"+color+" ");
    }
}

class Dog extends Animal{
    private String name;
    private String owner;
    public Dog(String species,int age,float weight,String color,String name,String owner){
        super(species,age,weight,color);
        this.name=name;
        this.owner=owner;
    }
    public void disDog(){
        System.out.println("Name:"+name+" "+"Owner:"+owner);
    }
}

public class AnimalDemo{
    public static void main(String[] a){
        Dog d=new Dog("Mammal",2,10,"Black","Jimmy","Dev");
        d.disAnimal();
        d.disDog();
    }
}