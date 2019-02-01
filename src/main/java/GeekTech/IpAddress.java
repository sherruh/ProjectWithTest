package GeekTech;

public class IpAddress {

    private String ip;

    public void setIp(String ip) {
        if(checkIp(ip)){
            this.ip=ip;
        }else{
            this.ip="";
        }
    }

    public boolean checkIp(String ip) {
        if (ip.length()>15){
            System.out.println("Lenght is more than 15!");
            return false;
        }
        if(!ip.matches("\\d+(\\.\\d+)*")){
            System.out.println("Ip matches letters!");
            return false;
        }
        if (ip.startsWith("0")) {
            System.out.println("First number is zero!");
            return false;
        }
        if(ip.endsWith(".0")){
            System.out.println("Last number is zero!");
            return false;
        }

        return true;
    }
}