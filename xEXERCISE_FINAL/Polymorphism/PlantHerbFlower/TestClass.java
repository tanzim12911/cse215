package xEXERCISE_FINAL.Polymorphism.PlantHerbFlower;

public class TestClass {
    public static void main(String[] args) {
        Plant[] p = new Plant[5];
        
        p[0] = new Flower("Rose", "Red", true, true);
        p[1] = new Herb("Basil", "Green", true, "Summer");
        p[2] = new Flower("Daffodil", "Yellow", true, false);
        p[3] = new Herb("Bayleaf", "Brown", true, "Spring");

        System.out.println("Initial Plants:");
        display(p);

        System.out.println("Plant added: ");
        add(p, new Flower("Sunflower", "Yellow", true, false));
        display(p);

        System.out.println("Plant removed: ");
        remove(p, "Basil");
        display(p);

        System.out.println("Plant searched: ");
        System.out.println(search(p, "Daffodil"));

    }

    static void add(Plant[] plants, Plant p) {
        for(int i = 0; i < plants.length; i++) {
            if(plants[i] == null) {
                plants[i] = p;
            }
        }
    }

    static void remove(Plant[] plants, String n) {
        for(int i = 0; i < plants.length; i++) {
            if(plants[i].getName().equals(n)) {
                plants[i] = null;
            }
        }

    }

    static Plant search(Plant[] plants, String n) {
        for(int i = 0; i < plants.length; i++) {
            if(plants[i] != null && plants[i].getName().equals(n)) {
                return plants[i];
            }
        }
        System.out.println(n + " was not found");
        return null;
    }

    static void display(Plant[] plants) {
        for(Plant p : plants) {
            if(p != null) {
                System.out.println(p.toString());
            }
        }
    }
}
