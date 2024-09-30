import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerAnimal {
    public static void main(String[] args) {
        try {
            // Création d'une instance de l'animal
            Animals animal = new AnimalImpl("Rex", "John", "Chien", "Labrador");

            // Enregistrement de l'objet dans le registre RMI
            Registry registry = LocateRegistry.createRegistry(4001);  // I wanted to use 4001
            registry.rebind("AnimalService", animal);

            System.out.println("Serveur Up. Animal distributed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
