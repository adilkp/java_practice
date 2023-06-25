public class MyException extends Exception{

    MyException() {
        super("Number is greater than 100");
    }

    MyException(String msg) {
        super(msg);
    }
    
}
