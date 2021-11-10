public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a&lt;10)||(a&gt;99)||(b&lt;10)||(b&gt;99)) {
            return false;
        }
        int lda = a % 10;
        int fda = a/10;
        int ldb = b % 10;
        int fdb = b/10;
        if ((lda == ldb) || (lda == fdb) || (fda == ldb) || (fda == fdb)) {
            return true;
        }
        return false;
        
    }
}
