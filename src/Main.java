import java.util.HashSet;


//commento nuova pull branch addNewFeature

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato
public class Main {
    public static void main(String[] args) {
        System.out.println("Creo hashset cars: " + getCars());


        String carFind = "Ferrari";

        //Verificare che l' elemento sia parte del Set e stampare il risultato

        if (getCars().contains(carFind)) {
            System.out.println("la stringa ferrari è contenuta in cars");
        }



    }

    public static HashSet<String> getCars() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Ferrari");
        //cars.add("Fiat");
        //cars.add("Alfa");
        cars.add("Audi");
        cars.add("Porsche");

        return cars;
    }
}