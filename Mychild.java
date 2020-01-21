package pkg1;

/**
 * Created by DELL on 1/21/2020.
 */
public class Mychild extends Parent{
    void cinfo(){
        System.out.println("this is new member and also not bad one");
    }
    public static void main(String[] args){
        Mychild i=new Mychild();
        i.pinfo();
        i.cinfo();
    }
}
