package mpThreePlayer;

import java.util.ArrayList;

public class Playlist {
    private final ArrayList<DefaultPlaylist> defaultPlaylists = new ArrayList<>();
    private final ArrayList<Music> songs = new ArrayList<>();

    public void addSongToPlaylist(Music song)
    {
        songs.add(song);
    }
}
