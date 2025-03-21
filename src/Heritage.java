import jc.entities.Horse;
import jc.entities.Pegasus;

// Mise en évidence de la notion de "héritage"
public class Heritage  {
    public static void heritage(String[] args) {
        Horse h = new Horse("Guero");
        h.move(167, 428);

        Pegasus p = new Pegasus("Titanus");
        p.move(33, 146);
        p.fly(466);
    }
}