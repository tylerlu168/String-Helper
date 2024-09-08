public class StringHelper
{
    /**
     * "Deletes" a section from str beginning at index
     *  beg (inclusive) to index end (exclusive)
     *
     *  Precondition: str.length() > 0
     *          0 <= beg < end < str.length()
     * @param str
     * @param beg
     * @param end
     * @return
     */
    public static String delete(String str, int beg, int end)
    {
        return str.substring(0, beg) + str.substring(end);
    }

    /**
     * "Deletes" a section from str starting at index
     *      beg (inclusive) and through the rest
     *      of str.
     * @param str
     * @param beg
     * @return
     */

    public static String delete(String str, int beg)
    {
        return delete(str, beg, str.length());
    }

    /**
     * "Inserts" str1 into str beginning at index i.
     * @param str
     * @param str1
     * @param i
     * @return
     */
    public static String insert(String str, String str1, int i)
    {
        return str.substring(0, i) + str1 + str.substring(i);
    }
    public static String reverse(String str)
    {
        String rtn = "";

        for (int i = str.length() - 1; i >= 0 ; i--)
        {
            rtn += str.charAt(i);
        }
        return rtn;
    }

}
