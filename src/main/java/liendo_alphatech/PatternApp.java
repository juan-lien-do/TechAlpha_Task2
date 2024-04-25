package liendo_alphatech;

/**
 * Hello world!
 *
 */
public class PatternApp
{
    public static void main( String[] args )
    {
        //Launch Controller
        // This app follows the MVC architecture.
        // Model = ARService, View=ARIO (IO stands for input-output), Controller=ARController
        new PatternController();
    }
}
