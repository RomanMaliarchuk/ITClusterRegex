/**
 * Created by roman on 10.07.2017.
 */
public class Main {


    public static void main(String[] args) {

        String adress = "Maliarchuk Roman Dmutrovich, st. Franka, 34a/1, 27200 ";

        boolean isCorrectAdress = checkAdress(adress);

        if(isCorrectAdress){
            System.out.printf("Це є коректна адреса");
        }else{
            System.out.printf("Це є НЕ КОРЕКТНА адреса");
        }
    }

    private static boolean checkAdress(String adress) {
        String regex = "^[A-Za-z]{2,}\\s+[A-Za-z]{2,}\\s+[A-Za-z]{2,}((\\s+)|(,)|(\\s+,))(\\s+)*"
                + "st([A-Za-z]{1,})*((\\s+)|(\\.)|(\\s+\\.))(\\s+)*[A-Za-z]{1,}((\\s+)|(,)|(\\s+,))(\\s+)*"
                +  "\\d{1,3}([A-Za-z])*(/)*(\\d)*([A-Za-z])*((\\s+)|(,)|(\\s+,))(\\s+)*\\d{5}(\\s+)*$";
        return adress.matches(regex);
    }
}
