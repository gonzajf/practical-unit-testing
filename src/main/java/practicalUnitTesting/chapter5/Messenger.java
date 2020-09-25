package practicalUnitTesting.chapter5;

public class Messenger {

	private TemplateEngine templateEngine;
	private MailServer mailServer;

	public Messenger(MailServer mailServer, TemplateEngine templateEngine) {
		this.mailServer = mailServer;
		this.templateEngine = templateEngine;
	}

	public void sendMessage(Client client, TemplateEngine template) {
		String msgContent = templateEngine.prepareMessage(template, client);
		mailServer.send(client.getEmail(), msgContent);
	}
}