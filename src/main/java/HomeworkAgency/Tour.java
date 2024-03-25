package HomeworkAgency;

public class Tour {
    String country;
    String days;
    String transport;
    String cost;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public String getDays() {
        return days;
    }

    public String getTransport() {
        return transport;
    }

    public String getCost() {
        return cost;
    }

    public Tour(String country) {
        this.country = country;
    }

    public Tour(String country, String days, String transport) {
        this.country = country;
        this.days = days;
        this.transport = transport;
    }

    public Tour(String country, String days, String transport, String cost) {
        this.country = country;
        this.days = days;
        this.transport = transport;
        this.cost = cost;
    }

    public void displayInfoAboutTour (){
        System.out.println("Страна: " + country + "," + " количество дней: " + days + " транспорт" + transport + " стоимость: " + cost);
    }
}
