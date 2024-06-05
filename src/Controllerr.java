public class Controllerr {
    public static void main(String[] args) {
        // Имена игроков
        String[] players = {"Player1", "Player2", "Player3"};

        // Результаты игроков
        int[][] scores = {
                {10, 20, 30},
                {15, 25, 35},
                {5, 10, 15}
        };

        // Общие баллы для каждого игрока
        int[] totalScores = new int[players.length];

        // Подсчет общих баллов для каждого игрока
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j]; // Накопление баллов
            }
            totalScores[i] = sum; // Сохранение суммы баллов для игрока i
        }

        // Вывод имен игроков и их общих баллов
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i] + ": " + totalScores[i]);
        }
    }
}