import com.lufthansa.test.TestClass2;

public class Main   {
    public static void main(String[] args) {
       Main m=new Main();
        System.out.println(m.myEquals(" this  ","this "));
    }

    public boolean myEquals(String s1, String s2){

        if((s1==null) && (s2==null)){
            return true;
        }

          String s11=s1.replaceAll("\\s+$","");
          String s22=s2.replaceAll("\\s+$","");

        s11=s11.replaceAll("^\\s+","");

        s22=s22.replaceAll("^\\s+"," ");
        System.out.println(s11);
        System.out.println(s22);

        if(s11.equals(s22)){
            return true;
        }else {
            return false;
        }
    }
}
