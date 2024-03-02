package Lesson9;

public class Program {
    public static void main(String[] args) {
//        Day currentDay = Day.monday;
//        System.out.println(currentDay);
//        Book book1 = new Book(Type.HISTORICAL, "Древний Рим", "Какой-то греческий автор");
//        System.out.println(book1.getType() + book1.author + book1.name);
//        Type types [] = Type.values();
//        for (Type elem : types) {
//            System.out.println(elem);

//        System.out.println(Color.BLACK.getColorCode());

        Operations operations1 = Operations.MULT;
        int result = operations1.action(1, 12);
        System.out.println(result);

        }
    }

