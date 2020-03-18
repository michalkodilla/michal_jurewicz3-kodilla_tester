public class FirstClass {
    public static void main(String[] args) {

        Notebook lightNotebook = new Notebook(5, 1000);
        System.out.println(lightNotebook.weight + " " + lightNotebook.price + " " + lightNotebook.price);
        lightNotebook.checkPrice();
        lightNotebook.checkWeight();

        Notebook Notebook = new Notebook(10, 300);
        System.out.println(Notebook.weight + " " + Notebook.price);
        Notebook.checkPrice();
        Notebook.checkWeight();

        Notebook oldNotebook = new Notebook(15, 3000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        Notebook oldYear = new Notebook(1986);
        System.out.println(oldYear.year);
        oldYear.checkYear();

        Notebook newYear = new Notebook(2003);
        System.out.println(newYear.year);
        newYear.checkYear();

        Notebook modernYear = new Notebook(2019);
        System.out.println(modernYear.year);
        modernYear.checkYear();
    }

}