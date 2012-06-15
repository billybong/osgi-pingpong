package se.rl.osgi2.provider;

import java.util.concurrent.atomic.AtomicInteger;

import se.rl.pong.api.PongInterface;

public class PongImpl implements PongInterface {

	private AtomicInteger counter = new AtomicInteger(0);
	private final String response;
	
	public PongImpl(String response){
		this.response = response;
	}
	
	public String pingPong(String ping){
		return String.format("%s %s (%d)", ping, response, counter.getAndIncrement());
	}
}
