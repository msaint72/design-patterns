package creational.singleton;

public class ThreadSafeSingleton1 {
    private static ThreadSafeSingleton1 instance;
    // PRIVATE constructor
    private ThreadSafeSingleton1(){}
    // syncronized added
    /***** syncronization is expensive*****/
    synchronized public static ThreadSafeSingleton1 getInstance(){
        if(instance==null){
            instance=new ThreadSafeSingleton1();
        }
        return instance;
    }
}
