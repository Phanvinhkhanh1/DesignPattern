package fpt_udemy.academy;

public class ComputerDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Computer display's temperature is : " + temperature + " C");
    }
}
