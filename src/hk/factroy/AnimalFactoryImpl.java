package hk.factroy;

public class AnimalFactoryImpl implements AnimalFactory {
    private Animal animal;
    @Override
    public Animal createAnimal(String name) {
        if (name.equals("dog")){
            animal = new Dog();
        }
        if (name.equals("cat")){
            animal = new Cat();
        }
        return animal;
    }
}
