package fpt_udemy.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherStattion weatherStattion = new WeatherStattion();

        Observer smarphoneDisplay = new SmartphoneDisplay();
        Observer TVDisplay = new TVDisplay();
        Observer computerDisplay = new ComputerDisplay();

        weatherStattion.subcribe(smarphoneDisplay);
        weatherStattion.subcribe(computerDisplay);
        weatherStattion.subcribe(TVDisplay);

        weatherStattion.setTemperature(50);

        weatherStattion.unsubcribe(computerDisplay);
        weatherStattion.setTemperature(100);
    }
}
