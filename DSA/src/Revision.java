//steps -->make interface
//
//class Engine1{
//    void start(){
//        System.out.println("Engine starts");
//    }
//}
interface  Engine1{
    void start();
}
class BMW1 implements  Engine1{
    @Override
    public void start() {
        System.out.println("BmW Hp is 500");
    }}
class Maruti1 implements Engine1{
    @Override
    public void start() {
        System.out.println("Maruti engine with 120 Hp");
    }}
class Car{
    private Engine1 engine1;
    public Car(Engine1 e){
        this.engine1 = e;
    }}
class Revision {
    public static void main(String[] args) {
        Engine1 e = new BMW1();
        Engine1  e1 = new Maruti1();
        Car c = new Car(e);
        e.start();

    }
}
