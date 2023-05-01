// Subclass BotChat
class BotChat extends Chat {
    public BotChat(String name) {
        super(name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends message: " + message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receives message: " + message);
    }
}