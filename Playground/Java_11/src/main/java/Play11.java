import java.util.ArrayList;
import java.util.Random;

public class Play11 {

    public static void main(String[] args) {
        var define = new ArrayList<>();
        define.forEach(System.out::println);
        escogerDondeComer();
    }

    public static String escogerDondeComer(){
        String[] opciones={"Mac Donalds", "Burguer King", "Carls Jr", "La Piojera"};
        String decision = opciones[new Random().nextInt(opciones.length)];
        System.out.println(decision);
        return decision;
    }
}
