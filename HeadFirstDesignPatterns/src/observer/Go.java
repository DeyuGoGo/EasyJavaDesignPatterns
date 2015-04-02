package observer;

public class Go {
	public static void main(String[] args) {
	Arena mArena = new DeyuArena();
	ArenaViewer a = new DeyuNoGoodViewer();
	ArenaViewer b = new DeyuViewer();
	mArena.registerArenaViewer(a);
	mArena.onNewGameResult(new ArenaGameResult("低能兒", 1));
	mArena.registerArenaViewer(b);
	mArena.onNewGameResult(new ArenaGameResult("帥氣的殺手", 2));
}
}
