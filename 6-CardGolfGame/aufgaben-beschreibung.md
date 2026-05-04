Projekt 1: 6-Karten-Golf

Im ersten Projekt des SoPra26b soll das einfache Kartenspiel 6-Karten-Golf (in der SoPra-Variante) als Kotlin-Anwendung unter Verwendung des BoardGameWork realisiert werden.
Material und Aufbau

6-Karten-Golf ist ein Kartenspiel für 2-4 Spieler und wird mit einem Standard-Blatt bestehend aus 52 Karten gespielt:

{Kreuz, Pik, Herz, Karo} x {2, 3, 4, 5, 6, 7, 8, 9, 10, Bube, Dame, König, Ass}

Zu Beginn des Spiels bekommt jede*r Spielende (geheim) sechs Karten, die vor ihm in 2 Reihen à 3 Karten verdeckt ausgelegt werden. Die übrigen Karten werden als Nachziehstapel verdeckt in die Mitte gelegt. Die oberste Karte des Nachziehstapels wird dann aufgedeckt und neben den Nachziehstapel als Ablagestapel gelegt. Vor dem eigentlichen Beginn des Spiels deckt jede*r Spielende reihum zwei Karten auf („Aufdeckrunde“). Jede*r Spielende ist hier ein mal am Zug und deckt zwei Karten gleichzeitig auf.
Punktewertung

Ziel des Spiels ist es, am Ende die wenigsten Punkte zu haben. Gewertet wird hierbei die Summe aller Karten, mit folgenden Werten:

    Ass = 1 Punkt
    2 = -2 Punkte
    3 - 10 = jeweils angegebener Wert der Karte als Punkte
    Bube, Dame = 10 Punkte
    König = 0 Punkte
    Gibt es im 2×3-Raster eine Spalte mit Karten (einschließlich Zweien), die denselben Kartenwert haben, werden diese beiden Karten zusammen mit 0 Punkten bewertet.

Beispiele für die Punkteberechnung:

→ 0 + 10 + 1 - 2 + 0 = 9 Punkte
Spielablauf

Beginnend bei der*dem ersten Spielenden nach der Aufdeckrunde sind reihum alle Spielenden an der Reihe und führen einen der Spielzüge durch.
Aktionen eines Spielers:

    Karte(n) aufdecken: Die*Der Spielende deckt nach eigener Wahl ein oder zwei verdeckte Karten des eigenen 2×3-Rasters auf.
    Eine Karte vom Nachziehstapel ziehen: Die oberste Karte wird vom Nachziehstapel gezogen. Die*Der Spielende kann dann entscheiden:
        Die Karte wird mit einer der eigenen (verdeckten oder offenen) Karten getauscht. Die neue Karte wird offen an die Stelle der getauschten Karte gelegt, auch wenn eine verdeckte Karte getauscht wurde. Die ausgetauschte Karte wird offen auf den Ablagestapel gelegt.
        Die Karte wird verworfen und direkt auf den Ablagestapel gelegt. Dann muss die*der Spielende eine der eigenen verdeckten Karten aufdecken.
    Eine Karte vom Ablagestapel ziehen: Die oberste Karte wird vom Ablagestapel gezogen und mit einer der (verdeckten oder offenen) Karten getauscht. Die neue Karte wird offen an die Stelle der getauschten Karte gelegt, auch wenn eine verdeckte Karte getauscht wurde. Die getauschte Karte wird auf den Ablagestapel gelegt.

Ist der Nachziehstapel leer, kann die entsprechende Aktion nicht durchgeführt werden.

Hat ein*e Spieler*in nach dem Ende der Aktion eine Reihe von Karten mit identischem Kartenwert (z.B. drei Könige), werden die Karten der Reihe entfernt und auf den Ablagestapel gelegt (von links nach rechts). Damit reduziert sich die Anzahl der zu wertenden Karten.
Spielende

Das Spiel endet, wenn ein*e Spieler*in in einem Zug alle Karten im eigenen 2×3-Raster aufgedeckt hat oder beide Reihen durch gleiche Kartenwerte abgelegt hat und danach jede*r andere Spieler*in noch einmal am Zug war.

Nun werden alle verbliebenen verdeckten Karten aller Spieler*innen aufgedeckt und ggf. die Regel zum Ablegen von Reihen durch identische Kartenwerte angewendet.

Gewonnen hat bei Spielende die*der Spieler*in mit der niedrigsten Punktzahl. Spieler*innen, die beide Reihen abgelegt haben, gewinnen automatisch („Punktzahl=-Unendlich“). Bei Punktegleichstand wird das Spiel als unentschieden gewertet. Die übrigen Platzierungen ergeben sich entsprechend der Punktzahl.
Anforderungen an das Programm

Das zu entwickelnde Programm soll den Spielablauf steuern und für die Einhaltung der Spielregeln sorgen. Hierbei sollen zusätzliche Features umgesetzt werden, die nicht direkt auf den Spielregeln basieren:

    Bei Programmstart sollen 2-4 Spieler zur Unterscheidung mindestens mit Namen konfiguriert werden können.
    Die Reihenfolge der Spielenden soll vor Spielstart sowohl frei wählbar konfiguriert als auch randomisiert werden können.
    Die Spieler wählen nacheinander und reihum am gleichen Bildschirm ihre Aktionen aus (Hotseat-Modus).
    Es soll ein textueller Log im Spiel existieren, der mindestens die Züge der letzten Spielrunde (= Anzahl Spieler*innen) Menschenlesbar zusammenfasst.
    Am Ende des Spiels soll das Punkteergebnis angezeigt werden und welche*r Spieler*in gewonnen hat.
    Es soll einen Test-Spiel-Modus geben, bei dem ein Kartendeck mit 3 statt 13 {2, König, Dame} unterschiedlichen Werten verwendet wird (für die 52 Karten müssen Karten mehrfach vorkommen), um die Sonderregeln leichter testen zu können.

