package creational.singleton;

public class SingleThreadedSingleton {
    private static SingleThreadedSingleton instance;
    // PRIVATE constructo
    private SingleThreadedSingleton(){}
    public static SingleThreadedSingleton getInstance(){
        if(instance==null){
            instance=new SingleThreadedSingleton();
        }
        return instance;
    }
}
