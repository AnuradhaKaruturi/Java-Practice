package Exception;

public class CustomException {
    public static void main(String[] args)  {
        try {
            throw new custException("custom Exception");
        } catch (custException e) {
            System.out.println(e.getMessage());
        }
    }
  
    
}

class custException extends Exception{

    custException(String str){
        super(str);
    }

}
