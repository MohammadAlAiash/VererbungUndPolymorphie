public class Longboard extends Fortbewegungsmittel {

    public void rollen(){
        System.out.println("ich rolle");
    }
    @Override
    public void fortbewegen(){
        rollen();
    }
}
