package Java0318;

public class Hashtable {
    final class Integer {
        private final int key;
        public int hashCode() {
            return key;
        }
    }

    public final class Double {
        private final double key;
        public int hashCode() {
            long bits = doubletoLongBits(key);{
                return (int) (bits ^ (bits >>> 32));
            }
        }
    }

    public final class Boolean {
        private final boolean key;
        public int hashCode() {
            if (key) {return 1231;}
         else {return 1237;}
    }}

    public final class String {
        private final char[] s;
        public int hashCode() {
            int hash 0;
            for (int i = 0; i < length(); i++) {
                hash = s[i] + (31 * hash);{
                    return hash;
                }
            }
        }
    }
}
