package email;

import java.io.FileOutputStream;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class email0 {
	public static void main(String[] args) throws Exception{
		email0 mail = new email0();
			mail.send();
	}
	public void send() throws Exception{
		Properties prop = new Properties();
		prop.setProperty("mail.host", "smtp.163.com");
		prop.setProperty("mail.transport.protocol", "smtp");   //����Э��
		prop.setProperty("mail.smtp.auth", "true");
		//1.����session
		Session session = Session.getInstance(prop);
		//����Session��debugģʽ�������Ϳ��Բ鿴��������Email������״̬
		session.setDebug(true);
		Transport ts=session.getTransport();
		//3.�����ʼ�������
		ts.connect("smtp.163.com","15732115225@163.com","123456a");
		//4.�����ʼ�
		Message message = createAttachMail(session);
		//5.�����ʼ�
		//ts.send(message);
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
	}

	private  MimeMessage createAttachMail(Session session) throws Exception{
		// TODO Auto-generated method stub
		MimeMessage message = new MimeMessage(session);
		
		//�����ʼ�������Ϣ
		//������
		message.setFrom(new InternetAddress("15732115225@163.com"));
		//�ռ���
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("15732115225@163.com"));
		//�ʼ�����
		message.setSubject("����");
		
		//�����ʼ����ģ�Ϊ�˱����ʼ����������������⣬��Ҫʹ��charset=UFT-8ָ���ַ�����
		MimeBodyPart text =new MimeBodyPart();
		text.setContent("ʹ�ô����Ĵ��������ʼ�","text/html;charset=UTF-8");
		
		//�����ʼ�����
		MimeBodyPart attach = new MimeBodyPart();
		DataHandler dh = new DataHandler(new FileDataSource("E:\\github\\gitwork\\Selenium\\zhanchitest\\test-output\\index.html"));
		attach.setDataHandler(dh);
		attach.setFileName(dh.getName());
		
//		//���������������ݹ�ϵ
		MimeMultipart mp =new MimeMultipart();
		mp.addBodyPart(text);
		mp.addBodyPart(attach);
//		mp.setSubType("mixed");
		message.setContent(mp);
//		message.saveChanges();
//		
//		//��������Emailд�뵽E�̴洢
//		message.writeTo(new FileOutputStream("E:\\attachMail.eml"));
		//�������ɵ��ʼ�
		return message;
		
	}
}
