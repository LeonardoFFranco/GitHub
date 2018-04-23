package FactoryAbstract;

/**
 * Created by WINDOWS 8.1 on 23/04/2018.
 */
public class FactoryPizza {
    public static Pizza make(String type) {
        Pizza pizza;
        switch (type) {
            case "carnivora":
                pizza = new Carnivora();
                break;
            case "hawaiana":
                pizza = new Hawaiana();
                break;
            case "Tradicional":
                pizza = new Tradicional();
                break;
            default:
                pizza=new Tradicional();
                break;
        }
        return pizza;
    }
}
