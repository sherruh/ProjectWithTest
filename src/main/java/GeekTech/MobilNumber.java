package GeekTech;

public class MobilNumber {

    private String number;

    public void setNumber(String number) {
        if(checkNumber(number)){
            this.number=number;
        }else{
            this.number="";
        }
    }

    public boolean checkNumber(String number) {
        if (number.length()>10){
            System.out.println("Lenght is more than 10!");
            return false;
        }
        if(!number.matches("[0-9]+")){
            System.out.println("Number matches letters!");
            return false;
        }
        if (!number.startsWith("0")) {
            System.out.println("First number is not zero!");
            return false;
        }

        return true;

    }
}
