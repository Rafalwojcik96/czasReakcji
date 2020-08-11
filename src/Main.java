import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        long timeInterval = 0;
        List<Long> reactionTime = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            Timer.countDownTime(5);
            double kiedyStart = LosowanieCzasu.randomTime();
            Timer.countDownTimeInvisible((int) kiedyStart);



            System.out.println("Show must go on");

            long firstTime = System.currentTimeMillis();


            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            if (a.equals("")) {
                timeInterval = System.currentTimeMillis() - firstTime;
            }
            System.out.println(timeInterval);

            reactionTime.add(timeInterval);
        }
       long result = addingTime(reactionTime);
        System.out.println("Twój wynik to: "+result+"ms");

    }

    static Long addingTime(List<Long> addingArgList) {
        long listSum = 0;

        for (int i = 0; i < addingArgList.size(); i++) {
            listSum += addingArgList.get(i);

        }
        return listSum;
    }
}
