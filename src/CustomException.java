public class CustomException extends Exception{
    String message;
    CustomException(String message)
    {
        //super(message);
        this.message=message;
    }
    public String getMessage()
    {
        return message;
    }
    public static void main(String args[])
    {
        try
        {
            throw new CustomException("This is custom exception");
        }
        catch (CustomException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
