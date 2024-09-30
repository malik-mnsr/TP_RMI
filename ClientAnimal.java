import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientAnimal {
    public static void main(String[] args) {
        try {

            
            Registry registry = LocateRegistry.getRegistry("localhost", 4001);


            Animals animal = (Animals) registry.lookup("AnimalService");


            System.out.println(animal.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
