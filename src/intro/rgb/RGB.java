package intro.rgb;

/**
 * Class RGB
 *
 * Created by yslabko on 11/24/2017.
 */
public class RGB {
    public static void main(String[] args) {
        System.out.println(((byte)0b11111101));
        byte rgb[] = new byte[]{(byte)0b11111111, (byte)0b10001000, (byte) 0b00000001};
        System.out.println(rgb);
        for (byte b : rgb) {
            System.out.println(getHexString(b));
        }

    }

    static String getHexString(byte b) {
        String hex[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

        byte low = (byte)(b & 0b00001111);
        byte high = (byte) ((b & 0x00f0) >>> 4);

        return hex[high] + hex[low];
    }
}
