class Child extends Parent {
    
    public Child(int privateVar, int protectedVar, int publicVar) {
        super(privateVar, protectedVar, publicVar);
    }
   
    public void accessVariables() {
       
        int privateVarAccessed = getPrivateVar();
        
        int protectedVarAccessed = protectedVar;
        int publicVarAccessed = publicVar;
        
        System.out.println("Accessed private variable: " + privateVarAccessed);
        System.out.println("Accessed protected variable: " + protectedVarAccessed);
        System.out.println("Accessed public variable: " + publicVarAccessed);
    }




    public static void main(String[] args) {
        Child child = new Child(10, 20, 30);     
        child.accessVariables();
    }
}
