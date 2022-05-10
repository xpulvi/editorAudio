package allenamento_test_sbara.esercizi.editor_audio;

public interface IEditorAudio {

    /**
     * conta le trace audio inserite
     */
    public void contaTraceInserite();

    /**
     * conta le trace audio inserite oggi.
     * TODO usare una mappa (per le tracie)
     */
    public void contaTraceInseriteOggi();

    /**
     * aumenta il volume del file.
     * per permeterre di identificare meglio se qualcuno parla ho meno.
     */
    public void moreAudio();

}
