class TwelveDays {

    String getstring(int num)
    {
        String s="";
        switch (num)
        {
            case 1:
                s="first";
                break;
            case 2:
                s="second";
                break;
            case 3:
                s="third";
                break;
            case 4:
                s="fourth";
                break;
            case 5:
                s="fifth";
                break;
            case 6:
                s="sixth";
                break;
            case 7:
                s="seventh";
                break;
            case 8:
                s="eighth";
                break;
            case 9:
                s="ninth";
                break;
            case 10:
                s="tenth";
                break;
            case 11:
                s="eleventh";
                break;
            case 12:
                s="twelfth";
                break;



        }
        return s;
    }


    String verse(int verseNumber){

            String arr[] = {"twelve Drummers Drumming", "eleven Pipers Piping", "ten Lords-a-Leaping", "nine Ladies Dancing", "eight Maids-a-Milking", "seven Swans-a-Swimming", "six Geese-a-Laying", "five Gold Rings", "four Calling Birds", "three French Hens", "two Turtle Doves", "a Partridge in a Pear Tree"};
            String num = getstring(verseNumber);
            String s = "On the " + num + " day of Christmas my true love gave to me: ";


            int index = arr.length - verseNumber;
            for (; index < arr.length; index++) {
                if(index+1!= arr.length||verseNumber==1)
                    s += arr[index];
                else
                    s=s+"and "+arr[index];
                if (index + 1 != arr.length)
                    s += ", ";
                else
                    s += ".\n";

            }
        

        return s;
    }


    String verses(int startVerse, int endVerse)  {

        String s="";
        for(int i=startVerse;i<=endVerse;i++)
        {
            s+=verse(i);
            if(i!=endVerse)
                s+="\n";

        }
        return s;
    }
    
    String sing(){
        String s="";
            for(int i=1;i<=12;i++)
            {
                s+=verse(i);
                if(i!=12)
                    s+="\n";
             
            }
            return s;
    }
}
