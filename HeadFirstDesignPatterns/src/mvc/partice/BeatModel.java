package mvc.partice;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class BeatModel implements BeatModelnterface , MetaEventListener{
	Sequencer sequencer;
	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int bpm = 90;
	Sequence sequence;
	Track track;

	@Override
	public void init() {
		setUpMidi();
		buildTrackAndStart();
	}

	@Override
	public void on() {
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm ;
		sequencer.setTempoInBPM(bpm);
		notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void registerObserver(BPMObserver observer) {
		bpmObservers.add(observer);
	}

	@Override
	public void removeObserver(BPMObserver observer) {
		bpmObservers.remove(observer);
	}

	@Override
	public void registerObserver(BeatObserver observer) {
		beatObservers.add(observer);
	}

	@Override
	public void removeObserver(BeatObserver observer) {
		beatObservers.remove(observer);
	}

	private void setUpMidi(){
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void buildTrackAndStart(){
		int[] trackList = {35,0,46,0};
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		
		makeTracks(trackList);
	}
	
	private void makeTracks(int[] List){
		int i = -1;
		for(int key : List){
			i++;
			if(key != 0){
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i+1));
			}
		}
	}
	
	private MidiEvent makeEvent(int cmd , int chan , int one , int two ,int tick){
		MidiEvent event = null;
		ShortMessage a = new ShortMessage();
		try {
			a.setMessage(cmd , chan , one , two);
			event = new MidiEvent(a, tick);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		return event;
	}
	
	private void notifyBPMObservers(){
		for(BPMObserver o : bpmObservers){
			if(o!=null)o.updateBPM();
		}
	}
	private void notifyBeatObservers(){
		for(BeatObserver  o : beatObservers){
			if(o != null) o.updateBeat();
		}
	}
	
	private void beatEvent(){
		notifyBeatObservers();
	}

	@Override
	public void meta(MetaMessage meta) {
		if(meta.getType() == 47){
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
		
	}
}
