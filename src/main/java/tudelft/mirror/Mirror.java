package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        while ( begin < end ) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += string.charAt(end);
                begin++;
                end--;
            }
            else {
                break;
            }
        }

        return begin == end ? string : mirror;
    }
}