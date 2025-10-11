package fpt_udemy.academy;

public class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TVDisplay's temperature is : " + temperature + " C");
    }
}
