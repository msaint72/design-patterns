package behavioral.chainofresponsibility;

import structural.decorator.Email;

public class EmailProcessor {
	// maintain a reference to the previous handler so we can add the next one
	private EmailHandler prevHandler;

	public void addHandler(EmailHandler handler) {
		if (prevHandler != null) {
			prevHandler.setNext(handler);
		}
		prevHandler = handler;
	}

	public void handleRequest(Email email) {
		// TODO Auto-generated method stub
		
	}
}
