// Subclass UserChat
class UserChat extends Chat {
    public UserChat(String name) {
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
