import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // Declare an array list
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    // Add Songs
    desertIslandPlaylist.add("Deceptacon. Le Tigre");        
    desertIslandPlaylist.add("Ivy. Frank Ocean");        
    desertIslandPlaylist.add("Won't Stand Down. Muse");
    desertIslandPlaylist.add("Cornfield Chase Hans Zimmer");
    desertIslandPlaylist.add("In My Room. Frank Ocean");        
    desertIslandPlaylist.add("Trench album. Twenty One Pilots");        
    desertIslandPlaylist.add("Why I Love You. Jay-Z, Kanye West");

    // Print the array list
    System.out.println(desertIslandPlaylist);
    // Print the size
    System.out.println(desertIslandPlaylist.size());
    
    // Remove some songs
    desertIslandPlaylist.remove(4);
    desertIslandPlaylist.remove(5);

    // Check the new array list and its size
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
  
    // Swap songs
    String songA = desertIslandPlaylist.get(1);
    String songB = desertIslandPlaylist.get(3);

    desertIslandPlaylist.set(1, songB);
    desertIslandPlaylist.set(3, songA);

    System.out.println(desertIslandPlaylist);
  }
  
}