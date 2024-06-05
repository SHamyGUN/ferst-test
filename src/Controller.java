public class Controller {
    public static void main(String[] args) {
        // Инициализация переменных
        int i, j;

        // Массив для хранения итоговых результатов для каждого игрока
        String[] result = new String[5];

        // Результаты игроков
        int[][] points = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };

        // Массив для хранения общих баллов для каждого игрока
        int[] sumPoints = new int[5];

        // Имена игроков
        String[] names = {"Alex", "Igor", "Michael", "Nicolay", "Vladimir"};

        // Подсчет общих баллов для каждого игрока
        for (i = 0; i < names.length; i++) {
            for (j = 0; j < points[i].length; j++) {
                sumPoints[i] += points[i][j]; // Суммирование баллов игрока i
            }
            // Формирование строки с именем игрока и его общими баллами
            result[i] = names[i] + " " + sumPoints[i];

            // Вывод результата для текущего игрока
            System.out.println(result[i]);
        }
    }
}