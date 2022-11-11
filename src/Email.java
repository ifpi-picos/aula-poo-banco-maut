public class Email implements Notificacao {

    @Override
    public void envia(String msg) {
        System.out.println("notificação via email");
        System.out.println(msg);
    }
    
}
