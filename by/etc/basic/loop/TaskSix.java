package by.etc.basic.loop;

/* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/

public class TaskSix {

    public static void main(String[] args) {

        task("uqwsdyno12asiuho_");
    }

    private static void task(String text) {

        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i + " " + arr[i] + " - " + (int) arr[i]);
        }
    }
}
