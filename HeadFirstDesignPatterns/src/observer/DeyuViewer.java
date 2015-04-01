package observer;

import util.JavaLog;

public class DeyuViewer implements ArenaViewer , TrashTalkViewer{
	private GameResult mGameResult  ;

	@Override
	public void sayTrashTalk() {
		JavaLog.d("���o" + mGameResult.getGameNumber() + "�����ɡA" + mGameResult.getWinner() +"��{�o�Ӻ�m�F�C");
	}

	@Override
	public void OnGameUpdate(GameResult result) {
		mGameResult = result;
		sayTrashTalk();
	}

}
