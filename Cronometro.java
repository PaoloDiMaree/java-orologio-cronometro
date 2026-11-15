public class Cronometro extends Orologio {
    private int centesimi;

    // All'atto della creazione il cronometro parte sempre da zero
    public Cronometro() {
        super();
        this.centesimi = 0;
    }

    public void setCentesimi(int centesimi) {
        if (centesimi >= 0 && centesimi < 100) {
            this.centesimi = centesimi;
        } else {
            this.centesimi = 0;
        }
    }

    public int getCentesimi() {
        return centesimi;
    }

    @Override
    public void azzera_Tempo() {
        super.azzera_Tempo();
        this.centesimi = 0;
    }

    @Override
    public String getTempo() {
        return String.format("%02d:%02d:%02d:%02d", ore, minuti, secondi, centesimi);
    }
}
