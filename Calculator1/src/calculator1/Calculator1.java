
package calculator1;


public class Calculator1 {

    public int add;
            public int sub;
            public int mul;
            public int div;
            public void display()
            {
                System.out.println("Addition : "+add);
                System.out.println("Subtraction: "+sub);
                System.out.println("Multiply : "+mul);
                System.out.println("Divistion : "+div);
            }
            
    public static void main(String[] args) {
        Calculator1 a = new Calculator1();
        a.add = 3;
        a.add = 2;
        a.sub = 4;
        a.sub = 2;
        a.mul = 3;
        a.mul = 2;
        a.div = 8;
        a.div = 4;
        a.display();
        
                
    }
    
}
