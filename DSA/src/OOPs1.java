class Political{
    void showSupport(){}
}
interface Scam{
 default void money(){

 }
}
class AAP extends Political implements Scam{
    @Override
    void showSupport() {
        System.out.println("This is AAP");
    }
}
class OOPs1{
   static void show(){
        System.out.println("Forst");
    }


    public static void main(String[] args) {
//        OOPs1 a  = new OOPs1();
//        a.show();
//        AAP aap = new AAP();
//        aap.showSupport();
//        OOPs1.show();
        AAP a = new AAP();
        AAP b = new AAP();
        a.showSupport();
        b.showSupport();




    }
}