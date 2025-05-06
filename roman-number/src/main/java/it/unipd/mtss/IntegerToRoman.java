package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        String roman=new String();
        if(number<=3){
            for (int i=0;i<number;i++){
                roman=roman+"I";
            }
        }
        else if(number <= 6)
        {
            if(number == 4)
                roman = "IV";
            if(number == 5)
                roman = "V";
            if(number == 6)
                roman = "VI";
        }
        return roman;
    }
}

