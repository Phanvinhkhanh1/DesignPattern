package fpt_udemy.academy;

public interface Subject {
    void subcribe(Observer observer);
    void unsubcribe(Observer observer);
    void notifyObserver();
}
