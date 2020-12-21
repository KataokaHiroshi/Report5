public class App {
    public static void main(String[] args) throws Exception {
        try{
            String str = null;
            str.length();
        }catch(NullPointerException e){
            System.out.println("例外 NullPointerException が発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
