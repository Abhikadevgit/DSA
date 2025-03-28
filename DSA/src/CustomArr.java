import java.util.ArrayList;

class CustomArr {
    private int [] arr;
    int capacity;
    int size;//captures no. of elements
    //Arraylist a = new Arraylist()
    public CustomArr(){
        capacity=5;
        arr = new int[capacity];
        size=0;
    }
    private void increaseCapacity(){
        capacity = capacity*2;
        int[] newArr = new int[capacity];
        //collection framework has system.copyarray
        // which copies elements into new grown array
        for(int i=0;i<size;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public int get(int index){
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException("invalid index");
        }
        return arr[index];
    }

    public void add(int element){
        if(size==capacity){
            increaseCapacity();
        }
        arr[size]= element;
        size++;
    }
    public void remove(int index){
        if(index<0 || index >=size ){
            throw  new IndexOutOfBoundsException("Invald index");}

        for(int i = index;i<size-1;i++){
            arr[i]= arr[i+1];
        }
        size--;
    }
    public void printer(){
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }System.out.print("]");

    }
    public static void main(String[] args) {
//        ArrayList a1 = new ArrayList<>();//type-fail
//        a1.add(5);
//        a1.add("A");
//
//        ArrayList<Integer> a = new ArrayList<>();
        CustomArr c = new CustomArr();
        c.printer();
        c.add(5);//-->o(1)
        c.add(5);
        c.add(5);
        c.add(5);
        c.add(5);
        //arraw grow
        c.add(5);//-->o(n)

//        System.out.println(c.get(1));//-->o(1)
//        c.printer();
//        c.remove(3);//-->o(n)
//        c.printer();

    }
}
