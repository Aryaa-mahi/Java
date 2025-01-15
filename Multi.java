class A{
    int a;
    void set_A(int x){
        a = x;
    }
}
class B extends A{
    int b;
    void set_B(int x){
        b = x;
    }
}
class C extends B{
    int c,product;
    void cal_product(){
        product= a*b;
        System.out.println("Product :" +product);
    }
}
public class Multi{
    public static void main(String[] args) {
        C c = new C();
        c.set_A(10);
        c.set_B(5);
        c.cal_product();
    }
    
}
