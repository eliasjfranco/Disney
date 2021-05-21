package com.disney.sendgrid;

import org.springframework.stereotype.Service;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

@Service
public class SendMailService{
	
	private Email from = new Email("disneyalkemy@gmail.com");

	private String subject = "Disney Alkemy Challenge";

	public void enviarEmail(String usuario, String receptor) {
		Content content = new Content("text/plain", "Bienvenido: " +usuario+" a Disney Challenge!");
		Email to = new Email(receptor);
		Mail mail = new Mail(from, subject, to, content);
		SendGrid sg = new SendGrid("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");
		Request request = new Request();
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}
