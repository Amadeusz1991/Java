public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue); // operator 'i' TRUE wtedy gdy wyrażenia są równe
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue); // operator 'lub' TRUE wtedy gdy jedno wyrażenie jest true
        System.out.println(secondValue || fourthValue);
        System.out.println(!firstValue); // operator zaprzeczenia - zwraca wartość przeciwną do wyrażenia
        System.out.println(!secondValue);
        System.out.println(!firstValue && secondValue);
    }
}
