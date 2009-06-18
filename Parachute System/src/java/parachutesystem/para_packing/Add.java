/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_packing;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Add.java
 * @version Created on Jun 3, 2009, 3:50:26 PM
 * @author Dell
 */
public class Add extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        statusDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("serviceable", "serviceable"), new com.sun.webui.jsf.model.Option("servicing", "servicing"), new com.sun.webui.jsf.model.Option("loan", "loan"), new com.sun.webui.jsf.model.Option("returned", "returned")});
        checkTypeDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("repacking", "repacking"), new com.sun.webui.jsf.model.Option("inspection", "inspection")});
        para_packingDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_packingRowSet}"));
        para_packingRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_packingRowSet.setCommand("SELECT * FROM `PARACHUTE_SYSTEM`.para_packing");
        para_packingRowSet.setTableName("para_packing");
        para_riggersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_riggersRowSet}"));
        para_riggersRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_riggersRowSet.setCommand("SELECT ALL para_riggers.`NRIC`, para_riggers.name, para_riggers.rank, para_riggers.rigger, para_riggers.inspector  FROM para_riggers WHERE para_riggers.rigger = 1");
        para_riggersRowSet.setTableName("para_riggers");
        para_riggersDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_riggersRowSet1}"));
        para_riggersRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_riggersRowSet1.setCommand("SELECT ALL para_riggers.`NRIC`, para_riggers.name, para_riggers.rank, para_riggers.rigger, para_riggers.inspector  FROM para_riggers WHERE para_riggers.inspector = 1");
        para_riggersRowSet1.setTableName("para_riggers");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Add.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM para_inventory");
        para_inventoryRowSet.setTableName("para_inventory");
    }
    private SingleSelectOptionsList statusDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStatusDDDefaultOptions() {
        return statusDDDefaultOptions;
    }

    public void setStatusDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.statusDDDefaultOptions = ssol;
    }
    private SingleSelectOptionsList checkTypeDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getCheckTypeDDDefaultOptions() {
        return checkTypeDDDefaultOptions;
    }

    public void setCheckTypeDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.checkTypeDDDefaultOptions = ssol;
    }
    private CachedRowSetDataProvider para_packingDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getpara_packingDataProvider() {
        return para_packingDataProvider;
    }

    public void setpara_packingDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_packingDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_packingRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getpara_packingRowSet() {
        return para_packingRowSet;
    }

    public void setpara_packingRowSet(CachedRowSetXImpl crsxi) {
        this.para_packingRowSet = crsxi;
    }
    private CachedRowSetDataProvider para_riggersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_riggersDataProvider() {
        return para_riggersDataProvider;
    }

    public void setPara_riggersDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_riggersDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_riggersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_riggersRowSet() {
        return para_riggersRowSet;
    }

    public void setPara_riggersRowSet(CachedRowSetXImpl crsxi) {
        this.para_riggersRowSet = crsxi;
    }
    private CachedRowSetDataProvider para_riggersDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_riggersDataProvider1() {
        return para_riggersDataProvider1;
    }

    public void setPara_riggersDataProvider1(CachedRowSetDataProvider crsdp) {
        this.para_riggersDataProvider1 = crsdp;
    }
    private CachedRowSetXImpl para_riggersRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_riggersRowSet1() {
        return para_riggersRowSet1;
    }

    public void setPara_riggersRowSet1(CachedRowSetXImpl crsxi) {
        this.para_riggersRowSet1 = crsxi;
    }
    private Calendar repackDateCal = new Calendar();

    public Calendar getRepackDateCal() {
        return repackDateCal;
    }

    public void setRepackDateCal(Calendar c) {
        this.repackDateCal = c;
    }
    private DropDown packByDD = new DropDown();

    public DropDown getPackByDD() {
        return packByDD;
    }

    public void setPackByDD(DropDown dd) {
        this.packByDD = dd;
    }
    private DropDown inspectByDD = new DropDown();

    public DropDown getInspectByDD() {
        return inspectByDD;
    }

    public void setInspectByDD(DropDown dd) {
        this.inspectByDD = dd;
    }
    private DropDown checkTypeDD = new DropDown();

    public DropDown getCheckTypeDD() {
        return checkTypeDD;
    }

    public void setCheckTypeDD(DropDown dd) {
        this.checkTypeDD = dd;
    }
    private DropDown statusDD = new DropDown();

    public DropDown getStatusDD() {
        return statusDD;
    }

    public void setStatusDD(DropDown dd) {
        this.statusDD = dd;
    }
    private CachedRowSetDataProvider para_inventoryDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_inventoryDataProvider() {
        return para_inventoryDataProvider;
    }

    public void setPara_inventoryDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_inventoryDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_inventoryRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet() {
        return para_inventoryRowSet;
    }

    public void setPara_inventoryRowSet(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet = crsxi;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Add() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Add Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        para_packingDataProvider.close();
        para_riggersDataProvider.close();
        para_riggersDataProvider1.close();
        para_inventoryDataProvider.close();
    }

    public String update_action() {
        try {
            if (para_packingDataProvider.canAppendRow()) {
                RowKey appendedRow = para_packingDataProvider.appendRow();

                String[] fieldKeys = {"para_inventory.type_prefix_no", "para_inventory.chute_no", "para_inventory.serial_no"};
                Object[] values = {getParaPackingBean().getParaTypeNo(), getParaPackingBean().getChuteNo(), getParaPackingBean().getSerialNo()};
                RowKey[] rks = para_inventoryDataProvider.findAll(fieldKeys, values);

                if (appendedRow != null && rks.length == 1) {
                    para_packingDataProvider.setCursorRow(appendedRow);
                    para_packingDataProvider.setValue("para_packing.type_prefix_no", getParaPackingBean().getParaTypeNo());
                    para_packingDataProvider.setValue("para_packing.chute_no", getParaPackingBean().getChuteNo());
                    para_packingDataProvider.setValue("para_packing.serial_no", getParaPackingBean().getSerialNo());
                    para_packingDataProvider.setValue("para_packing.date_packed", getRepackDateCal().getValue());
                    para_packingDataProvider.setValue("para_packing.pack_by", getPackByDD().getSelected());
                    para_packingDataProvider.setValue("para_packing.inspect_by", getInspectByDD().getSelected());
                    para_packingDataProvider.setValue("para_packing.check_type", getCheckTypeDD().getSelected());

                    para_inventoryDataProvider.setCursorRow(rks[0]);
                    para_inventoryDataProvider.setValue("para_inventory.status", getStatusDD().getSelected());
                    // set values of other fields, if any
                    para_packingDataProvider.commitChanges();
                    para_packingDataProvider.refresh();

                    para_inventoryDataProvider.commitChanges();
                    para_inventoryDataProvider.refresh();
                    return "addToView";
                } else {
                    log(" ERROR - para_packing.Add : Too many parachutes");
                    error(" ERROR - Too many parachutes");
                    return null;
                }

            } else {
                log(" ERROR - para_packing.Add : Cannot append row");
                error(" ERROR - Cannot append row");
                return null;
            }
        } catch (Exception ex) {
            log(" ERROR - para_packing.Add : Error Description", ex);
            error(" ERROR - " + ex.getMessage());
            return null;
        }
    }

    protected ParaPackingBean getParaPackingBean() {
        return (ParaPackingBean) getBean("para_packing$ParaPackingBean");
    }
}

