public class MyGenericClass <T extends Number, V> {
//    T extends Number limits T generics to only numbers such as Float,Byte,Integer, etc
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
