class ContarCaracteres{

    public static boolean stringIguais(String str1, String str2){
        int i;
        if(str1.length() != str2.length())
            return false;

        for(i=0;i<str1.length();i++)
            if(str1.charAt(i) != str2.charAt(i))
                return false;

        return true;
    }
    public static void main(String[] args) {
        String palavra = "chocolate";

        System.out.println(palavra.length());
        System.out.println(palavra.charAt(0));
    }
}