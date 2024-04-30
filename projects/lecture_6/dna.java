// Checks the DNA if it has protein
public class DNA {
  
  public static void main(String[] args) {
             
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    
    String dna = dna3;
    System.out.println(dna.length());
    
    // check if the string has a start codon
    int startCodon = dna.indexOf("ATG");
    int stopCodon = dna.indexOf("TGA");

    if(startCodon != -1 && stopCodon != -1 && ((dna.length() - 6) % 3 == 0)) {
      String protein = dna.substring(startCodon + 2, stopCodon);
      System.out.println("Protein found. Inject it in muscles");
    } else {
      System.out.println("No protein... No muscles");
    }
  }
  
}