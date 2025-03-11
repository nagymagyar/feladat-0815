import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public ArrayList<Laktat> readFile() {
        
        try {
             return tryreadFile();
             } catch (FileNotFoundException e) {
                System.err.println("Hiba! A fájl nem található");
                System.err.println(e.getMessage());
                return null;
            
        }
    }
    private ArrayList<Laktat> tryreadFile()  throws FileNotFoundException{
        ArrayList<Laktat> Laktat = new ArrayList<> ();
        File file = new File("laktat.txt");
        try(Scanner sc = new Scanner(file, "utf8")){
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                String[] arr= line.split("0");
                Laktat laktat = new Laktat();
                laktat.setNev(arr[1]);
                laktat.setVaros(arr[2]);
                laktat.setHazszam((arr[3]));
                laktat.setVege(LocalDate.parse(arr[4]));
                laktat.add(lakas);

                System.out.println(laktat.getSzulido());
                
            }
        }
        return laktat;
    } 
}


