public class VokaleEntfernen {
    //Mainmethode für einheitliche Klasse - UND """ Trick für Ersetzung von Textinhalt bzw. String Text
    public static void main(String[] args) {
        String text = """
        Eine zentrale Fragestellung in der Entwicklung von Software-Systemen ist im Regelfall die Korrektheit des Systems. Bei sicherheitskritischen Systemen, beispielsweise der Steuersoftware einer Rakete oder eines Atomkraftwerks ist es unbedingt notwendig, dass die Software genau das gewuenschte Verhalten zeigt. Anderenfalls koennen Menschenleben gefaehrdet oder große wirtschaftliche Schaeden hervorgerufen werden. Aber selbst bei Software, die im Fall einer Fehlfunktion nicht unmittelbar zu fatalen Konsequenzen fuehrt, ist die Frage der Korrektheit spaetestens bei der Verguetung der Entwicklungstaetigkeit nicht unerheblich. Um die Korrektheit eines Software-Systems zu ueberpruefen, gibt es zwei grundsaetzliche Ansaetze: Software kann entweder verifiziert oder getestet werden. Ziel der Verifikation ist es, einen absoluten Beweis fuer die Korrektheit zu erbringen, wohingegen beim Testen vor allem das Identifizieren von Fehlern im Vordergrund steht. In diesem Kurs soll das Testen als Technik zur ueberpruefung der Korrektheit eines Software-Systems allerdings nicht in den Fokus gerueckt werden. Testverfahren werden ausfuehrlich in den Veranstaltungen des Lehrgebiets Softwaretechnik diskutiert. Stattdessen konzentrieren wir uns im vorliegenden Kurs ausschließlich auf Verifikationstechniken. Idealerweise stellt man sich als Software-Entwickler Verifikation von Software wahrscheinlich ungefaehr wie folgt vor: Gegeben sei ein Software-System, im einfachsten Fall unmittelbar in Form des Quelltextes, sowie eine formale Beschreibung der gewuenschten Eigenschaft des Systems, beispielsweise in Form von Vor- und Nachbedingungen oder in Form eines logischen Ausdrucks. Der Entwickler gibt beide Eingaben in eine bereits vorweg implementierte Blackbox, drueckt einen Knopf mit der Aufschrift 'verifizieren', wartet eine Weile und erhaelt am Ende entweder die Ausgabe 'ja' oder 'nein' - je nachdem ob die Eigenschaft erfuellt ist oder nicht. Exemplarisch sei diese Idealvorstellung in der nachfolgenden Abbildung dargestellt.
        """;

        // Alle Selbstlaute entfernen (groß und klein geschrieben)
        String ohneVokale = text.replaceAll("(?i)[aeiou]", "");

        // Ergebnis ausgeben also Text ohne Selstlaute!
        System.out.println(ohneVokale);
    }
}
