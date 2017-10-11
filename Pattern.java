/**
 * Created by nufer on 10.10.17.
 */
public class Pattern {
    private byte strSize;
    private String str;

    public Pattern(String str)
    {
        this.setStrSize((byte)str.length());
        this.setStr(str);
    }

    public byte getStrSize() {
        return strSize;
    }

    public void setStrSize(byte strSize) {
        this.strSize = strSize;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
