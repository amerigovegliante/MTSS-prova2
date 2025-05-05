////////////////////////////////////////////////////////////////////
// [Amerigo] [Vegliante] [2111004]
// [Giulia] [Romanato] [2104060]
///////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{

    @Test
    void testSingleCharacters()
    {
        String I = String.join("\n", App.ascii_i);
        assertEquals(I, App.RomanPrinter("i"));

        String V = String.join("\n", App.ascii_v);
        assertEquals(I, App.RomanPrinter("v"));

        String X = String.join("\n", App.ascii_x);
        assertEquals(I, App.RomanPrinter("x"));

        String L = String.join("\n", App.ascii_c);
        assertEquals(I, App.RomanPrinter("l"));

        String C = String.join("\n", App.ascii_c);
        assertEquals(I, App.RomanPrinter("c"));

        String D = String.join("\n", App.ascii_d);
        assertEquals(I, App.RomanPrinter("d"));

        String M = String.join("\n", App.ascii_m);
        assertEquals(I, App.RomanPrinter("m"));
    }

    @Test 
    void testComplexCombinations() 
    {
        String IV = " _____  __      __\n" + "|_   _| \\ \\    / /\n" + "  | |    \\ \\  / / \n" + "  | |     \\ \\/ /  \n" + " _| |_     \\  /   \n" + "|_____|     \\/    ";
        assertEquals(IV, App.RomanPrinter("iv"));

        String IX = " _____  __    __\n|_   _| \\ \\  / /\n  | |    \\ \\/ / \n  | |     >  <  \n _| |_   / /\\ \\ \n|_____| /_/  \\_\\";
        assertEquals(IX, App.RomanPrinter("ix"));

		String XIV = "__    __  _____  __      __\n\\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /    | |    \\ \\  / / \n  >  <     | |     \\ \\/ /  \n / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ |_____|     \\/    ";;
        assertEquals(XIV,App.RomanPrinter("xiv"));

        String XIX = "__    __  _____  __    __\n\\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /    | |    \\ \\/ / \n  >  <     | |     >  <  \n / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ |_____| /_/  \\_\\";
        assertEquals(XIX, App.RomanPrinter("xix"));

        String XXIV = "__    __ __    __  _____  __      __\n\\ \\  / / \\ \\  / / |_   _| \\ \\    / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\  / / \n  >  <     >  <     | |     \\ \\/ /  \n / /\\ \\   / /\\ \\   _| |_     \\  /   \n/_/  \\_\\ /_/  \\_\\ |_____|     \\/    ";
        assertEquals(XXIV, App.RomanPrinter("xxiv"));

        String XXIX = "__    __ __    __  _____  __    __\n\\ \\  / / \\ \\  / / |_   _| \\ \\  / /\n \\ \\/ /   \\ \\/ /    | |    \\ \\/ / \n  >  <     >  <     | |     >  <  \n / /\\ \\   / /\\ \\   _| |_   / /\\ \\ \n/_/  \\_\\ /_/  \\_\\ |_____| /_/  \\_\\";
        assertEquals(XXIX, App.RomanPrinter("xxix"));

        String XL = "__    __  _      \n" +"\\ \\  / / | |     \n" +" \\ \\/ /  | |     \n" +"  >  <   | |     \n" +" / /\\ \\  | |____ \n" +"/_/  \\_\\ |______|";
        assertEquals(XL, App.RomanPrinter("xl"));

        String XLIV = "__    __  _        _____  __      __\n" +"\\ \\  / / | |      |_   _| \\ \\    / /\n" +" \\ \\/ /  | |        | |    \\ \\  / / \n" +"  >  <   | |        | |     \\ \\/ /  \n" +" / /\\ \\  | |____   _| |_     \\  /   \n" +"/_/  \\_\\ |______| |_____|     \\/    "; 
        assertEquals(XLIV, App.RomanPrinter("XLIV"));

        String XLIX = "__    __  _        _____   __    __\n" +"\\ \\  / / | |      |_   _|  \\ \\  / /\n" +" \\ \\/ /  | |        | |     \\ \\/ / \n" +"  >  <   | |        | |      >  <  \n" +" / /\\ \\  | |____   _| |_    / /\\ \\ \n" +"/_/  \\_\\ |______| |_____|  /_/  \\_\\";
        assertEquals(XLIX, App.RomanPrinter("XLIX"));
        
        String XC = "__    __   ___ \n" +"\\ \\  / /  / __|\n" +" \\ \\/ /  | |   \n" +"  >  <   | |   \n" +" / /\\ \\  | |__ \n" +"/_/  \\_\\  \\___|";
        assertEquals(XC, App.RomanPrinter("XC"));

        String XCIV = "__    __   ___   _____  __      __\n" +"\\ \\  / /  / __| |_   _| \\ \\    / /\n" +" \\ \\/ /  | |      | |    \\ \\  / / \n" +"  >  <   | |      | |     \\ \\/ /  \n" +" / /\\ \\  | |__   _| |_     \\  /   \n" +"/_/  \\_\\  \\___| |_____|     \\/    ";
        assertEquals(XCIV, App.RomanPrinter("XCIV"));

        String XCIX = "__    __   ___   _____  __    __\n" +"\\ \\  / /  / __| |_   _| \\ \\  / /\n" +" \\ \\/ /  | |      | |    \\ \\/ / \n" +"  >  <   | |      | |     >  <  \n" +" / /\\ \\  | |__   _| |_   / /\\ \\ \n" +"/_/  \\_\\  \\___| |_____| /_/  \\_\\";
        assertEquals(XCIX, App.RomanPrinter("XCIX"));

        String CD = "  ___   _____  \n" +" / __| |  __ \\ \n" +"| |    | |  | |\n" +"| |    | |  | |\n" +"| |__  | |__| |\n" +" \\___| |_____/ ";
        assertEquals(CD, App.RomanPrinter("CD"));

        String CDIV =   "___   _____    _____  __      __\n" +" / __| |  __ \\  |_   _| \\ \\    / /\n" +"| |    | |  | |   | |    \\ \\  / / \n" +"| |    | |  | |   | |     \\ \\/ /  \n" +"| |__  | |__| |   | |_     \\  /   \n" +" \\___| |_____/  |_____|     \\/    ";
        assertEquals(CDIV, App.RomanPrinter("CDIV"));

        String CM = "  ___   __  __\n" +" / __| |  \\/  |\n" +"| |    | \\  / |\n" +"| |    | |\\/| |\n" +"| |__  | |  | |\n" +" \\___| |_|  |_|";
        assertEquals(CM, App.RomanPrinter("CM"));

        String CMIX = "  ___   __  __   _____  __    __\n" +" / __| |  \\/  | |_   _| \\ \\  / /\n" +"| |    | \\  / |   | |    \\ \\/ / \n" +"| |    | |\\/| |   | |     >  <  \n" +"| |__    |  | |  _| |_   / /\\ \\ \n" +" \\___| |_|  |_| |_____| /_/  \\_\\";
        assertEquals(CMIX, App.RomanPrinter("CMIX"));

        String VIII = "__      __  _____   _____   _____\n" +"\\ \\    / / |_   _| |_   _| |_   _|\n" +" \\ \\  / /    | |     | |     | |  \n" +"  \\ \\/ /     | |     | |     | |  \n" +"   \\  /     _| |_   _| |_   _| |_ \n" +"    \\/     |_____| |_____| |_____|";
        assertEquals(VIII, App.RomanPrinter("VIII"));

        String XXX = "__    __  __    __  __    __\n" +"\\ \\  / /  \\ \\  / /  \\ \\  / /\n" +" \\ \\/ /    \\ \\/ /    \\ \\/ / \n" +"  >  <      >  <      >  <  \n" +" / /\\ \\    / /\\ \\    / /\\ \\ \n" +   "/_/  \\_\\  /_/  \\_\\  /_/  \\_\\";
        assertEquals(XXX, App.RomanPrinter("XXX"));

        String CCC = "  ___   ___   ___\n" +" / __| / __| / __|\n" +"| |   | |   | |\n" +"| |   | |   | |\n" +"| |__ | |__ | |__\n" +" \\___| \\___| \\___|";;
        assertEquals(CCC, App.RomanPrinter("CCC"));
    }
}
