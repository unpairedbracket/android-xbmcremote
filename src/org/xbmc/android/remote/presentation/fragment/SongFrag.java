package org.xbmc.android.remote.presentation.fragment;

import org.xbmc.android.remote.R;
import org.xbmc.android.remote.presentation.activity.MusicLibraryActivity;
import org.xbmc.android.remote.presentation.controller.SongListController;
import org.xbmc.api.object.Album;
import org.xbmc.api.object.Artist;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SongFrag extends Fragment {
	private SongListController mSongController;
	private Handler mHandler;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fraglistsong, container, false);
		mHandler = new Handler();
		mSongController = new SongListController();
		mSongController.findTitleView(v.findViewById(R.id.songlist_fragment_layout));
		mSongController.findMessageView(v.findViewById(R.id.songlist_fragment_layout));
		mSongController.onCreate(getActivity(), mHandler, (ListView)v.findViewById(R.id.songlist_list));
		return v;
	}
	
	public void update(Artist artist) {
		mSongController.update(artist);
	}
	
	public void update(Album album) {
		mSongController.update(album);
	}

	public void showAll() {
		mSongController.showAll();
	}

}
