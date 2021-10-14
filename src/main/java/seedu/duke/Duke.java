package seedu.duke;

import command.Command;
import parser.Parser;
import storage.Storage;
import list.TaskList;
import ui.Ui;

import java.util.Scanner;

public class Duke {
    private final Ui ui;
    private final Storage storage;
    private final TaskList tasklist;

    public Duke() {
        this.ui = new Ui();
        this.storage = new Storage("file_path");
        this.tasklist = new TaskList();
    }

    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        new Duke().run();
    }

    public void run() {
        this.ui.welcome();
        Scanner in = new Scanner(System.in);
        boolean isExit = false;

//        while (!isExit) {
//            try {
//                String userCommand = in.nextLine().trim();
//
//                Command command = new Parser().parse(userCommand);
//                command.execute(this.storage, this.ui, this.tasklist);
//                isExit = command.getIsExist();
//            } catch (Exception e) {
//                this.ui.print("Error: " + e.getMessage());
//            }
//        }

        // exit program
        System.exit(0);
    }
}
