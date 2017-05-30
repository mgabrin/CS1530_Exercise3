public class TriCater
{
  public static void main(String[] args)
  {
    String method = null;
    int inputNum = 0;
    try {
      method = args[0];
      inputNum = Integer.parseInt(args[1]);
    } catch(ArrayIndexOutOfBoundsException a) {
      System.out.println("Please enter 2 arguments, the method and input number.");
      System.exit(1);
    } catch(NumberFormatException nfe) {
      System.out.println("Please enter a positive integer for the chosen method.");
      System.exit(2);
    }

    if(method.equalsIgnoreCase("lazy"))
      System.out.println("Lazy(" + inputNum + ") = " + lazy(inputNum));
    else if(method.equalsIgnoreCase("triangle"))
      System.out.println("Tri(" + inputNum + ") = " + tri(inputNum));
    else
    {
      System.out.println("Please enter lazy or triangle to choose your method.");
      System.exit(1);
    }
  }

  public static int tri(int inputNum)
  {
    if(inputNum < 0)
    {
      System.out.println("Please enter a positive integer.");
      System.exit(2);
      return 0;
    }

    else if(inputNum <= 1)
      return inputNum;

    else
      return inputNum + lazy(inputNum - 1);
  }

  public static int lazy(int inputNum)
  {
    if(inputNum < 0)
    {
      System.out.println("Please enter a positive integer.");
      System.exit(2);
      return 0;
    }

    else if(inputNum == 0)
      return 1;

    else
      return inputNum + tri(inputNum - 1);
  }
}
