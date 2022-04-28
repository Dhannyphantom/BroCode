
public class Main  {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6};
        Double[] doubles = {6.6,5.5,4.4,3.3,2.2,1.1};
        Character[] chars = {'q','w','e','r','t','y'};
        String[] strings = {"Bro", "Dan", "Pete", "Jake", "Von", "Dex"};

        displayValues(strings);
        System.out.println(getFirst(chars));
    }

    public static <T> void displayValues (T[] x) {
        for (T val : x) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst (T[] x) {
        return x[0];
    }

}
