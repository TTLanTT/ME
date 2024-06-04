public class Main {
    public static void main(String[] args) {
        Super sup = new Super();
        Sub sub = new Sub();
        Super poli = new Sub();

        sup.print();
        sub.print();
        poli.print();
    }
}
