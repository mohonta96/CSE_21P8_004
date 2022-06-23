public class String_Sir {
    public static void main(String[] args) {
        String name = "Lemon";
        String name1 = "   sohel rana    ";
        System.out.println("for cut the empty space "+name1.trim());
        boolean result = name.equals("Lemon");
        System.out.println("String is equal or not " +result);
        boolean result1 = name.equalsIgnoreCase("lemon");
        System.out.println("case ignore "+result1);
        System.out.println("lenth of String " +name.length());
        System.out.println("char at: "+ name.charAt(2));
        System.out.println("index of m is: "+ name.indexOf("m"));
        boolean result2 = name.isEmpty();
        System.out.println("isEmpty or not: " + result2);
        System.out.println("isBlank of not :" + name.isBlank());
        System.out.println("to uppercase "+name.toUpperCase());
        System.out.println("replace charectr " + name.replace('e', 'i'));
        System.out.println("chars "+name.chars());
    }
}
