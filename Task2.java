class Task2
{
    public static void main(String[] args)
    {
        
        RemoveCommaStringMain rlc = new RemoveCommaStringMain();
        String str1 = ",xyz";
        String str2 = " abc ";
        String str3 = "priya,prit,";

        str1 = rlc.removeComma(str1);
        str2 = rlc.removeComma(str2);
        str3 = rlc.removeComma(str3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    String abc = "kushalhs , mayurvm , narendrabz ,";
String a = abc.substring(0, abc.lastIndexOf(","));
}