package behavioral.iterator;

import java.util.List;

//Concrete Iterator 
//Iterator interface 
public class ConcreteChannelIterator implements ChannelIterator {
	private List<String> channels;
	private int currentPos = 0;

	public ConcreteChannelIterator(List<String> channels){
		this.channels = channels;}

	public boolean hasNext() {
		if (currentPos + 1 < channels.size()) {
			return true;
		}
		return false;
	}

	public void next() {
		currentPos++;
	}

	public String currentItem() {
		return channels.get(currentPos);
	}
}
