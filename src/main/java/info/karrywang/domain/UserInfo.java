package info.karrywang.domain;

import java.util.Date;

public class UserInfo {
    private String userid;

    private String branchid;

    private String byname;

    private Date createtime;

    private String email;

    private String mobile;

    private String officephone;

    private String password;

    private String position;

    private String sex;

    private String skilllevel;

    private String username;

    private String validchgreason;

    private String validflag;

    private String acdqueue;

    private String acduserid;

    private String acduserpwd;

    private String acwseconds;

    private String usertype;

    private String trial;

    private String orderno;

    private Integer entrymonth;

    private Date entrytime;

    private Date destorytime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid == null ? null : branchid.trim();
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname == null ? null : byname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSkilllevel() {
        return skilllevel;
    }

    public void setSkilllevel(String skilllevel) {
        this.skilllevel = skilllevel == null ? null : skilllevel.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getValidchgreason() {
        return validchgreason;
    }

    public void setValidchgreason(String validchgreason) {
        this.validchgreason = validchgreason == null ? null : validchgreason.trim();
    }

    public String getValidflag() {
        return validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag == null ? null : validflag.trim();
    }

    public String getAcdqueue() {
        return acdqueue;
    }

    public void setAcdqueue(String acdqueue) {
        this.acdqueue = acdqueue == null ? null : acdqueue.trim();
    }

    public String getAcduserid() {
        return acduserid;
    }

    public void setAcduserid(String acduserid) {
        this.acduserid = acduserid == null ? null : acduserid.trim();
    }

    public String getAcduserpwd() {
        return acduserpwd;
    }

    public void setAcduserpwd(String acduserpwd) {
        this.acduserpwd = acduserpwd == null ? null : acduserpwd.trim();
    }

    public String getAcwseconds() {
        return acwseconds;
    }

    public void setAcwseconds(String acwseconds) {
        this.acwseconds = acwseconds == null ? null : acwseconds.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getTrial() {
        return trial;
    }

    public void setTrial(String trial) {
        this.trial = trial == null ? null : trial.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getEntrymonth() {
        return entrymonth;
    }

    public void setEntrymonth(Integer entrymonth) {
        this.entrymonth = entrymonth;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Date getDestorytime() {
        return destorytime;
    }

    public void setDestorytime(Date destorytime) {
        this.destorytime = destorytime;
    }
}