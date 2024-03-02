package Lesson9;

public class Book {
    Type bookType;
    String name;
    String author;


    public Book(Type bookType, String name, String author) {
        this.bookType = bookType;
        this.name = name;
        this.author = author;
    }
    String getType(){
        switch (bookType){
            case FANTASY:
                return "Фэнтэзи";
            case COMEDY:
                return "Комедия";
            case SCIENCE:
                return "Научный";
            case HISTORICAL:
                return "Исторический";
            case NONFICTIONS:
                return "Начно-популярный";
        }
        return "Неизвестность";
    }
}
