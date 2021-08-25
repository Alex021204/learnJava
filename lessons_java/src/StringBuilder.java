public class StringBuilder {
    public static void main(String[] args){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
