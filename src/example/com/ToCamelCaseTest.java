/*it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the
original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).*/
package example.com;

public class ToCamelCaseTest {
    public static String toCamelcasetest(String str){
        String[] front = new String[0];
        String[] front1 = new String[0];
        String back="", rest = "";
        boolean result = str.contains("-"); //check if contain dash
        boolean result1 = str.contains("_");//check if contain underscore

        if (result){
            front = str.split("-");//eliminate de dash or _
            //loop to the newly created array
            for (String temp: front){
                if (temp.charAt(0)>= 'a' && temp.charAt(0)== 'z') {//check the case in the first letter if lower or upper
                    back = temp.substring(0, 1).toUpperCase() +
                            temp.substring(1);//capitalize the first letter of each world
                    rest+=back;
                }else
                rest+=temp;
            }

        }else if (result1 == true){

            front1 = str.split("_"); //eliminate de dash or _

            for (String temp: front1) {
                if (temp.charAt(0)>= 'a' && temp.charAt(0)== 'z') { //check the case in the first letter if lower or upper
                back = temp.substring(0, 1).toUpperCase() +
                        temp.substring(1);//capitalize the first letter of each world
                rest += back; // join all the strings with the first word capitalized
            }
                else
                    rest+=temp;
            }
        }
        return rest;
    }
    public static void main(String[] args) {
        var test = toCamelcasetest("" + "The_Stealh_Warrior");
        System.out.println(test);

    }
}
