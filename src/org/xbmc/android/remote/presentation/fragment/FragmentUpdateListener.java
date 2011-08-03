package org.xbmc.android.remote.presentation.fragment;

import org.xbmc.api.object.Album;
import org.xbmc.api.object.Artist;

public interface FragmentUpdateListener {
	
	public void updateAlbums(Artist artist);
	public void showAllAlbums();
	
	public void updateSongs(Album album);
	public void showAllSongs();
}
