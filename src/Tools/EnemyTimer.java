package Tools;

public class EnemyTimer {
    static Thread thread;

    public void countDown(){
        thread = new Thread();
        for(int i = 10; i >=0; i--){

            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
