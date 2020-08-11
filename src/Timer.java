public class Timer {

    public static void countDownTime(int sekundy) {
        for(int i = sekundy; i>0 ; i--){

            System.out.println(i+"...");

            long start = System.currentTimeMillis();
            while(true){

                long elapsedTime = System.currentTimeMillis() - start;
                if (elapsedTime>1000){
                    break;
                }
            }
        }
        System.out.println("Start!");
    }

    public static void countDownTimeInvisible(int sekundy) {
        for(int i = sekundy; i>0 ; i--){


            long start = System.currentTimeMillis();
            while(true){

                long elapsedTime = System.currentTimeMillis() - start;
                if (elapsedTime>1000){
                    break;
                }
            }

        }
    }

    }
