package Java0515;

public class Java0515 {

    class Singleton {
        private static Singleton one;
        private Singleton(){

        }

        public static Singleton getInstance() {
            if (one == null) {
                one = new Singleton();
            }

            return one;
        }
    }
}
