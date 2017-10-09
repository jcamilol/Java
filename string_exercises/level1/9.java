// Write a program to delete all consonents from the string "Hello, have a good day". 
class code{
    public static void main(String[] args){
        String str1 = new String("Hello, have a good day");
        String str = str1.toLowerCase();
        int length = str.length();
        for(int ii=0; ii<length; ii++){
            char ch = str.charAt(ii);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                continue;
            else if(ch>='a' && ch<='z')
                str = str.replace(ch,(char)00);
        }
        System.out.println(str);
    }
}