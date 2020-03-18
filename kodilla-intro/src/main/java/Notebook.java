public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price) {

        this.weight = weight;
        this.price = price;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");

        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 400 && this.price < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 400 && this.weight < 1200) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
        //wiem że to nie do końca jak powinno być ale rozumiem na czym polega

    }
    public Notebook(int year) {
        this.year = year;
    }
    public void checkYear() {
        if (this.year < 1995) {
            System.out.println("This car is old.");
        } else if (this.year > 1995 && this.year < 2005) {
            System.out.println("This car is fairly new.");
        } else {
            System.out.println("This car is modern.");
        }
    }

}