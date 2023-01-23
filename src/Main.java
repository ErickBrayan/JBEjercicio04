public class Main {
    public static void main(String[] args) {
        
        SmartDevice smartDevice = new SmartDevice("azul","ald","4545FD54","12/12/2005");
        System.out.println("smartDevice = " + smartDevice);
        
        SmartDevice smartPhone = new SmartPhone("Cyan","Galaxy","FDFE587FAS","04/11/2008","Amoled","Exynos","12 Mpx");
        System.out.println("smartPhone = " + smartPhone);
        
        SmartDevice smartWatch = new SmartWatch("blanco","AWatch","FER78DS87S","05/06/2020","1500","negro");
        System.out.println("smartWatch = " + smartWatch);
        
        
    }
}