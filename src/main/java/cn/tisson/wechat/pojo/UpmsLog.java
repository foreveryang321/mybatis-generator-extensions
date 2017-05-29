package cn.tisson.wechat.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 该类对应于数据库表 <strong>upms_log</strong>
 * 
 * <pre>
 * <table>
 *  <tr><td>属性名</td><td>数据类型</td><td>字段名</td><td>字段描述</td><td>是否自增</td><td>默认值</td></tr>
 *  <tr><td>logId</td><td>Integer</td><td>log_id</td><td>编号</td><td>true</td><td>null</td></tr>
 *  <tr><td>description</td><td>String</td><td>description</td><td>操作描述</td><td>false</td><td>null</td></tr>
 *  <tr><td>username</td><td>String</td><td>username</td><td>操作用户</td><td>false</td><td>null</td></tr>
 *  <tr><td>startTime</td><td>Date</td><td>start_time</td><td>操作时间</td><td>false</td><td>null</td></tr>
 *  <tr><td>spendTime</td><td>Integer</td><td>spend_time</td><td>消耗时间</td><td>false</td><td>null</td></tr>
 *  <tr><td>basePath</td><td>String</td><td>base_path</td><td>根路径</td><td>false</td><td>null</td></tr>
 *  <tr><td>uri</td><td>String</td><td>uri</td><td>URI</td><td>false</td><td>null</td></tr>
 *  <tr><td>url</td><td>String</td><td>url</td><td>URL</td><td>false</td><td>null</td></tr>
 *  <tr><td>method</td><td>String</td><td>method</td><td>请求类型</td><td>false</td><td>null</td></tr>
 *  <tr><td>userAgent</td><td>String</td><td>user_agent</td><td>用户标识</td><td>false</td><td>null</td></tr>
 *  <tr><td>ip</td><td>String</td><td>ip</td><td>IP地址</td><td>false</td><td>null</td></tr>
 *  <tr><td>permissions</td><td>String</td><td>permissions</td><td>权限值</td><td>false</td><td>null</td></tr>
 *  <tr><td>parameter</td><td>String</td><td>parameter</td><td></td><td>false</td><td>null</td></tr>
 *  <tr><td>result</td><td>String</td><td>result</td><td></td><td>false</td><td>null</td></tr>
 * </table>
 * </pre>
 * 
 * @author Created by Mybatis Generator on 2017/05/29.
 */
public class UpmsLog implements Serializable {
    private Integer logId;

    private String description;

    private String username;

    private Date startTime;

    private Integer spendTime;

    private String basePath;

    private String uri;

    private String url;

    private String method;

    private String userAgent;

    private String ip;

    private String permissions;

    private String parameter;

    private String result;

    private static final long serialVersionUID = 1L;

    public UpmsLog(Integer logId, String description, String username, Date startTime, Integer spendTime, String basePath, String uri, String url, String method, String userAgent, String ip, String permissions, String parameter, String result) {
        this.logId = logId;
        this.description = description;
        this.username = username;
        this.startTime = startTime;
        this.spendTime = spendTime;
        this.basePath = basePath;
        this.uri = uri;
        this.url = url;
        this.method = method;
        this.userAgent = userAgent;
        this.ip = ip;
        this.permissions = permissions;
        this.parameter = parameter;
        this.result = result;
    }

    public UpmsLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
        UpmsLog other = (UpmsLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getSpendTime() == null ? other.getSpendTime() == null : this.getSpendTime().equals(other.getSpendTime()))
            && (this.getBasePath() == null ? other.getBasePath() == null : this.getBasePath().equals(other.getBasePath()))
            && (this.getUri() == null ? other.getUri() == null : this.getUri().equals(other.getUri()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getUserAgent() == null ? other.getUserAgent() == null : this.getUserAgent().equals(other.getUserAgent()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPermissions() == null ? other.getPermissions() == null : this.getPermissions().equals(other.getPermissions()))
            && (this.getParameter() == null ? other.getParameter() == null : this.getParameter().equals(other.getParameter()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getSpendTime() == null) ? 0 : getSpendTime().hashCode());
        result = prime * result + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        result = prime * result + ((getUri() == null) ? 0 : getUri().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        result = prime * result + ((getParameter() == null) ? 0 : getParameter().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("logId=").append(logId);
        sb.append(", description=").append(description);
        sb.append(", username=").append(username);
        sb.append(", startTime=").append(startTime);
        sb.append(", spendTime=").append(spendTime);
        sb.append(", basePath=").append(basePath);
        sb.append(", uri=").append(uri);
        sb.append(", url=").append(url);
        sb.append(", method=").append(method);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", ip=").append(ip);
        sb.append(", permissions=").append(permissions);
        sb.append(", parameter=").append(parameter);
        sb.append(", result=").append(result);
        sb.append("]");
        return sb.toString();
    }
}