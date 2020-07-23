package multithreading;

public class LiftOff implements Runnable {
    protected int countDown = 9999;
    private static  int taskCount = 0;  //
    private final int id = taskCount++;  // 这个自增是如何实现的。
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!" ) +"),";
    }

    @Override
    public void run() {
        while(countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }

    }
}

/*
class MainThread{
    public static void main(String[] args){
        LiftOff launch = new LiftOff();
        launch.run();
        System.out.println();
        new LiftOff().run();
    }
}
*/
class MoreBasicThread{
    public static void main(String[] args){
        for(int i = 0; i<5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("等待");
    }
}
