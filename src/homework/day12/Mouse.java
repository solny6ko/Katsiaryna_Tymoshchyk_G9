package homework.day12;

public class Mouse {
//   - создать класс Mouse
//- поля:
//private String pattern - содержит паттерн имени мыши формате "Mouse <n>", где n - порядковый номер мыши
//private String name - имя мыши в формате "Mouse <n>", где n - порядковый номер мыши
//конструктор public Mouse(int number) - в нем инициализируется поле name
//метод public void peep() - печатает в консоль фразу в формате "Mouse <n> PEEP!",
// где n - порядковый номер мыши, и заставляет поток заснуть на 200мс
    private String pattern = "Mouse <n>";
    private String name;

    public Mouse(int number) {
        name = pattern.replace("<n>", String.valueOf(number));
    }

    public void peep() {
        {
            System.out.println(name + " PEEP!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);;
            }
        }
    }
}
