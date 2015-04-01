package observer;

import java.util.ArrayList;

public abstract class Arena {
	protected GameResult mGameResult;
	private ArrayList<ArenaViewer> Views = new ArrayList<ArenaViewer>();
	public GameResult getGameResult(){
		return mGameResult;
	}
	public void registerArenaViewer(ArenaViewer viewer){
		if(!Views.contains(viewer))Views.add(viewer);
	}
	public void unregisterArenaViewer(ArenaViewer viewer){
		if(Views.contains(viewer))Views.remove(viewer);
	}
	public void notifyViewers(){
		for(ArenaViewer viewer : Views){
			viewer.OnGameUpdate(mGameResult);
		}
	}
	public void onNewGameResult(GameResult gameResult ){
		mGameResult = gameResult;
		notifyViewers();
	}
}
