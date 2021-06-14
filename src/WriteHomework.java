public class WriteHomework {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    void writingHomework(String str){
        p.write(str);
    }

  
}
