package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CClosedEventHandler implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("CClosedEventHandler Received");
	}
}