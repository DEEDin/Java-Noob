package InheritanceExample;

/**
 * Created by DELL on 1/21/2020.
 */
public class Provience extends Country {
    void pName(){
        String name="Bagmati";
        String capital="The capital of Bagmati Provience is Hetauda";
        super.cCountry();
        System.out.println(name);
        System.out.println(capital);
    }
    public static void main(String[] args){
        Provience ip= new Provience();
        //Sip.cCountry();
        ip.pName();
    }
}
