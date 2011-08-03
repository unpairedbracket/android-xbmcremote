package org.xbmc.android.remote.presentation.fragment;

import org.xbmc.android.remote.R;
import org.xbmc.android.remote.presentation.activity.MusicLibraryActivity;
import org.xbmc.android.remote.presentation.controller.ArtistListController;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ArtistFrag extends Fragment {
	private ArtistListController mArtistController;
	private Handler mHandler;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fraglistartist, container, false);
		mHandler = new Handler();
		mArtistController = new ArtistListController();
		mArtistController.findTitleView(v.findViewById(R.id.artists_fragment_layout));
		mArtistController.findMessageView(v.findViewById(R.id.artists_fragment_layout));
		mArtistController.onCreate(getActivity(), mHandler, (ListView)v.findViewById(R.id.artists_list));
		return v;
	}
}
