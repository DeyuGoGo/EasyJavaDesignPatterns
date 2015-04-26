package observer;

import util.JavaLog;

public class DeyuNoGoodViewer implements ArenaViewer , TrashTalkViewer{
	private GameResult mGameResult  ;
	@Override
	public void sayTrashTalk() {
		JavaLog.d("他媽的 怎麼這" + mGameResult.getGameNumber() + "場比賽，又是" + mGameResult.getWinner() +"這爛咖贏");
	}
	@Override
	public void OnGameUpdate(GameResult result) {
		mGameResult = result;
		sayTrashTalk();
	}

}
