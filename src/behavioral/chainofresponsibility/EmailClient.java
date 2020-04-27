package behavioral.chainofresponsibility;

import structural.decorator.Email;

//email client
public class EmailClient {
	private EmailProcessor processor;

	public EmailClient() {
		createProcessor();
	}

	private void createProcessor() {
		processor = new EmailProcessor();
		processor.addHandler(new BusinessMailHandler());
		processor.addHandler(new GMailHandler());
	}

	public void addRule(EmailHandler handler) {
		processor.addHandler(handler);
	}

	public void emailReceived(Email email) {
		processor.handleRequest(email);
	}

	public static void main(String[] args) {
		EmailClient client = new EmailClient();
	}
}
