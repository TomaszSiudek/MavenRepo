package pl.sda.arppl2.maven;

public class MainDebugger {
    public static void main(String[] args) {
        // #########################################################
        // int, double, float, byte, char, short, long
        // Integer, Double, Float, Byte, Character, Short, Long

        // Deklaracje:
        // Zmienna z wartością która jest liczbą całkowitą:
        int a;
//        a = 5;
//        a = a+1;

        // Zmienna z wartością która jest liczbą zmiennoprzecinkową:
        // dużej precyzji (zajmuje 64 bity = 8 bajtów)
        double b;

        // małej precyzji (zajmuje 32 = 4 bajty)
        float c;
        Float cc;

        // tekst - ciąg liter
        String zmiennaZTekstem;
        // #########################################################

        // Deklaracje z inicjalizacją:
        int zmiennaZWartosciaCalkowita = 5;

        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita * 23;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita / 7;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;

        // to jest wypisanie treści tekstowej
        System.out.println("zmiennaZWartosciaCalkowita"); // zmiennaZWartosciaCalkowita

        // to jest wypisanie wartości
        System.out.println(zmiennaZWartosciaCalkowita); // 59
        System.err.println("to jest inny wypis");
    }
