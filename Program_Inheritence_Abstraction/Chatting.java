// Main class
public class Chatting {
    public static void main(String[] args) {
        Chat user1 = new UserChat("User1");
        Chat user2 = new UserChat("User2");
        Chat bot1 = new BotChat("Bot1");

        user1.send("Hii, Bot1!");
        bot1.receive("Hii juga, User1!");

        bot1.send("pakabar?");
        user1.receive("Lagi sad nihh:(");

        bot1.send("Lohh kenapa?");
        user1.receive("Anu...Ramadhan udah pamit aja, padahal lagi semangat semangatnya ibadah..");

        user2.send("Masyaallah, gapapa sabar yaa, semoga kita masih diberi umur untuk Ramadhan tahun depan :)");
    }
}
