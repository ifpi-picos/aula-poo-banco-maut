public class Sms implements Notificacao {

    @Override
    public void envia(String msg) {
        System.out.println("notificação via sms");
        System.out.println(msg);
    }
    
}
