import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;


@Service
public class AgreementAcknowledgement{
	
	
	@Autowired
	private JavaMailSender mailSender;
	 private Logger log = org.slf4j.LoggerFactory.getLogger(AgreementAcknowledgement.class);
	
	 public void sendEmail()
	{   List <String> mailReceipents=new ArrayList<>();
	     mailReceipents.add("geetishadevre247@gmail.com");
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("geetishadevre247@gmail.com");
		message.setTo();
		message.setSubject("Agreement Signed Successfully");
		message.setText("Hello user, this is to inform that the agreement is signed successfully");
		
		
		
		mailSender.send(message);
		log.info("mail sent successfully");
		
	}
}