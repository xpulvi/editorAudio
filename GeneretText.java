package allenamento_test_sbara.esercizi.editor_audio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Nicolò Pulvirenti
 * genera il tuesto del audio doppo aver editato il file audio.
 *
 * conta il tempo che ai trascorso a registrare e lorario di inzio e fine registrazione.
 * esempio: inzio la registrazione della lezione sugli array alle ore 18:00 pasa un ora
 * finisco la registrazione. ci sono statti tagli del silenzio.
 * nel file tex trovero al minuto 40 taglio silenzio, a financo l'ora in i si e smeso di parlare
 * e ripreso a parlare (afiancato dal minuto in qui sie ripresa a parlare).
 */
public class GeneretText {

    // TODO     guarda questa documentazione: https://www.javatpoint.com/q/5931/java-code-for-converting-audio-to-text-and-video-to-audio
    /**TODO trova un nome piu corto per questa variabile
     *
     */
    protected String testoEstratoAudio;

    /** prende il testo estratto dal audio e lo mete nel file
     *
     * @param testoEstratoAudio
     * @param filePath
     */
    public void write(String testoEstratoAudio, String filePath) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write(testoEstratoAudio);
            bufferedWriter.newLine();
            bufferedWriter.write(testoEstratoAudio);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


