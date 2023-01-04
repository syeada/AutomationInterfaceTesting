public interface  Bank extends BangladeshBank {


        public double getInterest();

        default void print()
        {
            System.out.println("Hello Sanjida");
        }

        private void doDot() {

        }
}
