/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_loan;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.event.TableSelectPhaseListener;
import java.util.Date;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Add.java
 * @version Created on Jun 12, 2009, 2:45:09 PM
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
        para_borrowersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Add.para_borrowersRowSet}"));
        para_borrowersRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_borrowersRowSet.setCommand("SELECT * FROM para_borrowers");
        para_borrowersRowSet.setTableName("para_borrowers");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Add.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM para_inventory WHERE `status` != 'loan'");
        para_inventoryRowSet.setTableName("para_inventory");
        para_loanDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Add.para_loanRowSet}"));
        para_loanRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_loanRowSet.setCommand("SELECT * FROM para_loan");
        para_loanRowSet.setTableName("para_loan");
    }
    private CachedRowSetDataProvider para_borrowersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_borrowersDataProvider() {
        return para_borrowersDataProvider;
    }

    public void setPara_borrowersDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_borrowersDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_borrowersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_borrowersRowSet() {
        return para_borrowersRowSet;
    }

    public void setPara_borrowersRowSet(CachedRowSetXImpl crsxi) {
        this.para_borrowersRowSet = crsxi;
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
    private DropDown nricDD = new DropDown();

    public DropDown getNricDD() {
        return nricDD;
    }

    public void setNricDD(DropDown dd) {
        this.nricDD = dd;
    }
    private StaticText nameST = new StaticText();

    public StaticText getNameST() {
        return nameST;
    }

    public void setNameST(StaticText st) {
        this.nameST = st;
    }
    private StaticText unitST = new StaticText();

    public StaticText getUnitST() {
        return unitST;
    }

    public void setUnitST(StaticText st) {
        this.unitST = st;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TableSelectPhaseListener tablePhaseListener = new TableSelectPhaseListener();

    public void setSelected(Object object) {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        if (rowKey != null) {
            tablePhaseListener.setSelected(rowKey, object);
        }
    }

    public Object getSelected() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return tablePhaseListener.getSelected(rowKey);

    }

    public Object getSelectedValue() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return (rowKey != null) ? rowKey.getRowId() : null;

    }

    public boolean getSelectedState() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return tablePhaseListener.isSelected(rowKey);
    }
    private CachedRowSetDataProvider para_loanDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_loanDataProvider() {
        return para_loanDataProvider;
    }

    public void setPara_loanDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_loanDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_loanRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_loanRowSet() {
        return para_loanRowSet;
    }

    public void setPara_loanRowSet(CachedRowSetXImpl crsxi) {
        this.para_loanRowSet = crsxi;
    }
    private Calendar calendar1 = new Calendar();

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
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
        if (nricDD.getSelected() == null) {
            Object firstSelected = null;
            try {
                para_borrowersDataProvider.cursorFirst();
                firstSelected = para_borrowersDataProvider.getValue("nric");
                nricDD.setSelected(firstSelected);
                //para_borrowersDataProvider.refresh();
                nameST.setText((String) para_borrowersDataProvider.getValue("rank") + " " + (String) para_borrowersDataProvider.getValue("name"));
                unitST.setText(para_borrowersDataProvider.getValue("unit"));
                calendar1.setValue(new Date());
            } catch (Exception ex) {
                log(" ERROR - para_loan.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        } else {
            Object nric = nricDD.getSelected();
            try {
                para_borrowersDataProvider.setCursorRow(para_borrowersDataProvider.findFirst("nric", nric));
                //para_borrowersDataProvider.refresh();
                nameST.setText((String) para_borrowersDataProvider.getValue("rank") + " " + (String) para_borrowersDataProvider.getValue("name"));
                unitST.setText(para_borrowersDataProvider.getValue("unit"));
                calendar1.setValue(new Date());
            } catch (Exception ex) {
                log(" ERROR - para_loan.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        }
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
        para_borrowersDataProvider.close();
        para_inventoryDataProvider.close();
        para_loanDataProvider.close();
    }

    public String loan_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        if (selectedRows > 0) {
            RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
            for (int i = 0; i < selectedRowKeys.length; i++) {
                int rowId = Integer.parseInt(selectedRowKeys[i].getRowId()) + 1;
                info("Row " + rowId + " is selected");
                log("Row " + rowId + " is selected");

                if (para_loanDataProvider.canAppendRow()) {
                    para_inventoryDataProvider.setCursorRow(selectedRowKeys[i]);

                    RowKey appendRow = para_loanDataProvider.appendRow();
                    para_loanDataProvider.setCursorRow(appendRow);
                    para_loanDataProvider.setValue("nric", nricDD.getValue());
                    para_loanDataProvider.setValue("type_prefix_no", para_inventoryDataProvider.getValue("type_prefix_no"));
                    para_loanDataProvider.setValue("chute_no", para_inventoryDataProvider.getValue("chute_no"));
                    para_loanDataProvider.setValue("serial_no", para_inventoryDataProvider.getValue("serial_no"));
                    para_loanDataProvider.setValue("date_out", calendar1.getValue());
                    para_loanDataProvider.commitChanges();

                    para_inventoryDataProvider.setValue("status", "loan");
                    para_inventoryDataProvider.commitChanges();
                } else {
                    log(" ERROR - para_loan.Add : Cannot append row");
                    error(" ERROR - Cannot append row");
                    return null;
                }
            }
            return "addToView";
        } else {
            log(" INFO - para_loan.Add : No row selected");
            info(" INFO - Please select a row.");
            return null;
        }
    }

    public void nricDD_processValueChange(ValueChangeEvent vce) {
    }
}
