// Parcial 1 Tarea 3 Mikel Barajas
//
public class Operaciones {
    public static void main(String[] args){

        int operationIndex = 0;

        while(operationIndex + 3 <= args.length){

            String operation = args[operationIndex];
            int firstOperand = Integer.parseInt(args[operationIndex + 1]);
            int secondOperand = Integer.parseInt(args[operationIndex + 2]);

            switch (operation) {
                case "SUMA" ->
                        System.out.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
                case "RESTA" ->
                        System.out.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
                case "MULTIPLICACION" ->
                        System.out.println(firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
                case "DIVISION" ->
                    //TODO: add exception handling for secondOperand = 0
                        System.out.println(firstOperand + " / " + secondOperand + " = " + (firstOperand / secondOperand));
            }

            operationIndex += 3;
        }

    }
}