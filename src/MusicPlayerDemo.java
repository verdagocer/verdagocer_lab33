public class MusicPlayerDemo{
    public static void main(String[] args){
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("shape of you - ed sheeran");
        playlist.addSong("save me - bts");
        playlist.addSong("snap - manifest");
        playlist.addSong("like jennie - jennie");
        System.out.println("===playlist===");
        playlist.displayPlaylist();
        System.out.println("\n===current song playing===");
        playlist.displayCurrentSong();
        System.out.println("\n===next song to play===");
        playlist.nextSong();
        System.out.println("\n===next song to play===");
        playlist.nextSong();
        System.out.println("\n===previous song to play===");
        playlist.previousSong();
        System.out.println("\n===after removing shape of you song===");
        playlist.removeSong("shape of you - ed sheeran");
        playlist.displayPlaylist();
        System.out.println("\n===after removing snap song===");
        playlist.removeSong("snap - manifest");
        playlist.displayPlaylist();
    }
}

