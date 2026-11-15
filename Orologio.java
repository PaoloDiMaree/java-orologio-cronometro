public class Orologio {
    protected int ore;
    protected int minuti;
    protected int secondi;

    // Costruttore senza parametri: inizializza l'orario a 00:00:00
    public Orologio() {
        azzera_Tempo();
    }

    // Costruttore con parametri
    public Orologio(int ore, int minuti, int secondi) {
        setOre(ore);
        setMinuti(minuti);
        setSecondi(secondi);
    }

    public void setOre(int ore) {
        if (ore >= 0 && ore < 24) {
            this.ore = ore;
        } else {
            this.ore = 0;
        }
    }

    public void setMinuti(int minuti) {
        if (minuti >= 0 && minuti < 60) {
            this.minuti = minuti;
        } else {
            this.minuti = 0;
        }
    }

    public void setSecondi(int secondi) {
        if (secondi >= 0 && secondi < 60) {
            this.secondi = secondi;
        } else {
            this.secondi = 0;
        }
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void azzera_Tempo() {
        this.ore = 0;
        this.minuti = 0;
        this.secondi = 0;
    }

    // Funzione extra: fa avanzare l'orologio di un secondo gestendo i riporti
    public void aggiungiSecondo() {
        secondi++;
        if (secondi >= 60) {
            secondi = 0;
            minuti++;
            if (minuti >= 60) {
                minuti = 0;
                ore++;
                if (ore >= 24) {
                    ore = 0;
                }
            }
        }
    }

    public String getTempo() {
        return String.format("%02d:%02d:%02d", ore, minuti, secondi);
    }
}
