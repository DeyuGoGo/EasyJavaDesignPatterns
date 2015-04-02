package observer;

import util.JavaLog;

public class DeyuNoGoodViewer implements ArenaViewer , TrashTalkViewer{
	private GameResult mGameResult  ;
	@Override
	public void sayTrashTalk() {
		JavaLog.d("�L���� ���o" + mGameResult.getGameNumber() + "�����ɡA�S�O" + mGameResult.getWinner() +"�o��@Ĺ");
	}
	@Override
	public void OnGameUpdate(GameResult result) {
		mGameResult = result;
		sayTrashTalk();
	}

}
