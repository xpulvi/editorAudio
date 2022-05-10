package allenamento_test_sbara.esercizi.editor_audio;

public class EditorAudio {

    public static void main(String[] args) {

        int silezio = 0;

        int rumoreBianco = 0;
        /**
         * @rumoreBiancoTag
         * tutti i rumori imprevisti ma che si ripetono.
         * esepio: il tichetio di una matita sul banco.
         *      il rumore delle ventole di un server nel altra stanza.
         */
        int rumoreBiancoTag = 0;
        int rumore;
        int suono;
        int parlato;

        /**
         * @parlatoTag
         * identifica il parlato delle persone e tagga le voci delle persone.
         */
        int parlatoTag = 0;

        /**
         *
         condizione taglia silenzio
         se il silenzio e piu lungo di 10 secondi vine tagliato dalla tracia audio
         */
        if(silezio> 10){
            System.out.println("ho toltto il silenzi: " + silezio);
        }else if(silezio<= 10){
            System.out.println("ho mantenuto i silenzi: " + silezio);
        }

        /** stesa cosa di prima ma per il rumore bianco
         * TODO stare attento che non tronchi parlato
         *
         */
        if(rumoreBianco> 10){
            System.out.println("ho toltto il silenzi: " + rumoreBianco);
        }else if(silezio<= 10){
            System.out.println("ho mantenuto i silenzi: " + rumoreBianco);
        }

        /**TODO come divido il rumore e il parlato se acadono nello steso momento?
         *
         */

    }


}
