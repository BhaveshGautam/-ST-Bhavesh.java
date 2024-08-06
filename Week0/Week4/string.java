package Week0.Week4;

public class string {
    public static void GallString( String s, int i,int j){
        for(i=0;i<s.length()-1;i++){
            for(j=i+1;j<s.length();j++){
                System.out.println(s.substring(i, j));
        }
    }
}
    public static void main(String[] args) {
        String s="abcde";
        GallString(s,0,5);

    }

}
    
