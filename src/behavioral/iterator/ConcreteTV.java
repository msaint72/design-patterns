package behavioral.iterator;

import java.util.List;

//Concrete Aggregator
public class ConcreteTV {
	private ChannelIterator iterator;
	private List<String> channels;

	public ConcreteTV() {
		iterator = new ConcreteChannelIterator(channels);
	}

	public ChannelIterator getIterator() {
		return iterator;
	}
}
