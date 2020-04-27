package behavioral.observer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Observer test:");
		Screen screen = new Screen();
		DataStore dataStore = new DataStore();
		// register observer
		dataStore.addObserver(screen);
		dataStore.setData("Test");
		dataStore.notifyObservers();

	}

}
