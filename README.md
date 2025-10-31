#java-oop-exam-remove-vowels
Java OOP exam task (FernUniversität in Hagen, 2025) – removes all vowels (a, e, i, o, u) from a given text using regex replacement. Demonstrates string processing and use of Java text blocks.

#OOP2025 – Task 3: Strings (FernUniversität in Hagen)

This repository contains my **Java solution** for the string manipulation task from the *Object-Oriented Programming (OOP)* course (**Course 63016**) at **FernUniversität in Hagen**.

The task required removing all vowels (a, e, i, o, u) — both lowercase and uppercase — from a long German text using Java.  
It demonstrates the use of **string processing**, **regular expressions (regex)**, and **Java text blocks** (`"""`).

---

#Task Screenshot
![OOP String Task](OOP2025%20-%20task%203%20-%20Zeichenketten/OOP2025%20-%20task3%20-%20Zeichenketten.png "OOP2025 – Task 3 – Zeichenketten (FernUniversität in Hagen)")

> 📘 *This screenshot shows the original string processing task from the FernUniversität in Hagen (Course 63016).*  
> The **task belongs to the FernUniversität in Hagen** and is used here only for **educational and illustrative purposes**.  
> The **Java solution** was fully implemented by **Michael Kain** and received *full marks for the programming section*.

---

#Evaluation Screenshot
![OOP Evaluation Screenshot](OOP2025%20-%20task%203%20-%20Zeichenketten/OOP2025%20-%20task%201-5%20-%20Evaluation%20%26%20Score.png "OOP2025 – Evaluation (FernUniversität in Hagen)")

> 📜 *Official evaluation sheet from FernUniversität in Hagen.*  
> I achieved **full points for the programming part**, confirming correctness and functionality.  
> Displayed here for transparency and documentation purposes.

---

##Java Implementation

```java
/**
 * FernUniversität in Hagen – OOP2025 Task 3: Strings
 * Solution written by Michael Kain
 * Received full marks for the programming part
 */

public class VokaleEntfernen {

    // Mainmethode mit Textblock (Java 15+)
    public static void main(String[] args) {

        String text = """
        Eine zentrale Fragestellung in der Entwicklung von Software-Systemen ist im Regelfall die Korrektheit des Systems. Bei sicherheitskritischen Systemen, beispielsweise der Steuersoftware einer Rakete oder eines Atomkraftwerks ist es unbedingt notwendig, dass die Software genau das gewuenschte Verhalten zeigt. Anderenfalls koennen Menschenleben gefaehrdet oder große wirtschaftliche Schaeden hervorgerufen werden. Aber selbst bei Software, die im Fall einer Fehlfunktion nicht unmittelbar zu fatalen Konsequenzen fuehrt, ist die Frage der Korrektheit spaetestens bei der Verguetung der Entwicklungstaetigkeit nicht unerheblich. Um die Korrektheit eines Software-Systems zu ueberpruefen, gibt es zwei grundsaetzliche Ansaetze: Software kann entweder verifiziert oder getestet werden. Ziel der Verifikation ist es, einen absoluten Beweis fuer die Korrektheit zu erbringen, wohingegen beim Testen vor allem das Identifizieren von Fehlern im Vordergrund steht. In diesem Kurs soll das Testen als Technik zur ueberpruefung der Korrektheit eines Software-Systems allerdings nicht in den Fokus gerueckt werden. Testverfahren werden ausfuehrlich in den Veranstaltungen des Lehrgebiets Softwaretechnik diskutiert. Stattdessen konzentrieren wir uns im vorliegenden Kurs ausschließlich auf Verifikationstechniken. Idealerweise stellt man sich als Software-Entwickler Verifikation von Software wahrscheinlich ungefaehr wie folgt vor: Gegeben sei ein Software-System, im einfachsten Fall unmittelbar in Form des Quelltextes, sowie eine formale Beschreibung der gewuenschten Eigenschaft des Systems, beispielsweise in Form von Vor- und Nachbedingungen oder in Form eines logischen Ausdrucks. Der Entwickler gibt beide Eingaben in eine bereits vorweg implementierte Blackbox, drueckt einen Knopf mit der Aufschrift 'verifizieren', wartet eine Weile und erhaelt am Ende entweder die Ausgabe 'ja' oder 'nein' - je nachdem ob die Eigenschaft erfuellt ist oder nicht. Exemplarisch sei diese Idealvorstellung in der nachfolgenden Abbildung dargestellt.
        """;

        // Entfernt alle Vokale (a, e, i, o, u – groß & klein)
        String ohneVokale = text.replaceAll("(?i)[aeiou]", "");

        // Ausgabe des Ergebnisses
        System.out.println(ohneVokale);
    }
}
