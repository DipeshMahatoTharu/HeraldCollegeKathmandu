public class Parent {
    private int privateVar;
    protected int protectedVar;
    public int publicVar;

    
    public Parent(int privateVar, int protectedVar, int publicVar) {
        this.privateVar = privateVar;
        this.protectedVar = protectedVar;
        this.publicVar = publicVar;
    }

    
    public int getPrivateVar() {
        return privateVar;
    }
}
