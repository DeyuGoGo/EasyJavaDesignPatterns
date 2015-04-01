package observer;

public class ArenaGameResult implements GameResult{

	public String mWinnerName;
	public int mGameNumber;
	public ArenaGameResult(String winner , int gameNumber){
		this.mWinnerName = winner;
		this.mGameNumber = gameNumber;
	}
	
	@Override
	public String getWinner() {
		return mWinnerName;
	}

	@Override
	public int getGameNumber() {
		return mGameNumber;
	}

}
