public class Flugzeug extends Fortbewegungsmittel {
     public void fliegen(){
         System.out.println("ich fliege");
     }
    @Override
    public void fortbewegen(){
         fliegen();
    }
}
