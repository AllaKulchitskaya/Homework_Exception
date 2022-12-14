public class Main {
    public static void main(String[] args) {
        boolean success = Data.checkData("christina305", "DogAndCat105", "DogAndCat105");
        if (success) {
            System.out.println("Данные введены верно");
        } else {
            System.out.println("Данные введены неверно");
        }
    }
}