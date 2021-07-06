public class ReadOnly {

    private String name = "Amadeus";

    /*public String getName() { // Metoda Getter -> metoda do pobierania wartości z pól prywatnych
        return name + "Jest ok";
    }*/

    /*public void setName(String name) { // Metoda Setter -> metoda do ustawiania wartości pola prywatnego
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
