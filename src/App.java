public class App {
    public static void main(String[] args) throws Exception {
        // pen is an interface, so it cant declere new obj
        Pen p = new PenAdapter();
        WriteHomework wh = new WriteHomework();
        wh.setP(p);
        wh.writingHomework("I don't have homework anymore");

        // it is like when we want to charge our iphone with samsung charger, we cant
        // connect it directly , but we need adapter
    }
}
