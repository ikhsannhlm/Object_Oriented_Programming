// Abstract class Chat
abstract class Chat {
    protected String name;

    public Chat(String name) {
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}