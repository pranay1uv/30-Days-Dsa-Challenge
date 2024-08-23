class Solution {
    public int reverse(int x) {
        String strform = String.valueOf(x);
        StringBuilder sb = new StringBuilder(strform);
        strform = sb.reverse().toString();
        for (int i = 0; i < strform.length(); i++) {
            if (strform.charAt(i) == '-') {
                try {
                    int convalue = Integer.valueOf(strform.replaceAll("-", ""));
                    int negValue = -(convalue);
                    return negValue;
                } catch (NumberFormatException e) {
                    return 0;
                }
                // int negValue = -(convalue);
                // return negValue;
            }
        }
        int convalues = 0;
        try {
            convalues = Integer.valueOf(strform);
        } catch (NumberFormatException e) {
            return 0;
        }
        return convalues;
    }
}