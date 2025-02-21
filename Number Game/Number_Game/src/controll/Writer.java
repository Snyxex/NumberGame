/*
 * 
 */
package controll;


import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Writer {

    // Deklaration der Instanzvariablen
    private LocalDate currentDate; // Aktuelles Datum
    private LocalTime currentTime; // Aktuelle Uhrzeit
    public static int numberOfTries = 10; // Anzahl der Versuche
    private String dateString; // Datum als Zeichenkette
    private String timeString; // Uhrzeit als Zeichenkette
    public static String playerID = ""; // Spieler-ID

    // Konstruktor der Klasse Writer
    public Writer() {
        date(); // Aufruf der Methode zur Bestimmung des Datums
        time(); // Aufruf der Methode zur Bestimmung der Uhrzeit
        saveCurrentDateToFile(); // Aufruf der Methode zum Speichern des Datums in eine Datei
    }

    // Methode zur Bestimmung des aktuellen Datums
    public void date() {
        currentDate = LocalDate.now(); // Aktuelles Datum ermitteln
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Datumsformat festlegen
        dateString = currentDate.format(date); // Formatierung des Datums als Zeichenkette
    }

    // Methode zur Bestimmung der aktuellen Uhrzeit
    public void time() {
        currentTime = LocalTime.now(); // Aktuelle Uhrzeit ermitteln
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss"); // Uhrzeitformat festlegen
        timeString = currentTime.format(time); // Formatierung der Uhrzeit als Zeichenkette
    }

    // Methode zum Speichern des aktuellen Datums in eine Datei
    public void saveCurrentDateToFile() {
        try {
            FileWriter writer = new FileWriter("Statistic_save.txt", true); // FileWriter zum Schreiben in Datei initialisieren
            StringBuilder sb = new StringBuilder(); // StringBuilder für den Aufbau der Zeile
            
            // Nur wenn die Anzahl der Versuche kleiner als 10 ist, wird der Schreibvorgang fortgesetzt
            if (numberOfTries < 10) {
                // Zeile mit Informationen zusammenstellen
                sb.append(playerID); // Spieler-ID
                sb.append(" ");
                sb.append(dateString); // Datum
                sb.append(" ");
                sb.append(timeString); // Uhrzeit
                sb.append(" ");
                sb.append(Selectmode.mode); // Spielmodus
                sb.append(" ");
                sb.append(Gamemodeone.finished); // Beendigungsstatus
                sb.append(" ");
                sb.append(numberOfTries * (-1) + 10); // Anzahl der Versuche (negative Anzahl)
                sb.append("\n"); // Zeilenumbruch
                
                // Zeile in die Datei schreiben
                writer.write(sb.toString());
                writer.close(); // FileWriter schließen
            }
        } catch (IOException e) {
            e.printStackTrace(); // Fehlerausgabe bei IOException
        }
    }
}
