////////////////////////////////////////////////////////////////////
// [Amerigo] [Vegliante] [2111004]
// [Giulia] [Romanato] [2104060]
///////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest 
{

    @Test
    public void testSingleCharacters()
    {
        String I = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n";
        assertEquals(I,RomanPrinter.print(1));

        String V = "__      __\n"+"\\ \\    / /\n" + " \\ \\  / / \n" +"  \\ \\/ /  \n" + "   \\  /   \n" + "    \\/    \n";
        assertEquals(V, RomanPrinter.print(5));

        String X = "__    __\n\\ \\  / /\n \\ \\/ / \n  >  <  \n / /\\ \\ \n/_/  \\_\\\n";
        assertEquals(X, RomanPrinter.print(10));

        String L = " _      \n" +"| |     \n" +"| |     \n" +"| |     \n" +"| |____ \n" +"|______|\n";
        assertEquals(L, RomanPrinter.print(20));

        String C = "  _____ \n / ____|\n| |     \n| |     \n| |____ \n \\_____|\n";
        assertEquals(C, RomanPrinter.print(50));

        String D = " _____  \n" +"|  __ \\ \n" +"| |  | |\n" +"| |  | |\n" +"| |__| |\n" +"|_____/ \n";
        assertEquals(D, RomanPrinter.print(500));

        String M =" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n";
        assertEquals(M, RomanPrinter.print(1000));
    }

    @Test 
    public void testComplexCombinations() 
    {
        String III = " _____   _____   _____ \n|_   _| |_   _| |_   _|\n  | |     | |     | |  \n  | |     | |     | |  \n _| |_   _| |_   _| |_ \n|_____| |_____| |_____|\n";
        assertEquals(III,RomanPrinter.print(3));
        String IV = " _____  __      __\n" + "|_   _| \\ \\    / /\n" + "  | |    \\ \\  / / \n" + "  | |     \\ \\/ /  \n" + " _| |_     \\  /   \n" + "|_____|     \\/    \n";
        assertEquals(IV, RomanPrinter.print(4));

        String IX = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n  | |     >  <  \n _| |_   / /\\ \\ \n|_____| /_/  \\_\\\n";
        assertEquals(IX, RomanPrinter.print(9));

		String XIV = "__    __  _____  __      __\n\\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /    | |    \\ \\  / / \n  >  <     | |     \\ \\/ /  \n / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ |_____|     \\/    \n";
        assertEquals(XIV,RomanPrinter.print(14));

        String XIX = "__    __  _____  __    __\n\\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /    | |    \\ \\/ / \n  >  <     | |     >  <  \n / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ |_____| /_/  \\_\\\n";
        assertEquals(XIX, RomanPrinter.print(19));

        String XXIV = "__    __ __    __  _____  __      __\n\\ \\  / / \\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\  / / \n  >  <     >  <     | |     \\ \\/ /  \n / /\\ \\   / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ /_/  \\_\\ |_____|     \\/    \n";
        assertEquals(XXIV, RomanPrinter.print(24));

        String XXIX = "__    __ __    __  _____  __    __\n\\ \\  / / \\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\/ / \n  >  <     >  <     | |     >  <  \n / /\\ \\   / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ /_/  \\_\\ |_____| /_/  \\_\\\n";
        assertEquals(XXIX, RomanPrinter.print(29));

        String XL = "__    __  _      \n" +"\\ \\  / / | |     \n" +" \\ \\/ /  | |     \n" +"  >  <   | |     \n" +" / /\\ \\  | |____ \n" +"/_/  \\_\\ |______|\n";
        assertEquals(XL, RomanPrinter.print(40));

        String XLIV = "__    __  _        _____  __      __\n" +"\\ \\  / / | |      |_   _| \\ \\    / /\n" +" \\ \\/ /  | |        | |    \\ \\  / / \n" +"  >  <   | |        | |     \\ \\/ /  \n" +" / /\\ \\  | |____   _| |_     \\  /   \n" +"/_/  \\_\\ |______| |_____|     \\/    \n"; 
        assertEquals(XLIV, RomanPrinter.print(44));

        String XLIX = "__    __  _        _____   __    __\n" +"\\ \\  / / | |      |_   _|  \\ \\  / /\n" +" \\ \\/ /  | |        | |     \\ \\/ / \n" +"  >  <   | |        | |      >  <  \n" +" / /\\ \\  | |____   _| |_    / /\\ \\ \n" +"/_/  \\_\\ |______| |_____|  /_/  \\_\\\n";
        assertEquals(XLIX, RomanPrinter.print(49));
        
        String XC = "__    __   ___ \n" +"\\ \\  / /  / __|\n" +" \\ \\/ /  | |   \n" +"  >  <   | |   \n" +" / /\\ \\  | |__ \n" +"/_/  \\_\\  \\___|\n";
        assertEquals(XC, RomanPrinter.print(90));

        String XCIV = "__    __   ___   _____  __      __\n" +"\\ \\  / /  / __| |_   _| \\ \\    / /\n" +" \\ \\/ /  | |      | |    \\ \\  / / \n" +"  >  <   | |      | |     \\ \\/ /  \n" +" / /\\ \\  | |__   _| |_     \\  /   \n" +"/_/  \\_\\  \\___| |_____|     \\/    \n";
        assertEquals(XCIV, RomanPrinter.print(94));

        String XCIX = "__    __   ___   _____  __    __\n" +"\\ \\  / /  / __| |_   _| \\ \\  / /\n" +" \\ \\/ /  | |      | |    \\ \\/ / \n" +"  >  <   | |      | |     >  <  \n" +" / /\\ \\  | |__   _| |_   / /\\ \\ \n" +"/_/  \\_\\  \\___| |_____| /_/  \\_\\\n";
        assertEquals(XCIX, RomanPrinter.print(99));

        String CD = "  ___   _____  \n" +" / __| |  __ \\ \n" +"| |    | |  | |\n" +"| |    | |  | |\n" +"| |__  | |__| |\n" +" \\___| |_____/ \n";
        assertEquals(CD, RomanPrinter.print(400));

        String CDIV =   "___   _____    _____  __      __\n" +" / __| |  __ \\  |_   _| \\ \\    / /\n" +"| |    | |  | |   | |    \\ \\  / / \n" +"| |    | |  | |   | |     \\ \\/ /  \n" +"| |__  | |__| |   | |_     \\  /   \n" +" \\___| |_____/  |_____|     \\/    \n";
        assertEquals(CDIV, RomanPrinter.print(404));

        String CM = "  ___   __  __\n" +" / __| |  \\/  |\n" +"| |    | \\  / |\n" +"| |    | |\\/| |\n" +"| |__  | |  | |\n" +" \\___| |_|  |_|\n";
        assertEquals(CM, RomanPrinter.print(900));

        String CMIX = "  ___   __  __   _____  __    __\n" +" / __| |  \\/  | |_   _| \\ \\  / /\n" +"| |    | \\  / |   | |    \\ \\/ / \n" +"| |    | |\\/| |   | |     >  <  \n" +"| |__    |  | |  _| |_   / /\\ \\ \n" +" \\___| |_|  |_| |_____| /_/  \\_\\\n";
        assertEquals(CMIX, RomanPrinter.print(909));

        String VIII = "__      __  _____   _____   _____\n" +"\\ \\    / / |_   _| |_   _| |_   _|\n" +" \\ \\  / /    | |     | |     | |  \n" +"  \\ \\/ /     | |     | |     | |  \n" +"   \\  /     _| |_   _| |_   _| |_ \n" +"    \\/     |_____| |_____| |_____|\n";
        assertEquals(VIII, RomanPrinter.print(8));

        String XXX = "__    __  __    __  __    __\n" +"\\ \\  / /  \\ \\  / /  \\ \\  / /\n" +" \\ \\/ /    \\ \\/ /    \\ \\/ / \n" +"  >  <      >  <      >  <  \n" +" / /\\ \\    / /\\ \\    / /\\ \\ \n" +   "/_/  \\_\\  /_/  \\_\\  /_/  \\_\\\n";
        assertEquals(XXX, RomanPrinter.print(30));

        String CCC = "  ___   ___   ___\n" +" / __| / __| / __|\n" +"| |   | |   | |\n" +"| |   | |   | |\n" +"| |__ | |__ | |__\n" +" \\___| \\___| \\___|\n";
        assertEquals(CCC, RomanPrinter.print(300));
    }
}
