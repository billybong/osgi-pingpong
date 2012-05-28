package se.rl.osgi.client;

import java.util.concurrent.atomic.AtomicInteger;

public class PingState {

	private AtomicInteger count = new AtomicInteger(0);
	
	public String addState(String req){
		return String.format("%s (%d),", req, count.getAndIncrement());
	}
}
