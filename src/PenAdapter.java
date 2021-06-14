public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();
    // with this adapter , we can connect the pilot pen and pen
    @Override
    public void write(String s) {
        pp.mark(s);
    }
    
}
