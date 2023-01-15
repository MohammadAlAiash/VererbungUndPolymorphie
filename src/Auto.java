public class Auto extends Fortbewegungsmittel {

    public void fahren(){
        System.out.println("ich fahre");
    }
    @Override
    public void fortbewegen(){
        fahren();
    }
}
