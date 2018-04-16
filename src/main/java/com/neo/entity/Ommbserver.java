package com.entity;

import java.io.Serializable;

public class Ommbserver implements Serializable {
    private Integer ommbid;

    private String ip;

    private String ftpuser;

    private String ftpport;

    private String ftppassword;

    private String telnetuser;

    private String telnetport;

    private String dataversion;

    private String telnetpassword;
    
    private String ommversion;
    
    private String status;

	public Integer getOmmbid() {
        return ommbid;
    }

    public void setOmmbid(Integer ommbid) {
        this.ommbid = ommbid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getFtpuser() {
        return ftpuser;
    }

    public void setFtpuser(String ftpuser) {
        this.ftpuser = ftpuser == null ? null : ftpuser.trim();
    }

    public String getFtpport() {
        return ftpport;
    }

    public void setFtpport(String ftpport) {
        this.ftpport = ftpport;
    }

    public void setTelnetport(String telnetport) {
        this.telnetport = telnetport;
    }

    public String getFtppassword() {
        return ftppassword;
    }

    public void setFtppassword(String ftppassword) {
        this.ftppassword = ftppassword == null ? null : ftppassword.trim();
    }

    public String getTelnetuser() {
        return telnetuser;
    }

    public void setTelnetuser(String telnetuser) {
        this.telnetuser = telnetuser == null ? null : telnetuser.trim();
    }

    public String getDataversion() {
        return dataversion;
    }

    public void setDataversion(String dataversion) {
        this.dataversion = dataversion == null ? null : dataversion.trim();
    }

    public String getTelnetpassword() {
        return telnetpassword;
    }

    public void setTelnetpassword(String telnetpassword) {
        this.telnetpassword = telnetpassword == null ? null : telnetpassword.trim();
    }

	public String getOmmversion() {
		return ommversion;
	}

	public void setOmmversion(String ommversion) {
		this.ommversion = ommversion;
	}
	
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    public String getTelnetport() {
        return telnetport;
    }
}
