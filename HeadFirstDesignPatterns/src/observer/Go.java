package observer;

public class Go {
	public static void main(String[] args) {
	Arena mArena = new DeyuArena();
	ArenaViewer a = new DeyuNoGoodViewer();
	ArenaViewer b = new DeyuViewer();
	mArena.registerArenaViewer(a);
	mArena.onNewGameResult(new ArenaGameResult("�C���", 1));
	mArena.registerArenaViewer(b);
	mArena.onNewGameResult(new ArenaGameResult("�Ӯ𪺱���", 2));
}
}
