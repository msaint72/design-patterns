package creational.singleton;

public class ThreadSafeSingletonDoubleCheck {
    private volatile  static ThreadSafeSingletonDoubleCheck instance;
    private ThreadSafeSingletonDoubleCheck(){}
    public static ThreadSafeSingletonDoubleCheck getInstance(){
        if(instance==null){
            synchronized (ThreadSafeSingletonDoubleCheck.class){
                if(instance==null){
                    instance=new ThreadSafeSingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
