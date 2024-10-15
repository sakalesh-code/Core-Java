package practice;
public class StringEx {

    //a String is an object that represents a sequence of characters.
    public static void main(String[] args) {
        //String - objects of String are immutable which means a constant and cannot be changed once created.
            //String Literal
            String s1 = "sakalesh";
            String s3 = "sakalesh";
            System.out.println(s1);
            //Using new Keyword
            String s2 = new String ("sakalesh");
            System.out.println(s2);

            System.out.println(s1.concat(" reddy"));//concat
            System.out.println(s1);
            System.out.println(s1 == s2);//
            System.out.println(s1.equals(s2));
            System.out.println(s1.hashCode() +" = " +s2.hashCode());
            System.out.println(s1.charAt(3));

        //StringBuffer - it is mutable in nature and it is thread safe class, so it is mainly used for multithreaded program
            StringBuffer sbf = new StringBuffer(" sakalesh");
            StringBuffer sbf1 = new StringBuffer(" reddy");
            System.out.println(sbf);
            System.out.println(sbf.append(sbf1));
            System.out.println(sbf.capacity());
            System.out.println(sbf.length());
            System.out.println(sbf.delete(1,7));

        //StringBuilder - it is mutable in nature and it is not thread safe class, so it is mainly used for single threaded program
            StringBuilder sbd= new StringBuilder("sakalesh");
            System.out.println(sbd);

    }
}
