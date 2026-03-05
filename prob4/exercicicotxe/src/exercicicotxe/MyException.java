package exercicicotxe;

public class MyException extends Exception{
    public static String MyMessage =“Escriu aquí el que necessites”;

    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}