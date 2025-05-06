////////////////////////////////////////////////////////////////////
// [Amerigo] [Vegliante] [2111004]
// [Giulia] [Romanato] [2104060]
///////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanASCIITest 
{

    @Test
    void testSingleCharacters()
    {
        String I = String.join("\n", RomanASCII.ascii_i);
        assertEquals(I, RomanASCII.RomanPrinter("i"));

        String V = String.join("\n", RomanASCII.ascii_v);
        assertEquals(I, RomanASCII.RomanPrinter("v"));

        String X = String.join("\n", RomanASCII.ascii_x);
        assertEquals(I, RomanASCII.RomanPrinter("x"));

        String L = String.join("\n", RomanASCII.ascii_c);
        assertEquals(I, RomanASCII.RomanPrinter("l"));

        String C = String.join("\n", RomanASCII.ascii_c);
        assertEquals(I, RomanASCII.RomanPrinter("c"));

        String D = String.join("\n", RomanASCII.ascii_d);
        assertEquals(I, RomanASCII.RomanPrinter("d"));

        String M = String.join("\n", RomanASCII.ascii_m);
        assertEquals(I, RomanASCII.RomanPrinter("m"));
    }

    @Test 
    void testComplexCombinations() 
    {
        String IV = " _____  __      __\n" + "|_   _| \\ \\    / /\n" + "  | |    \\ \\  / / \n" + "  | |     \\ \\/ /  \n" + " _| |_     \\  /   \n" + "|_____|     \\/    ";
        assertEquals(IV, RomanASCII.RomanPrinter("iv"));

        String IX = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n  | |     >  <  \n _| |_   / /\\ \\ \n|_____| /_/  \\_\\";
        assertEquals(IX, RomanASCII.RomanPrinter("ix"));

		String XIV = "__    __  _____  __      __\n\\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /    | |    \\ \\  / / \n  >  <     | |     \\ \\/ /  \n / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ |_____|     \\/    ";;
        assertEquals(XIV,RomanASCII.RomanPrinter("xiv"));

        String XIX = "__    __  _____  __    __\n\\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /    | |    \\ \\/ / \n  >  <     | |     >  <  \n / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ |_____| /_/  \\_\\";
        assertEquals(XIX, RomanASCII.RomanPrinter("xix"));

        String XXIV = "__    __ __    __  _____  __      __\n\\ \\  / / \\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\  / / \n  >  <     >  <     | |     \\ \\/ /  \n / /\\ \\   / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ /_/  \\_\\ |_____|     \\/    ";
        assertEquals(XXIV, RomanASCII.RomanPrinter("xxiv"));

        String XXIX = "__    __ __    __  _____  __    __\n\\ \\  / / \\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\/ / \n  >  <     >  <     | |     >  <  \n / /\\ \\   / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ /_/  \\_\\ |_____| /_/  \\_\\";
        assertEquals(XXIX, RomanASCII.RomanPrinter("xxix"));

        String XL = "__    __  _      \n" +"\\ \\  / / | |     \n" +" \\ \\/ /  | |     \n" +"  >  <   | |     \n" +" / /\\ \\  | |____ \n" +"/_/  \\_\\ |______|";
        assertEquals(XL, RomanASCII.RomanPrinter("xl"));

        String XLIV = "__    __  _        _____  __      __\n" +"\\ \\  / / | |      |_   _| \\ \\    / /\n" +" \\ \\/ /  | |        | |    \\ \\  / / \n" +"  >  <   | |        | |     \\ \\/ /  \n" +" / /\\ \\  | |____   _| |_     \\  /   \n" +"/_/  \\_\\ |______| |_____|     \\/    "; 
        assertEquals(XLIV, RomanASCII.RomanPrinter("XLIV"));

        String XLIX = "__    __  _        _____   __    __\n" +"\\ \\  / / | |      |_   _|  \\ \\  / /\n" +" \\ \\/ /  | |        | |     \\ \\/ / \n" +"  >  <   | |        | |      >  <  \n" +" / /\\ \\  | |____   _| |_    / /\\ \\ \n" +"/_/  \\_\\ |______| |_____|  /_/  \\_\\";
        assertEquals(XLIX, RomanASCII.RomanPrinter("XLIX"));
        
        String XC = "__    __   ___ \n" +"\\ \\  / /  / __|\n" +" \\ \\/ /  | |   \n" +"  >  <   | |   \n" +" / /\\ \\  | |__ \n" +"/_/  \\_\\  \\___|";
        assertEquals(XC, RomanASCII.RomanPrinter("XC"));

        String XCIV = "__    __   ___   _____  __      __\n" +"\\ \\  / /  / __| |_   _| \\ \\    / /\n" +" \\ \\/ /  | |      | |    \\ \\  / / \n" +"  >  <   | |      | |     \\ \\/ /  \n" +" / /\\ \\  | |__   _| |_     \\  /   \n" +"/_/  \\_\\  \\___| |_____|     \\/    ";
        assertEquals(XCIV, RomanASCII.RomanPrinter("XCIV"));

        String XCIX = "__    __   ___   _____  __    __\n" +"\\ \\  / /  / __| |_   _| \\ \\  / /\n" +" \\ \\/ /  | |      | |    \\ \\/ / \n" +"  >  <   | |      | |     >  <  \n" +" / /\\ \\  | |__   _| |_   / /\\ \\ \n" +"/_/  \\_\\  \\___| |_____| /_/  \\_\\";
        assertEquals(XCIX, RomanASCII.RomanPrinter("XCIX"));

        String CD = "  ___   _____  \n" +" / __| |  __ \\ \n" +"| |    | |  | |\n" +"| |    | |  | |\n" +"| |__  | |__| |\n" +" \\___| |_____/ ";
        assertEquals(CD, RomanASCII.RomanPrinter("CD"));

        String CDIV =   "___   _____    _____  __      __\n" +" / __| |  __ \\  |_   _| \\ \\    / /\n" +"| |    | |  | |   | |    \\ \\  / / \n" +"| |    | |  | |   | |     \\ \\/ /  \n" +"| |__  | |__| |   | |_     \\  /   \n" +" \\___| |_____/  |_____|     \\/    ";
        assertEquals(CDIV, RomanASCII.RomanPrinter("CDIV"));

        String CM = "  ___   __  __\n" +" / __| |  \\/  |\n" +"| |    | \\  / |\n" +"| |    | |\\/| |\n" +"| |__  | |  | |\n" +" \\___| |_|  |_|";
        assertEquals(CM, RomanASCII.RomanPrinter("CM"));

        String CMIX = "  ___   __  __   _____  __    __\n" +" / __| |  \\/  | |_   _| \\ \\  / /\n" +"| |    | \\  / |   | |    \\ \\/ / \n" +"| |    | |\\/| |   | |     >  <  \n" +"| |__    |  | |  _| |_   / /\\ \\ \n" +" \\___| |_|  |_| |_____| /_/  \\_\\";
        assertEquals(CMIX, RomanASCII.RomanPrinter("CMIX"));

        String VIII = "__      __  _____   _____   _____\n" +"\\ \\    / / |_   _| |_   _| |_   _|\n" +" \\ \\  / /    | |     | |     | |  \n" +"  \\ \\/ /     | |     | |     | |  \n" +"   \\  /     _| |_   _| |_   _| |_ \n" +"    \\/     |_____| |_____| |_____|";
        assertEquals(VIII, RomanASCII.RomanPrinter("VIII"));

        String XXX = "__    __  __    __  __    __\n" +"\\ \\  / /  \\ \\  / /  \\ \\  / /\n" +" \\ \\/ /    \\ \\/ /    \\ \\/ / \n" +"  >  <      >  <      >  <  \n" +" / /\\ \\    / /\\ \\    / /\\ \\ \n" +   "/_/  \\_\\  /_/  \\_\\  /_/  \\_\\";
        assertEquals(XXX, RomanASCII.RomanPrinter("XXX"));

        String CCC = "  ___   ___   ___\n" +" / __| / __| / __|\n" +"| |   | |   | |\n" +"| |   | |   | |\n" +"| |__ | |__ | |__\n" +" \\___| \\___| \\___|";;
        assertEquals(CCC, RomanASCII.RomanPrinter("CCC"));
    }
}
