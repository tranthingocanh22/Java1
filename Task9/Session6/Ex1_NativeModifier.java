public class Ex1_NativeModifier {
    native void nativeMethod();
    static {
        System.loadLibrary("NativeMethodDefinition");
    }

    public static void main(String[] args) {
        Ex1_NativeModifier objNative = new Ex1_NativeModifier();
        objNative.nativeMethod();
    }
}
