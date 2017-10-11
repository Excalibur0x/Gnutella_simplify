import java.util.List;

/**
 * Created by nufer on 10.10.17.
 */
public class Response extends Message {

    private List<Pattern> patternList;
    private byte ttl;
    private byte nbMatching;
    private int ipDest;
    private short portDest;

    public Response(byte ttl, byte nbMatching, List<Pattern> patternList, int ipDest, short portDest)
    {
        this.setPatternList(patternList);
        this.setTtl(ttl);
        this.setNbMatching(nbMatching);
        this.setIpDest(ipDest);
        this.setPortDest(portDest);
    }

    public List<Pattern> getPatternList() {
        return patternList;
    }

    public void setPatternList(List<Pattern> patternList) {
        this.patternList = patternList;
    }

    public byte getTtl() {
        return ttl;
    }

    public void setTtl(byte ttl) {
        this.ttl = ttl;
    }

    public byte getNbMatching() {
        return nbMatching;
    }

    public void setNbMatching(byte nbMatching) {
        this.nbMatching = nbMatching;
    }

    public int getIpDest() {
        return ipDest;
    }

    public void setIpDest(int ipDest) {
        this.ipDest = ipDest;
    }

    public short getPortDest() {
        return portDest;
    }

    public void setPortDest(short portDest) {
        this.portDest = portDest;
    }
}
