package InheritanceExample;

/**
 * Created by DELL on 1/21/2020.
 */
public class District extends Provience {
    void dDistrict() {
        String dname = "Kathmandu";
        String cap = "Kathmandu is the capital of country";
        super.pName();
        System.out.println(dname);
        System.out.println(cap);
    }

    public static void main(String[] args){
        District dd=new District();
       // dd.cCountry();
        //dd.pName();
       dd.dDistrict();
    }
}
