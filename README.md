# Gestione Orologio e Cronometro in Java

Esercitazione pratica di Programmazione Orientata agli Oggetti (OOP) in Java sviluppata per approfondire incapsulamento, ereditarietà tra classi e ridefinizione dei metodi (`@Override`).

## Struttura del progetto

* `Orologio.java`: classe base che modella un orologio digitale (`HH:MM:SS`) con controlli di validità sui valori inseriti, azzeramento e avanzamento di un secondo.
* `Cronometro.java`: sottoclasse che estende `Orologio` aggiungendo l'attributo `centesimi` (`HH:MM:SS:CC`) e ridefinendo i metodi `azzera_Tempo()` e `getTempo()`.
* `ProgOrologio.java`: programma principale con menu testuale per testare le istanze delle due classi.
## Compilazione ed esecuzione

```bash
javac Orologio.java Cronometro.java ProgOrologio.java
java ProgOrologio
```
