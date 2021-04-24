package Lesson7HW;
public class main {
    public static void main(String[] args) {
        PeopleMethods people = new PeopleMethods();
        people.addUser("Вася");
        people.addUser("Коля");
        people.addUser("Петя");
        people.addUser("Дима");
        people.addUser("Толя");
        people.addUser("Влад");
        people.print();
        System.out.println("-------------");

        //Добавил в коллецию значение по индексу 2
        people.addPeople(2,"Макар");
        people.print();
        System.out.println("-------------");


        //Добавил в коллекцию значение без указания индекса
        people.addPeopleValue("Bob");
        people.print();
        System.out.println("-------------");


        //Удалил из коллекции значение под индексом 4
        people.deleteIndex(4);
        people.print();
        System.out.println("-------------");


        //Удалил из коллекции массив со значением "Влад"
        people.deleteValue("Влад");
        people.print();
        System.out.println("-------------");


        //Получил информацию по индексу 3
        people.getIndex(3);
        System.out.println("-------------");
//        people.print();

    }
}
