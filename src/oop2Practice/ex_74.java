package oop2Practice;

public class ex_74 {
	
	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println(t.getChannel());
		t.setChannel(20);
		System.out.println(t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
	}
	

}

class MyTv{
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int preChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel < MAX_CHANNEL || channel > MIN_CHANNEL) {
			this.preChannel = this.channel;
			this.channel = channel;
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void gotoPrevChannel() {
		setChannel(this.preChannel);
	}
	
}