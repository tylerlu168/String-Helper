public class Driver
{
    public static void main(String[] args)
    {
        String str = "Devious Licks";
        System.out.println(StringHelper.delete(str, 2,7));
        System.out.println(StringHelper.delete(str, 7));
        System.out.println(StringHelper.insert(str,"!!", 4));
        System.out.println(StringHelper.reverse(str));
    }
}
