package cn.tisson.wechat.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 该类对应于数据库表 <strong>upms_system</strong>
 * 
 * <pre>
 * <table>
 *  <tr><td>属性名</td><td>数据类型</td><td>字段名</td><td>字段描述</td><td>是否自增</td><td>默认值</td></tr>
 *  <tr><td>systemId</td><td>Integer</td><td>system_id</td><td>编号</td><td>true</td><td>null</td></tr>
 *  <tr><td>icon</td><td>String</td><td>icon</td><td>图标</td><td>false</td><td>null</td></tr>
 *  <tr><td>theme</td><td>String</td><td>theme</td><td>主题</td><td>false</td><td>null</td></tr>
 *  <tr><td>basepath</td><td>String</td><td>basepath</td><td>根目录</td><td>false</td><td>null</td></tr>
 *  <tr><td>status</td><td>Byte</td><td>status</td><td>状态(-1:黑名单,1:正常)</td><td>false</td><td>null</td></tr>
 *  <tr><td>name</td><td>String</td><td>name</td><td>系统名称</td><td>false</td><td>null</td></tr>
 *  <tr><td>title</td><td>String</td><td>title</td><td>系统标题</td><td>false</td><td>null</td></tr>
 *  <tr><td>description</td><td>String</td><td>description</td><td>系统描述</td><td>false</td><td>null</td></tr>
 *  <tr><td>ctime</td><td>Date</td><td>ctime</td><td>创建时间</td><td>false</td><td>null</td></tr>
 *  <tr><td>orders</td><td>Long</td><td>orders</td><td>排序</td><td>false</td><td>null</td></tr>
 * </table>
 * </pre>
 * 
 * @author Created by Mybatis Generator on 2017/05/31.
 */
public class UpmsSystem implements Serializable {
    private Integer systemId;

    private String icon;

    private String theme;

    private String basepath;

    private Byte status;

    private String name;

    private String title;

    private String description;

    private Date ctime;

    private Long orders;

    private static final long serialVersionUID = 1L;

    public UpmsSystem(Integer systemId, String icon, String theme, String basepath, Byte status, String name, String title, String description, Date ctime, Long orders) {
        this.systemId = systemId;
        this.icon = icon;
        this.theme = theme;
        this.basepath = basepath;
        this.status = status;
        this.name = name;
        this.title = title;
        this.description = description;
        this.ctime = ctime;
        this.orders = orders;
    }

    public UpmsSystem() {
        super();
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UpmsSystem other = (UpmsSystem) that;
        return (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getBasepath() == null ? other.getBasepath() == null : this.getBasepath().equals(other.getBasepath()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getBasepath() == null) ? 0 : getBasepath().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("systemId=").append(systemId);
        sb.append(", icon=").append(icon);
        sb.append(", theme=").append(theme);
        sb.append(", basepath=").append(basepath);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", ctime=").append(ctime);
        sb.append(", orders=").append(orders);
        sb.append("]");
        return sb.toString();
    }
}