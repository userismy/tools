package test;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;




/**
 * 
 *邮件发送
 */
public class MailUtilsT {
	@Test
     public void sendmail() throws MessagingException, IOException
     {
    	 /**
    	  * 1.登录邮件服务器
    	  * MailUtils.createsession("邮件服务器地址","用户名","密码")
    	  * 2.邮件内容
    	  * 发件人，收件人，主题，正文
    	  * 3.发送MailUtils.send(session,mail);邮件发送n
    	  */
    	 Session session=MailUtils.createSession("smtp.163.com","nzhang","1247956423qq");
    	 
    	 Mail mail=new Mail("nzhang@myfp","1247956423@qq.com","Title","<a href='http://www.baidu.com'>百度</a>");
    	  
    	 MailUtils.send(session, mail);
     }

	
}
