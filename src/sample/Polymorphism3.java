package sample;

public class Polymorphism3 {

    public static void main(String[] args) {
        
        TV2 tv =new TV2();
        PC pc =new PC();
        use(tv);
        use(pc);
                
            }
        
            private static void use(Electrical ele) {
                ele.power();
            }
}
