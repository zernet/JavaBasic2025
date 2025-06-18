package com.gmail.zernetcsgo.hw14;

public class MessagePrinter implements Printer {
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    private interface MessageHandler {
        void handle();
    }

    @Override
    public void print(Message message) {
        if (message.getText() == null && message.getSender() == null) {
            MessageHandler handler = new MessageHandler() {
                @Override
                public void handle() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            handler.handle();

        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: "
                    + message.getText());

        } else {
            System.out.println("Користувач " + message.getSender()
                    + " відправив повідомлення: "
                    + message.getText());
        }
    }
}
