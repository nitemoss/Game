import javax.json.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import character.Character;
import org.json.JSONWriter;

public class Main {
    private String GAMEDATA_DIR = "/Users/art/Desktop/gamedata.json";

    private JButton buttonNextDay;
    private JPanel panelMain;
    private JLabel statusLabel;
    private JLabel welcomeLabel;
    private JLabel strengthLabel;
    private JLabel intelligenceLabel;
    private JLabel dexterityLabel;
    private JLabel defenseLabel;
    private JLabel wisdomLabel;
    private JLabel HPLabel;
    private JLabel manaLabel;

    private Character player = new Character();

    private int day_count = 1;
    public Main() {
        buttonNextDay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                

            }
        });


        File jsonInputFile = new File(GAMEDATA_DIR);
        InputStream is;
        if(jsonInputFile.exists()){

            try {
                is = new FileInputStream(jsonInputFile);
                JsonReader reader = Json.createReader(is);
                JsonObject gameDataObj = reader.readObject();
                reader.close();

                day_count = gameDataObj.getInt("day_count");
                statusLabel.setText("Day " + Integer.toString(day_count));
                welcomeLabel.setText("Welcome to the game, " + gameDataObj.getString("player_name"));

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JsonException e){
                setupGamedataFile(jsonInputFile);
            }
        } else {
            setupGamedataFile(jsonInputFile);
        }

        HPLabel.setText("HP:" + Integer.toString(player.health));
        manaLabel.setText("Mana: " + Integer.toString(player.mana));



    }
    private void setupGamedataFile(File jsonInputFile){
        try {
            String player_name = JOptionPane.showInputDialog("Player name");
            JOptionPane.showMessageDialog(null, player_name);
            FileOutputStream out = new FileOutputStream(jsonInputFile);
            Writer writer = new OutputStreamWriter(out);
            JSONWriter gamedataWriter = new JSONWriter(writer);
            gamedataWriter.object();
            gamedataWriter.key("player_name");
            gamedataWriter.value(player_name);



            gamedataWriter.key("day_count");
            gamedataWriter.value(1);
            gamedataWriter.endObject();


//            gamedataWriter.object().key("ads").value(23).endObject();





            writer.close();
            welcomeLabel.setText("Welcome to the game, " + player_name);
            statusLabel.setText("Day 1");
            statusLabel.setFont(new Font("Serif", Font.PLAIN, 30));





            String charType = JOptionPane.showInputDialog("Type of your character? (warrior/mage/ranger):");
            player.setCharacterType(charType);

            String race = JOptionPane.showInputDialog("Race of your character? (orc/elf/human/undead)");
            player.setRace(race);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void nextDay(){

    }

    public static void main(String[] args) {


        JFrame frame = new JFrame("The Warrior's Journey");


        frame.setContentPane(new Main().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);


    }
}
