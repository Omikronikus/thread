public class Main {

    public static void main(String[] args) {
	// write your code here
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();
        ft.start();
        st.start();

    }
}
