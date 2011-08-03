package org.xbmc.android.remote.presentation.fragment;

import org.xbmc.android.remote.R;
import org.xbmc.android.remote.presentation.activity.MusicLibraryActivity;
import org.xbmc.android.remote.presentation.controller.AlbumListController;
import org.xbmc.api.object.Artist;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class AlbumFrag extends Fragment {
	private AlbumListController mAlbumController;
	private Handler mHandler;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fraglistalbum, container, false);
		mHandler = new Handler();
		mAlbumController = new AlbumListController();
		mAlbumController.findTitleView(v.findViewById(R.id.albumlist_fragment_layout));
		mAlbumController.findMessageView(v.findViewById(R.id.albumlist_fragment_layout));
		mAlbumController.onCreate(getActivity(), mHandler, (ListView)v.findViewById(R.id.albumlist_list));
		return v;
	}
	
	public void update(Artist artist) {
		mAlbumController.update(artist);
	}

	public void showAll() {
		mAlbumController.showAll();
	}
}
