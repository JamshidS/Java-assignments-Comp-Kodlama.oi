public class Main {
    public static void main(String[] args) {

//        BaseLogger[] loggers = {new MailLogger(), new DataBaseLogger(), new FileLogger()};
//        for(BaseLogger logger: loggers){
//            logger.log("Logged");
//        }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}