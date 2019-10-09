// 10.9.2019 Bruce today we were doing a Names program
public class Names {
    public static void main(String[] args){
        String first="Kurumi";
        String last="Tokisaki";
        System.out.println("Enter first name ==>"+first);
        System.out.println("Enter last name ==>"+last);
        System.out.println(first+" "+last);
        System.out.println(first.length()+last.length());
        System.out.println(first.substring(0,1)+last.substring(0,1));
        System.out.println(first.compareTo(last));
        System.out.println(last.indexOf(first.substring(5,6)));
        System.out.println(first.indexOf(last.substring(7,8)));
        System.out.println(first.substring(0,3)+last.substring(4)+" ");
        System.out.println(last.substring(0,4)+first.substring(3));

    }
}
