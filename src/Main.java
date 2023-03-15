public class Main {
    public static void main(String[] args) {
        // Räkna ut antalet dagar det tar att tjäna ihop 10 miljoner
        // Dag 1: 1 öre
        // Dag 2: 2 öre
        // Dag 4: 4 öre
        // ...

        double total = 0;
        double salary = 0.01;
        int days = 0;

        while (total < 10_000_000) {
            total += salary;
            salary *= 2;
            days++;
        }

        System.out.println("Det tog " + days + " dagar");
    }
}