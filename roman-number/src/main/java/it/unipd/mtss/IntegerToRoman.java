package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        String roman=new String();
        if(number<=3){
            for (int i=0;i<number;i++){
                roman=roman+"I";
            }
        }
        return roman;
    }
}

