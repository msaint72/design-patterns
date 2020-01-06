package creational.singleton;

public class ThreadSafeSingleton2 {
    //***  STATIC INITIALIZATION guarantes a single instance
    // BUT it creates the instance even it is not used***//
    private static ThreadSafeSingleton2 instance=new ThreadSafeSingleton2();
    // PRIVATE constructor
    private ThreadSafeSingleton2(){}
    public static ThreadSafeSingleton2 getInstance(){
        return instance;
    }
}
