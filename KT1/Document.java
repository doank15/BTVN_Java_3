public class Document {
    protected static int id = 0;
    protected String name;
    protected String publisher;
    protected float price;
    public Document() {
        id++;
    }
}
