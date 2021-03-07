package advanced.enumerators;

public enum carMaker {
    BMW("bumeris", 1975),
    VOLVO("Volvo", 2020),
    MB("Mercedes-Benz", 1920);

     final String fullName;
     final int establishedIn;

    carMaker(String fullName, int establishedIn){
        this.fullName = fullName;
        this.establishedIn = establishedIn;
    }
}
