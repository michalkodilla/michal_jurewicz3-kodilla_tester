public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 800);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1700);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        notebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 300);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        notebook.checkWeight();

                    }



}