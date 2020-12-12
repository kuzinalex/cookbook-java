public class Main {
    public static void main(String[] args) {
        SystemInitializer systemInitializer=new SystemInitializer();
        UIClassContainer uiClassContainer= systemInitializer.initialize();
        uiClassContainer.getUserInterface().setVisible(true);
    }
}
