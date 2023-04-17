public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", "храбрость", "благородство","честь",
                        80,80,80),
                new Gryffindor("Гермиона", "Грейнджер", "храбрость", "благородство","честь",
                        60,70,80),
                new Gryffindor("Рон ", "Уизли", "храбрость", "благородство","честь",
                        50,50,65),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", "трудолюбие","верность" ,"честность",
                        60, 75,70),
                new Hufflepuff("Седрик", "Диггори", "трудолюбие","верность" ,"честность",
                        65, 75,70),
                new Hufflepuff("Джастин", "Финч-Флетчли", "трудолюбие","верность" ,"честность",
                        50, 80,90),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", "жажда власти","решительность","хитрость",
                        80,80,80),
                new Slytherin("Грэхэм", "Монтегю", "жажда власти","решительность","хитрость",
                        50,85,60),
                new Slytherin("Грегори", "Гойл", "жажда власти","решительность","хитрость",
                        40,90,85),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", "ум","творчество", "остроумность",
                        60,75,45),
                new Ravenclaw("Падма", "Патил", "ум","творчество", "остроумность",
                        80,75,55),
                new Ravenclaw("Маркус", "Белби", "ум","творчество", "остроумность",
                        60,85,75),
    };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(slytherins);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        Service service = new Service();
        service.calculate();
    }
}