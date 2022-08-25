public class DobbyChat {
    private static final String hello = "Hello! I'm Dobby\n" +
                           "\t" + "How can I help you?";
    private static final String bye = "Byebye. Dobby will miss you!";
    private static final String line = "\t----------------------------------------------";

    private static void printChat(String c) {
        System.out.println(line);
        System.out.println("\t" + c);
        System.out.println(line);
    }
    public static void echo(String s) {
        printChat(s);
    }
    public static void sayHello() {
        printChat(hello);
    }
    public static void sayBye() {
        printChat(bye);
    }
    public static void marked(String s) {
        String marked = "Well done master! Dobby has marked the following task as done: \n\t";
        String toPrint = marked + s;
        printChat(toPrint);
    }
    public static void unmarked(String s) {
        String unmarked = "OK, Dobby will take care of\n\t";
        String toPrint = unmarked + s;
        printChat(toPrint);
    }
    public static void deleted(Task task, DobbyList list) {
        if(list.isEmpty()) {
            printChat("There is no task left for Dobby to delete, YAYYYYY");
        } else {
            String taskString = task.toString() + "\n\t";

            String deleted = "Task deleted! Less work for master! Dobby is HAAAAAPPY!\n\n\t"
                    + "Dobby has removed this task: \n\t";
            String length = "\n\tYou now have " + (list.getLength() - 1) + " task(s) in the list.\n";
            printChat(deleted + taskString + length);
        }
    }
    public static void noDeadlineDate() {
        printChat("Please add the deadline after the task name using /by");
    }
    public static void noEventDate() {
        printChat("Please add the event date after the task name using /at");
    }
    public static void added(Task task, DobbyList list) {
        String taskString = task.toString() + "\n\t";

        String accept = "Yes master, Dobby will add the following to the list: \n\t";
        String length = "\n\tYou now have " + list.getLength()+ " task(s) left.\n";
        printChat(accept + taskString + length);
    }
    public static void unknown() {
        printChat("Dobby doesn't understand what you're saying...");
    }
    public static void noTaskNumber() {
        printChat("You need to tell Dobby the task number...");
    }
    public static void noTaskDesc() {
        printChat("You need to tell Dobby the task you wish to add...");
    }
    public static void noNumber() {
        printChat("Dobby doesn't see a number...");
    }
    public static void tooLittleTasks() {
        printChat("There aren't that many tasks...would you like Dobby to add more?");
    }
    public static void noTaskToDelete() {
        printChat("Dobby doesn't see any task to delete");
    }
    public static void wrongTaskNumber() {
        printChat("Dobby only knows numbers more than 0...");
    }
    public static void alreadyMarked() {
        printChat("Dobby has already marked this task done!");
    }
    public static void alreadyUnmarked() {
        printChat("Master has never marked this task done before...");
    }
    public static void allMarked() {
        printChat("All tasks marked, master!");
    }
    public static void allUnmarked() {
        printChat("All tasks unmarked, master!");
    }
    public static void wrongTaskFormat() {
        printChat("Dobby doesn't understand what's written here..." );
    }
    public static void listEmpty() {
        printChat("No tasks left, Dobby is FREEEEEEEEEEEE!");
    }
    public static void wrongDateFormat() {
        printChat("Master, please write dates using the YYYY-MM-DD HHMM format");
    }
}