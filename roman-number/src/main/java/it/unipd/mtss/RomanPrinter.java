package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
      String AsciiArt="";
      romanNumber=romanNumber.toUpperCase();
      char [] Roman= romanNumber.toCharArray();
      String[] AsciiArt_I={" _____ ","|_   _|","  | |  ","  | |  "," _| |_ ","|_____|"};
      for (int j=0;j<6;j++){
          for (int i=0;i<Roman.length;i++){
              if(Roman[i]=='I'){
                  AsciiArt=AsciiArt+AsciiArt_I[j];
              }
              if(i!=Roman.length-1){
                  AsciiArt=AsciiArt+" ";
              }
          }
          AsciiArt=AsciiArt+"\n";
      }
      return AsciiArt;
    }
  }
  