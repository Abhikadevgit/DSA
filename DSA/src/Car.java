class Vehicle{

    private int a;
    void show(){}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

interface Engine{
    void hP();

}
class BMW  implements  Engine{
    private Engine engine;
    public BMW(){}
    public BMW(Engine e){
        this.engine=e;
        e.hP();
    };
    public void show(){
        System.out.println("BMW");
    }

    @Override
    public void hP() {

    }
}
class  Implementation{

public static void main(String[] args) {
//    Tightly coupled code
//    Engine e = new engine();
//    BMW b =new BMW(e)

    Vehicle v = new Vehicle();
    v.setA(5);
    System.out.println(v.getA());

//
//    Engine engine = new Engine()
//    {
//        @Override
//        public void hP() {
//            System.out.println("200");
//        }
//    };
//    Engine m = new Engine()
//    {
//        @Override
//        public void hP() {
//            System.out.println("Maruti hp");
//        }
//    };
//
//    BMW b = new BMW(engine );
//      b.hP();
      //Maruti m = new Maruti(m);
}









        }
//Accesing(child) has a object of another class












