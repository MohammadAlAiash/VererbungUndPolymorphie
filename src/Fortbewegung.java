public class Fortbewegung {


    public static void sichFortbewegen(Fortbewegungsmittel w){
        w.fortbewegen();
    }


    public static void main(String[] args) {
        var a = new  Auto();
        var f = new Flugzeug();
        var l = new  Longboard();
        sichFortbewegen(a);
        sichFortbewegen(f);
        sichFortbewegen(l);
    }
}
