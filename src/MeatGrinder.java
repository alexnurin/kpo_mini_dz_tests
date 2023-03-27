public class MeatGrinder {
    static int weight = 5;
    static int version = 1;
    static String sound = "br";

    public static int chop(int x){
        return (x * weight) % version + weight * (x / 2);
    }
    public static int inHeap(){
        return weight + version;
    }

    public static String force(int power){
        String res = "br";
        while (power > 0){
            res += sound;
            power--;
        }
        return res;
    }
}
