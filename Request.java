/**
 * Created by nufer on 10.10.17.
 */
public class Request extends Message {

    private byte ttl;
    private Pattern pattern;
    private int ipSource;
    private short portSource;

    public Request(byte ttl, String str, int ipSource, short portSource)
    {
        this.ttl = ttl;
        this.pattern = new Pattern(str);
        this.ipSource = ipSource;
        this.portSource = portSource;
    }

    public byte getTtl() {
        return ttl;
    }

    public void setTtl(byte ttl) {
        this.ttl = ttl;
    }

    public int getIpSource() {
        return ipSource;
    }

    public void setIpSource(int ipSource) {
        this.ipSource = ipSource;
    }

    public short getPortSource() {
        return portSource;
    }

    public void setPortSource(short portSource) {
        this.portSource = portSource;
    }
}
