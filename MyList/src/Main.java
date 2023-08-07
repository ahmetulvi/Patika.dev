public class Main {
    public static void main(String[] args) {
        MyList<Integer> list=new MyList<>();
        list.add(3);
        list.add(2);
        list.add(32);
        for (int i=0;i<15;i++){
            list.add(i);
        }
        System.out.println(list.getCapacity());
        System.out.println("---------------------------------");
        System.out.println(list.listSize);
        System.out.println("---------------------------------");
        System.out.println("Seçtiğiniz Indexteki değer: "+list.get(19));
        System.out.println("---------------------------------");
        list.remove(0);
        list.set(0,3);
        System.out.println(list.get(0));
        System.out.println("---------------------------------");
        list.toString();
        System.out.println();
        System.out.println("---------------------------------");
        list.indexOf(0);
        list.isEmpty();
        System.out.println("---------------------------------");
        System.out.println(list.subList(2,4));
        list.contains(10);

    }
}