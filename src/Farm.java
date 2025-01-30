import java.util.HashMap;

public class Farm {
private double area = 100;
private static final int maxTypes = 5;
private HashMap<Flower, Integer> flowers = new HashMap<>();

public void pridatRostlinu(Flower flower){

    if(flowers.containsKey(flower)){
        flowers.put(flower, flowers.get(flower)+1);
        System.out.println("Byl pridan dalsi kus rostliny");
    } else {
        if(flowers.size() >= maxTypes){
            System.out.println("Nelze pridat dalsi druh");
            return;
        }
        flowers.put(flower, 1);
        System.out.println("Pridan novy druh rostliny");
    }
}


}
