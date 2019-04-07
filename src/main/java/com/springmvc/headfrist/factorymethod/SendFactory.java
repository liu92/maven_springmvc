package com.springmvc.headfrist.factorymethod;
/**
 * 建造工厂类
 * @author lenovo
 *
 */
public class SendFactory {
	//普通工厂方法模式
	/*public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  */
	
	
	//多个工厂方法模式
	
	/*public Sender productMail()
	{
		 return new MailSender();
	}
	
	public Sender productSms()
	{
	     return new SmsSender();	
	}*/
	
	//静态工厂方法模式将上面的工厂模式里的方法置为静态的，不需要创建实例，直接调用即可
	
	public static  Sender productMail()
	{
		 return new MailSender();
	}
	
	public static Sender productSms()
	{
	     return new SmsSender();	
	}
}
