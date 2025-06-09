package com.gmail.zernetcsgo.hw14;

public class MessagePrinterApp {
    public static void main(String[] args) {
        Printer printer = new MessagePrinter();

        MessagePrinter.Message msg1 = new MessagePrinter.Message("Привіт, світ!", "Alice");
        printer.print(msg1);

        MessagePrinter.Message msg2 = new MessagePrinter.Message("Hello from anonymous", "");
        printer.print(msg2);

        MessagePrinter.Message msg3 = new MessagePrinter.Message(null, null);
        printer.print(msg3);
    }
}
