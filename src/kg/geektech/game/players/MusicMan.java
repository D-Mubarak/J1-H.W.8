package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class MusicMan extends Hero {
    public MusicMan(int health, int damage) {
        super(health, damage, SuperAbility.HEALTH_OR_DAMGE_WITH_MUSIC);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int randomMusic = RPG_Game.random.nextInt(5) + 1;
        switch (randomMusic) {
            case 1:
                boss.setHealth(boss.getHealth() - 10);
                System.out.println("Morgenshtern song the " +  "Lollipop");
                System.out.println("Lolli-lollipop, за ним ныряю в Double Cup\n" +
                        "Lolli-lollipop, ещё один Track");
                break;
            case 2:
                boss.setHealth(boss.getHealth() - 20);
                System.out.println("Morgenshtern song the " + "SHOW");
                System.out.println("Все хотят от меня шоу\n" +
                        "Все хотят — я дам им шоу");
                break;
            case 3:
                boss.setHealth(boss.getHealth() - 30);
                System.out.println("Morgenshtern song the " + "ICE");
                System.out.println("Эй (few), м-м (ice) цепь на мне — это ice (лёд, few)");
                break;
            case 4:
                boss.setHealth(boss.getHealth() - 40);
                System.out.println("Morgenshtern song the " + "Cristal & МОЁТ");
                System.out.println("Я лью Cristal или Chandon Moët\n" +
                        "Мечтал — теперь моё");
                break;
            case 5:
                boss.setHealth(boss.getHealth() - 50);
                System.out.println("Morgenshtern song the " + "Cadillac");
                System.out.println("Как дела? Как дела?\n" +
                        "Это новый Cadillac");
                break;
        }
    }
}
