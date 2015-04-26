package mvc.partice;

public interface BeatModelnterface {
	public void init();
	public void on();
	public void off();
	public void setBPM(int bpm);
	public int getBPM();
	public void registerObserver(BPMObserver observer);
	public void removeObserver(BPMObserver observer);
	public void registerObserver(BeatObserver observer);
	public void removeObserver(BeatObserver observer);
}
