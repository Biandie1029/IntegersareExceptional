import java.util.ArrayList;

public class Integers_Are_Exceptional {
    private static Integer Converter(String string) throws NumberFormatException {
        Integer integer = Integer.parseInt(string);
        return integer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for (int index = 0; index < args.length; index++) {

            try {
                integerList.add(Converter(args[index]));
                System.out.println("Converter method says integer OK - " + args[index]);

            } catch (NumberFormatException e) {
                System.out.println("Catch block says the argument" + args[index] + "is ignored because " + args[index]);
            }
        }
        System.out.println("\nVector contents are: ");
        for (int index = 0; index < integerList.size(); index++) {
            System.out.println("Item " + index + " is " + integerList.get(index));
        }
    }

}
