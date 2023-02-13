---
marp: false
title: Corso di programmazione Javascript
paginate: true
author: mauro
---

Mauro Bogliaccino

# Corso Java

---

## Obiettivo formativo

* Imparare la programmazione ad oggetti
* attraverso lo studio di un programma OO
* capire la logica del linguaggio
* sperimentare la sintassi

---

## caso pratico: logica di programmazione

* progettare e sviluppare il gioco "sasso carta forbici"
* descrivere l'algoritmo e il diagramma di flusso

---

## esempio applicativo: Banca

scrivere un programma che costruisca un conto bancario chiamato mioConto,

* versi in esso $1000,
* prelevi da esso $500,
* prelevi altri $400 e
* infine visualizzi il saldo rimanente.

Il programma deve poi creare un altro conto bancario chiamato contoMamma,  utilizzando il costruttore che inizializza la variabile saldo.

Su quest’ultimo conto deve essere poi applicato un interesse del 10%,  a seguito del quale viene stampato il saldo.

---

## esercitazione 2

* [schema esercizio](https://github.com/maboglia/CorsoJava/blob/master/esercitazioni/0_Tracce/JavaSE/J2SE_GestioneBanca.pdf)

---

## esercitazione : lettura e scrittura file

Gli agenti di borsa della banca Fraudolent compiono operazioni finanziare quotidianamente ed annotano le operazioni su un file, nel seguente formato: “ABC 50.0 210 B”, dove

* “ABC” è il nome dell’azione acquistata/venduta
* 50.0 è l’importo della singola azione
* 210 è la quantità
* ‘B’ è l’operazione, che può valere ‘B’ (Buy) o ‘S’ (Sell)

---

Si vuole quindi un programma che:

* legga il file inviato dagli agenti e lo restituisca come array (o List) di stringhe
* per ogni riga calcoli l’importo dell’operazione ed alla fine produca una semplice riga:
* “Op: (nn) Buy: (bb) Sell: (ss)”

* dove al posto di (nn) ho ul numero di operazioni lette, al posto di (bb) l’importo totale delle operazioni di acquisto ed in (ss) l’importo totale delle operazioni di vendita.

---

Complicazione (opzionale):

* alcuni agenti commettono errori nello scrivere il file, pertanto alcune righe potranno non rispondere allo standard (che è molto rigido!). Le righe “sbagliate” non vanno considerate, ma vanno elencate alla fine del processo, dopo la riga di output del programma, in questo modo:
* Op: (nn) Buy: (bb) Sell: (ss)
* Err: (ee)
* (riga sbagliata 1)
* (riga sbagliata 2)
* (riga sbagliata 3)
        …
