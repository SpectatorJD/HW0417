public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 80, 80,80,
                        80,80),
                new Gryffindor("Гермиона", "Грейнджер", 75, 75,75,
                        75,70),
                new Gryffindor("Рон ", "Уизли", 50, 50,50,
                        50,50),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 60,60 ,60,
                        60, 75),
                new Hufflepuff("Седрик", "Диггори", 50,50 ,80,
                        65, 75),
                new Hufflepuff("Джастин", "Финч-Флетчли", 90,90 ,40,
                        50, 80),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 70,80,80,
                        80,80,80, 10),
                new Slytherin("Грэхэм", "Монтегю", 20,20,30,
                        30,30,30, 10),
                new Slytherin("Грегори", "Гойл", 10,10,10,
                        5,15,10, 5),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 50,50, 50,
                        60,75,55),
                new Ravenclaw("Падма", "Патил", 60,50, 50,
                        60,75,45),
                new Ravenclaw("Маркус", "Белби", 70,50, 50,
                        60,75,45),
    };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(ravenclaws);
        printService.print(hufflepuffs);
        printService.print(slytherins);
        Service service = new Service();
        service.calculate(gryffindors,"Поттер");

    }
}