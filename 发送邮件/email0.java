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
		prop.setProperty("mail.transport.protocol", "smtp");   //传送协议
		prop.setProperty("mail.smtp.auth", "true");
		//1.创建session
		Session session = Session.getInstance(prop);
		//开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
		session.setDebug(true);
		Transport ts=session.getTransport();
		//3.连上邮件服务器
		ts.connect("smtp.163.com","15732115225@163.com","123456a");
		//4.创建邮件
		Message message = createAttachMail(session);
		//5.发送邮件
		//ts.send(message);
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
	}

	private  MimeMessage createAttachMail(Session session) throws Exception{
		// TODO Auto-generated method stub
		MimeMessage message = new MimeMessage(session);
		
		//设置邮件基本信息
		//发件人
		message.setFrom(new InternetAddress("15732115225@163.com"));
		//收件人
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("15732115225@163.com"));
		//邮件标题
		message.setSubject("测试");
		
		//创建邮件正文，为了避免邮件正文中文乱码问题，需要使用charset=UFT-8指明字符编码
		MimeBodyPart text =new MimeBodyPart();
		text.setContent("使用创建的带附件的邮件","text/html;charset=UTF-8");
		
		//创建邮件附件
		MimeBodyPart attach = new MimeBodyPart();
		DataHandler dh = new DataHandler(new FileDataSource("E:\\github\\gitwork\\Selenium\\zhanchitest\\test-output\\index.html"));
		attach.setDataHandler(dh);
		attach.setFileName(dh.getName());
		
//		//创建容器描述数据关系
		MimeMultipart mp =new MimeMultipart();
		mp.addBodyPart(text);
		mp.addBodyPart(attach);
//		mp.setSubType("mixed");
		message.setContent(mp);
//		message.saveChanges();
//		
//		//将创建的Email写入到E盘存储
//		message.writeTo(new FileOutputStream("E:\\attachMail.eml"));
		//返回生成的邮件
		return message;
		
	}
}
