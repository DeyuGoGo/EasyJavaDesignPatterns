package observer;

import util.JavaLog;

public class DeyuViewer implements ArenaViewer , TrashTalkViewer{
	private GameResult mGameResult  ;

	@Override
	public void sayTrashTalk() {
		JavaLog.d("怎麼這" + mGameResult.getGameNumber() + "場比賽，" + mGameResult.getWinner() +"表現得太精彩了。");
	}

	@Override
	public void OnGameUpdate(GameResult result) {
		mGameResult = result;
		sayTrashTalk();
	}

}
