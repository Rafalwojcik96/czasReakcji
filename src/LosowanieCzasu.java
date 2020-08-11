import java.util.Random;

public class LosowanieCzasu {

    public static double randomTime(){
        Random losowyCzas=new Random();
        return losowyCzas.nextDouble()*10;

    }
}
