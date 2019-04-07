package com.springmvc.headfrist.abstractfactory;


import com.springmvc.headfrist.factorymethod.MailSender;
import com.springmvc.headfrist.factorymethod.Sender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
