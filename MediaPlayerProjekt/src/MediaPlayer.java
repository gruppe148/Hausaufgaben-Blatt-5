import iste.media.de.*;

class MediaPlayer {

	/**
	 * @param args
	 */
	public static void main(String[] args)
   	{
		//Generiert 2 Objekte der Klasse Song
		Song song1 = new Song();
		song1.name = "BugsBunny"; 
		song1.type = "Musik";
		song1.duration = 35;

		Song song2 = new Song();
		song2.name ="Tour";
		song2.type="Rock";
		song2.duration=90; 

		//generiert ein Objekt playlist
		Playlist playlist = new Playlist();

		//fügt die Lieder der Playlist hinzu ung gibt die Playlist aus
		playlist.addSong(song1);
		playlist.addSong(song2);

		playlist.printSongList();		
		playlist.printCountItem();

		
		//entfernt ein Lied und überprüft die Anzahl der elemente		
		playlist.removeSong(1);
		playlist.printSongList();		
		playlist.printCountItem();
	
		//Generiert 2 Objekte der Klasse Video TODO
		Video video1 = new Video();
		video1.name = "300";
		video1.type = "Movie";
		video1.duration = 118;

		Video video2 = new Video();
		video2.name = "My Little Pony";
		video2.type = "Series";
		video2.duration = 21;

		//fügt die Lieder der Playlist hinzu ung gibt die Playlist aus
		playlist.addVideo(video1);		
		playlist.addVideo(video2);
		playlist.printVideoList();
		playlist.printCountItem();		

		//gibt die Gesammte Playlist aus
		playlist.printPlayList();
   	}
}
