public class Arr {
    private int [] data;
    private int size;

    public Arr(){
        data = new int[10];
        size=0;
    }

    public void resize(){
        int [] newData = new int[data.length*2];
        for (int i =0;i< data.length;i++){
            newData[i]=data[i];
        }data = newData;
    }

    public void add(int e){
        if (size==data.length){
            resize();
        }
        data[size] =e;
        size++;
    }

    public int get(int index){
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    //reverse method//
    public void reverse(){
        int left =0;int right = size -1;
        while(left<right){
            int temp = data[left];
            data[left++] =data[right];
            data[right--] = temp;
        }
    }

    //insert at middle

    public void set(int index,int element){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Invalid index");

        }
        data[index] = element;
    }

    public void remove(int index){
        if(index<0 || index>=size){
            throw  new IndexOutOfBoundsException("Invalid Index");
        }
        for(int i =index;i<size-1;i++){
            data[i] = data[i+1];
        }size--;
//        data[size] =0;
    }

    public void printList(){
        System.out.print("[");
        for (int i=0; i<size;i++){
            System.out.print(data[i]);

        if(i!=size-1){
            System.out.print(",");
        }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Arr a =new Arr();
        a.add(6);
        a.add(7);
        a.add(8);
        a.remove(1);
        a.printList();
        a.reverse();
        a.printList();
    }
}
