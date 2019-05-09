package com.a.mianshi.mail;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import java.util.*;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2019-01-02
 */
public class MailTest {
	public static void main(String[] args)  throws Exception {
		// 创建Properties 类用于记录邮箱的一些属性
		Properties props = new Properties();
		// 表示SMTP发送邮件，必须进行身份验证
		props.put("mail.smtp.auth", "true");
		//此处填写SMTP服务器
		props.put("mail.smtp.host", "smtp.qq.com");
		//端口号，QQ邮箱给出了两个端口，但是另一个我一直使用不了，所以就给出这一个587
		props.put("mail.smtp.port", "587");
		// 此处填写你的账号
		props.put("mail.user", "376473852@qq.com");
		// 此处的密码就是前面说的16位STMP口令
		props.put("mail.password", "wpbuhcdigygjbgbb");

		// 构建授权信息，用于进行SMTP进行身份验证
		Authenticator authenticator = new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				// 用户名、密码
				String userName = props.getProperty("mail.user");
				String password = props.getProperty("mail.password");
				return new PasswordAuthentication(userName,password);
			}
		};
		// 使用环境属性和授权信息，创建邮件会话
		Session mailSession = Session.getInstance(props, authenticator);
		// 创建邮件消息
		MimeMessage message = new MimeMessage(mailSession);
		// 设置发件人
		InternetAddress form = new InternetAddress(
				props.getProperty("mail.user"));
		message.setFrom(form);

		// 设置收件人的邮箱
		InternetAddress to = new InternetAddress("376473852@qq.com");
		message.setRecipient(RecipientType.TO, to);

		// 设置邮件标题
		message.setSubject("测试邮件");

		// 设置邮件的内容体
		message.setContent("这是一封测试邮件", "text/html;charset=UTF-8");

		// 最后当然就是发送邮件啦
		Transport.send(message);
		System.out.println("sssssssssss");
	}

}
