public class MyGenericClass <T, V> {
    T tVal;
    V vVal;

    MyGenericClass (T tVal, V vVal) {
        this.tVal = tVal;
        this.vVal = vVal;
    }

   V getValue() {
        return vVal;
   }
}
