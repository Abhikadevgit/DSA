import java.util.ArrayList;

public class MyArrayLIst {
    private int [] data;
    private int size;

    public MyArrayLIst(){
        data = new int[4];
        size =0;//no of elemts in array
    }

    //grow or resize
    private void resize(){
        int[] newData = new int[data.length*2];
        for(int i=0; i<data.length;i++){
            newData[i] = data[i];
        }
        data= newData;
    }
    //-->creation-->at first--> at an index
    private void add(int element){
        if (size == data.length){
            resize();
        }
        data[size] = element;
        size++;
    }
    public void printArr(){
        System.out.print("[");
        for(int i =0 ;i< size;i++) {
            System.out.print(data[i]);
        }
        System.out.println("]");

    }
    //set (index,element)-->updates element

    //get(index)

    //remove(index)
//    size-->IOOB--->index non negative

    public void remove(int index){
        if( index<0 || index>=size ){
        throw new IndexOutOfBoundsException("Invalid index"); }
        for(int i =index;i<size-1;i++){
            data[i] = data[i+1];
        }
        //cleaning task
        size--;
        data[size] =0;

    }
    public static void main(String[] args) {
        MyArrayLIst m = new MyArrayLIst();
        m.add(6);
        m.add(7);
        m.add(8);
        m.printArr();
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(6);
//        System.out.println(a);
        m.remove(2);
    }
}
