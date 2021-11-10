public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount*5) + (smallCount) < goal) {
            return false;
        } 
        if (goal < 0) {
            return false;
        }
        if (goal%5 <= smallCount) {
            return true;
        }
        return false;
        
        
    }
}
