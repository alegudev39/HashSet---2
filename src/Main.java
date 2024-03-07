import java.util.HashSet;


//commento nuova pull branch addNewFeature

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato
public class Main {
    public static void main(String[] args) {
        System.out.println("Creo hashset cars: " + getCars());

        //Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo


        HashSet<String> italianCars = new HashSet<String>();
        italianCars.add("Ferrari");
        italianCars.add("Fiat");
        italianCars.add("Alfa");

        //Verificare che l' elemento sia parte del Set e stampare il risultato

        if (getCars().contains("Ferrari")) {
            System.out.println("la stringa ferrari è contenuta in cars");
        }

//esercitazione addizionale alla consegna
        if (italianCars.containsAll(getCars())) {

            System.out.println("Le collezioni sono uguali");
        }

        //esercitazione addizionale alla consegna
        if (italianCars.contains(getCars().toArray()[0])) {
            System.out.println("Il primo elemento di cars Ferrari è contenuto in italianCars");
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