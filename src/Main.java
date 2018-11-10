public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread ft = new MyThread();
        MyThread st = new MyThread();
        ft.start();
        st.start();

    }
}
