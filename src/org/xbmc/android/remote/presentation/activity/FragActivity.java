package org.xbmc.android.remote.presentation.activity;

import org.xbmc.android.remote.R;
import org.xbmc.android.remote.presentation.fragment.*;
import org.xbmc.api.object.Album;
import org.xbmc.api.object.Artist;

import android.app.Activity;
import android.os.Bundle;

public class FragActivity extends Activity implements FragmentUpdateListener {
	
	ArtistFrag artists;
	AlbumFrag albums;
	SongFrag songs;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newmain);
    	artists = (ArtistFrag) getFragmentManager().findFragmentById(R.id.artistFrag);
    	albums = (AlbumFrag) getFragmentManager().findFragmentById(R.id.albumFrag);
    	songs = (SongFrag) getFragmentManager().findFragmentById(R.id.songFrag);

	}

	public void updateAlbums(Artist artist) {
		albums.update(artist);
		
	}

	public void showAllAlbums() {
		albums.showAll();
		
	}

	public void updateSongs(Album album) {
		songs.update(album);
		
	}

	public void showAllSongs() {
		songs.showAll();
		
	}
}
