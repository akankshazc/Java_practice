// Chapter 16

import java.io.*;

public class GameSaverTest {

    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] { "bow", "sword", "dust" });
        GameCharacter two = new GameCharacter(200, "Troll", new String[] { "spells", "invisibility" });
        GameCharacter three = new GameCharacter(120, "Magician", new String[] { "spells", "invisibility" });

        // Code that does things with the characters that changes their state values

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));

            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream((new FileInputStream("Game.ser")));

            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type: " + oneRestore.getType());
            System.out.println("Two's type: " + twoRestore.getType());
            System.out.println("Three's type: " + threeRestore.getType());

            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
