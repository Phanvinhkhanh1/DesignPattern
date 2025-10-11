package fpt_udemy.academy;

public class SmartphoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Smartphone display's temperature is : " + temperature + " C");
    }
}
