import java.util.*;

public class ListTest {
    private static final int numberofelem = 8000;
    public static void main(String[] args) {
        List ar = new ArrayList();
        for (int i = 0; i < numberofelem; i++) {
            ar.add(i);
        }
        testListAdd(ar);
        testListAdd(new LinkedList(ar));
        testListRemove(ar);
        testListRemove(new LinkedList(ar));
        testListFind(ar);
        testListFind(new LinkedList(ar));

    }
    public static void testListAdd(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(0, new Object());
            list.remove(0);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Adding" +
                list.getClass().getSimpleName() + " took " + time +"Millis");
    }
       public static void testListRemove(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(new Object());
            list.remove(numberofelem);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Removing " +
                list.getClass().getSimpleName() + " took " + time+ "Millis");
    }
    public static void testListFind(List list){
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(new Object());
            int index=1;
            list.get(index);
        }

        time = System.currentTimeMillis() - time;
        System.out.println("Finding " +
                list.getClass().getSimpleName() + " took " + time+ "Millis");
    }

    }

