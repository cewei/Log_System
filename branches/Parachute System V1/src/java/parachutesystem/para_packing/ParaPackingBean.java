/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parachutesystem.para_packing;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class ParaPackingBean {
    private String serialNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    private String chuteNo;

    public String getChuteNo() {
        return chuteNo;
    }

    public void setChuteNo(String chuteNo) {
        this.chuteNo = chuteNo;
    }
    private long paraTypeNo;

    public long getParaTypeNo() {
        return paraTypeNo;
    }

    public void setParaTypeNo(long paraTypeNo) {
        this.paraTypeNo = paraTypeNo;
    }
    private String chute_No;

    public String getChute_No() {
        return chute_No;
    }

    public void setChute_No(String chute_No) {
        this.chute_No = chute_No;
    }
    private Date datePacked;

    public Date getDatePacked() {
        return datePacked;
    }

    public void setDatePacked(Date datePacked) {
        this.datePacked = datePacked;
    }
    private String packBy;

    public String getPackBy() {
        return packBy;
    }

    public void setPackBy(String packBy) {
        this.packBy = packBy;
    }
    private String inspectBy;

    public String getInspectBy() {
        return inspectBy;
    }

    public void setInspectBy(String inspectBy) {
        this.inspectBy = inspectBy;
    }
    private String checkType;

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
