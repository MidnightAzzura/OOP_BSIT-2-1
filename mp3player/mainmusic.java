package mainmusic;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainmusic {
	private static Player player;
	private static boolean playing = false;
	private static boolean actionInProgress = false;
	private static List<String> playlist = new ArrayList<>();
    private static int currentSongIndex = -1;
    // declarations 
    
    public static void main(String[] args) {
    	
    	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	String input;
    	
    	do {
    		
    		System.out.println("Enter the song location to add it");
    		input = scanner.nextLine(); // adds the song path location to the play
    		if (!input.equals("done"));
    		   playlist.add(input); 
    	} while (!input.equals("done"));
    	
    	if (playlist.isEmpty()) {
    		
    		System.out.println("Song are not added try again");
    		System.exit(0);
    	}
    	
    	while (true) {
    		
    		System.out.println("Type play to playback, next to next the song, previous to go back, exit to stop the music player");
    		input = scanner.nextLine();
    		
    	switch(input) {
    	
    	case "play":
    	 play();
    	break;
    	
    	case "next":
    		next();
    		break;
    		
    	case "previous":
    		previous();
    		break;
    		
    	case "stop":
    	stop();
    	break;
    		
    	case "exit":
    		exit();
    		break;
    	
    		default:
    			System.out.println("Invalid Input");
    	
    	
    	  }
    	}
    }
    
    private static void play() {
    	
    	if(!playing) {
    		
    		currentSongIndex = 0;
    		playSong(currentSongIndex);
    		playing = true;
    	} else {
    		System.out.println("Playback is already in progress");
    	}
    }
    
    private static void playSong(int index) {
    	
    	if (index >= 0 && index < playlist.size()) {
    		
    		try {
    			String filePath = playlist.get(index);
    			FileInputStream fileInputStream = new FileInputStream(filePath);
    			if (player != null) {
    				
    				player.close();
    			}
    			player = new Player(fileInputStream);
    			System.out.println("Now Playing: " + filePath);
    			player.play();
    		} catch (FileNotFoundException | JavaLayerException e) {
    			
    			e.printStackTrace();
    		}
    		
    	}
    }
    
    private static void next() {
    	
    	if(currentSongIndex < playlist.size()-1) {
    		
    		currentSongIndex++;
    		playSong(currentSongIndex);
    	} else {
    		System.out.println("No more songs in the list. "); // limit is only three
    		
    	}
    }
    
    private static void previous() {
    	
    	if(currentSongIndex > 0) {
    		
    		currentSongIndex--;
    		playSong(currentSongIndex);
    	} else {
    		
    		System.out.println("First song in the list ");
    	}
    }
    
    private static void stop() {
    	if (player != null) {
    		player.close();
    		playing = false;
    		System.out.println("Playback has Stopped");
    		}
    }
    
    private static void exit() {
    	
    	if(player != null) {
    		
    		player.close();
    	}
    	
    	System.out.println("Exiting the player thank you for using!");
    	System.exit(0);
    }
	
}
