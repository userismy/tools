package test;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;




/**
 * 
 *�ʼ�����
 */
public class MailUtilsT {
	@Test
     public void sendmail() throws MessagingException, IOException
     {
    	 /**
    	  * 1.��¼�ʼ�������
    	  * MailUtils.createsession("�ʼ���������ַ","�û���","����")
    	  * 2.�ʼ�����
    	  * �����ˣ��ռ��ˣ����⣬����
    	  * 3.����MailUtils.send(session,mail);�ʼ�����nnn
    	  */
    	 Session session=MailUtils.createSession("smtp.163.com","nzhang","1247956423qq");
    	 
    	 Mail mail=new Mail("nzhang@myfp","1247956423@qq.com","Title","<a href='http://www.baidu.com'>�ٶ�</a>");
    	  
    	 MailUtils.send(session, mail);
     }

	
}
