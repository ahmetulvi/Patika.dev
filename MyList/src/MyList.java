public class MyList <T> {
    int capacity;
    T[] list;
    T[] tempList;
    int listSize=0;
    public void setList(){
        this.list=(T[]) new Object [this.capacity];
    }
    public MyList(int capacity){
        this.capacity=capacity;
        this.setList();
    }
    public MyList(){
        this.capacity=10;
        this.setList();
    }
    public int getCapacity(){
        return capacity;
    }
    public void tempCapacity(){
        this.tempList=(T[]) new Object[this.capacity];
        for (int i=0;i<this.list.length;i++){
            this.tempList[i]=this.list[i];
        }
        this.list=this.tempList;
    }
    public int size(){
        return this.listSize;
    }
    public void sizeCalc(){
        int size=0;
        for (int i=0; i<this.list.length;i++){
            if (this.list[i]!=null) {
                size++;
            }
        }
       this.listSize=size;
    }
    public void add(T data){
        if (this.size()<this.capacity){
            list[this.listSize]=data;
                sizeCalc();
        }else {
            this.capacity=capacity*2;
            this.tempCapacity();
            this.add(data);
        }

    }
    public T get(int index){
        T x=this.list[index];
        return x;
    }
    public void remove(int idx){
        T[] tempList=this.list;
        this.list[idx]=null;
        for (int i=0;i<this.list.length-1;i++){
            if (idx==0){
                this.list[i]=tempList[i+1];
            } else if (idx!=0 && i<idx) {
                this.list[i]=tempList[i];
            } else if (idx!=0 && i>idx) {
                this.list[i]=tempList[i+1];
            }
        }
        this.listSize--;
    }
    public void set(int idx, T data){
        this.list[idx]=data;

    }


    @Override
    public java.lang.String toString() {
        System.out.print("[");
        for (T x:list){
            if (x!=null){
                System.out.print(x+",");
            }

        }
        System.out.print("]");
        return "";
    }
    public  int indexOf(T data){
        for (int i=0;i<this.list.length;i++){
            if (data==this.list[i]){
                System.out.println(i+". indisteki değer: "+data);
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        int lastIndex=-1;
        for (int i=0;i<this.list.length;i++){
            if (data==this.list[i]){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    public boolean isEmpty(){
        if (this.size()==0){

            System.out.println("Dolu");
            return true;
        }
        else{
            System.out.println("Boş");
            return false;
        }
    }
    public T[] toArray(){
        T[] temp= (T[]) new Object[this.list.length];
        for (int i=0;i<this.list.length;i++){
            temp[i]=list[i];
        }
        return temp;
    }
    public void clear(){
        for (int i=0;i<list.length;i++){
            list[i]=null;
        }
    }
    public MyList<T>subList(int start,int finish){
        MyList<T> sub=new MyList<>(finish-start-1);
        for (int i=start;i<=finish;i++){
            sub.add(((T) this.list[i]));
        }
        return sub;
    }
    public boolean contains(T data){
        for (int i=0; i<this.list.length;i++){
            if (data==list[i]){
                System.out.println(data+" dizide "+i+".elaman");
                return true;
            }
        }
        return false;
    }
}
