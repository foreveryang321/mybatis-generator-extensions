package cn.tisson.wechat.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table <strong>EM_T_DICT</strong>
 * 
 * <pre>
 *  dictKey	String	null
 *  dictValue	String	null
 *  dictInfo	String	null
 *  createdt	Date	null
 *  dictSerialize	byte[]	null
 * </pre>
 */
public class EmTDict implements Serializable {
    private String dictKey;

    private String dictValue;

    private String dictInfo;

    private Date createdt;

    private byte[] dictSerialize;

    private static final long serialVersionUID = 1L;

    public EmTDict(String dictKey, String dictValue, String dictInfo, Date createdt, byte[] dictSerialize) {
        this.dictKey = dictKey;
        this.dictValue = dictValue;
        this.dictInfo = dictInfo;
        this.createdt = createdt;
        this.dictSerialize = dictSerialize;
    }

    public EmTDict() {
        super();
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictInfo() {
        return dictInfo;
    }

    public void setDictInfo(String dictInfo) {
        this.dictInfo = dictInfo;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public byte[] getDictSerialize() {
        return dictSerialize;
    }

    public void setDictSerialize(byte[] dictSerialize) {
        this.dictSerialize = dictSerialize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("dictKey=").append(dictKey);
        sb.append(", dictValue=").append(dictValue);
        sb.append(", dictInfo=").append(dictInfo);
        sb.append(", createdt=").append(createdt);
        sb.append(", dictSerialize=").append(dictSerialize);
        sb.append("]");
        return sb.toString();
    }
}