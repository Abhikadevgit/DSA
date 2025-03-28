import java.util.ArrayList;

public class AlDemo {

    private int [] arr;
    private int size;
    private int capacity;

    public  AlDemo(){
        capacity =5;
        arr =new int[capacity];
        size =0;
    }

    //add element
    public void add(int e){
        if(size==capacity){
            resize();
        }
        arr[size] = e;
        size++;
    }

    private void resize() {
    capacity = capacity*2;
    int [] newArr= new int[capacity];
    for(int i=0;i<size;i++){
        newArr[i] =arr[i];
    }
    arr =newArr;
    }


    public static void main(String[] args) {
//        ArrayList<Integer> a =new ArrayList<>(new ArrayList<>());
    }
}
