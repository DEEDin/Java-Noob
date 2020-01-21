
/**
 * Created by DELL on 1/19/2020.
 */
public class MyArray{
    void Arrays() {
        String[] State ={"Provience no 1", "Provience no 2", "Bagmati Pradesh", "Gandaki Provience", "Provience no 5", "Karnali Pradesh", "SudurPaschim Pradesh"};
        for( String Names: State ){
            System.out.println(Names);
        }
    }
    void Ints(){
        int[] numbers={2,3,4,5,6,7,8,9};
        int sum=0;
                for( int number: numbers){
                    sum = sum + number;

                }
        System.out.println(sum);
    }

    public static void main(String[] args){
    MyArray m= new MyArray();
        m.Arrays();
        m.Ints();
    }
}
