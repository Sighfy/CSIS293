public class CodevolveTestRunner {

    public static void main(String[] args) throws InterruptedException {
        JFrameDisableButton jfdb = new JFrameDisableButton();
        jfdb.setSize(200, 200);
        jfdb.setVisible(true);
        Thread.sleep(1000);
        for(int i = 0; i < 8; ++i) {
            if (jfdb.label.isVisible()) {
                System.err.println("The label should only be visible after 8 clicks." );
            }
            jfdb.button.doClick();
            Thread.sleep(1000);
        }
        if (!jfdb.label.isVisible()) {
            System.err.println("The label should be visible after 8 clicks." );
        }
        if (!jfdb.label.getText().equals("That's enough!")) {
            System.err.println("The GUI displays the message '" + jfdb.label.getText() + "' where it should display the 'That's enough!'" );
        }
        Thread.sleep(2000);
        System.exit(0);
    }
}